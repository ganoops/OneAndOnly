package k4star.oneandonly.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import k4star.oneandonly.model.dto.BoardDTO;
import k4star.oneandonly.model.dto.UserDTO;
import k4star.oneandonly.model.service.SNSService;

public class SelectUserAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse respons) throws ServletException, IOException {
		
		SNSService service = new SNSService();
		String userEmail = request.getParameter("userEmail");
		try {
			//ȸ������
			UserDTO userDTO = service.userDetailView(userEmail);
			//�ȷο�
			int follower = service.countFollower(userEmail);
			//�ȷο�
			int follow = service.countFollow(userEmail);
			//�Խñ�
			List<BoardDTO> board = service.selectBoardListByNickname(userEmail);

			if(userDTO == null) {
				throw new Exception("ȸ�� ������");
			}
			
			request.setAttribute("user", userDTO);
			request.setAttribute("follower", follower);
			request.setAttribute("follow", follow);
			request.setAttribute("board", board);
			request.getRequestDispatcher("successView/UserDetailView.jsp").forward(request, respons);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
