package k4star.oneandonly.controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import k4star.oneandonly.model.dao.OneandOnlyDAO;
import k4star.oneandonly.model.dao.OneandOnlyDAOImpl;
import k4star.oneandonly.model.dto.BoardDTO;
import k4star.oneandonly.model.dto.UserDTO;
import k4star.oneandonly.model.service.SNSService;

public class SelectUserAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse respons) throws ServletException, IOException {
		
		SNSService service = new SNSService();
		HttpSession session = request.getSession();
		
		String userEmail = request.getParameter("userEmail");
		String sessionEmail = (String) session.getAttribute("userEmail");
		
		try {
			//회원정보
			UserDTO userDTO = service.userDetailView(userEmail);
			//팔로워
			int follower = service.countFollower(userEmail);
			//팔로우
			int follow = service.countFollow(userEmail);
			//게시글
			List<BoardDTO> board = service.selectBoardListByNickname(userEmail);
			//다른 사람 계정으로 들어갈 경우 그 사람이 내가 팔로우 한 사람인지 체크
			// 0은 팔로우한 사람ㄴㄴ 1은 팔로우한 사람
			int followCheck = 0;
			if(!userEmail.equals(sessionEmail)) { //내 계정아님
				followCheck = service.followCheck(sessionEmail,userEmail);
			}
			if(userDTO == null) {
				throw new Exception("회원 값없음");
			}
			
			if(userDTO == null) {
				throw new Exception("회원 값없음");
			}
			
			request.setAttribute("user", userDTO);
			request.setAttribute("follower", follower);
			request.setAttribute("follow", follow);
			request.setAttribute("board", board);
			request.setAttribute("followCheck", followCheck);
			request.getRequestDispatcher("successView/UserDetailView.jsp").forward(request, respons);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
