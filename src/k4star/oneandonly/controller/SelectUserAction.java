package k4star.oneandonly.controller;

import java.io.IOException;
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
				out.println("alert('비밀번호를 확인해주세요');");
				out.println("history.back();");
				out.println("</script>");
			}else {
				url  = "successView/NewsfeedView.jsp";
				request.getRequestDispatcher(url).forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
