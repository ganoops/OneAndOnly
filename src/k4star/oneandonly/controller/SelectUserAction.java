package k4star.oneandonly.controller;

import java.io.IOException;
<<<<<<< HEAD
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import k4star.oneandonly.model.dao.OneandOnlyDAO;
import k4star.oneandonly.model.dao.OneandOnlyDAOImpl;
import k4star.oneandonly.model.service.SNSService;

public class SelectUserAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		request.setCharacterEncoding("UTF-8");
		String url = "errView/errView.jsp";
		String email = request.getParameter("userEmail");
		String password = request.getParameter("password");
		OneandOnlyDAO dao =new OneandOnlyDAOImpl();
		PrintWriter out = response.getWriter();
		try {
			boolean result = SNSService.login(email, password);	
			if(result == false) {
				out.println("<script>");
				out.println("alert('��й�ȣ�� Ȯ�����ּ���');");
				out.println("history.back();");
				out.println("</script>");
			}else {
				url  = "successView/NewsfeedView.jsp";
				request.getRequestDispatcher(url).forward(request, response);
			}
		} catch (Exception e) {
=======
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
>>>>>>> branch 'master' of https://github.com/ganoops/OneAndOnly
			e.printStackTrace();
		}
		
	}

}
