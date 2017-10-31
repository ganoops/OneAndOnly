package k4star.oneandonly.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;

import k4star.oneandonly.model.dto.BoardDTO;
import k4star.oneandonly.model.service.SNSService;
import sun.print.resources.serviceui;

public class SelectBoardAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse respons) throws ServletException, IOException {
		//뉴스피드 게시글 불러오기
		SNSService service = new SNSService();
		HttpSession session = request.getSession();
		
		String email = (String) session.getAttribute("userEmail");
		try {
			List<BoardDTO> list = service.selectBoard(email);
			request.setAttribute("list", list);
			request.getRequestDispatcher("successView/NewsfeedView.jsp").forward(request, respons);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
