package k4star.oneandonly.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;

import org.apache.jasper.tagplugins.jstl.core.Out;

import k4star.oneandonly.model.service.SNSService;

public class InsertFollowAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse respons) throws ServletException, IOException {
		SNSService service = new SNSService();
		
		HttpSession session = request.getSession();
		PrintWriter out = respons.getWriter();
		String mynic = (String) session.getAttribute("userEmail");
		String nic = request.getParameter("email");
		try {
			int chk = service.insertFollow(mynic, nic);
			out.println(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
