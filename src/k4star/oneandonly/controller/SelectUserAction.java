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
			//ȸ������
			UserDTO userDTO = service.userDetailView(userEmail);
			//�ȷο�
			int follower = service.countFollower(userEmail);
			//�ȷο�
			int follow = service.countFollow(userEmail);
			//�Խñ�
			List<BoardDTO> board = service.selectBoardListByNickname(userEmail);
			//�ٸ� ��� �������� �� ��� �� ����� ���� �ȷο� �� ������� üũ
			// 0�� �ȷο��� ������� 1�� �ȷο��� ���
			int followCheck = 0;
			if(!userEmail.equals(sessionEmail)) { //�� �����ƴ�
				followCheck = service.followCheck(sessionEmail,userEmail);
			}
			if(userDTO == null) {
				throw new Exception("ȸ�� ������");
			}
			
			if(userDTO == null) {
				throw new Exception("ȸ�� ������");
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
