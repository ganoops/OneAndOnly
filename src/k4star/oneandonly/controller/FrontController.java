package k4star.oneandonly.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("/oao")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Map<String, Action> map ;
	@Override
	public void init() throws ServletException {
		map = (Map<String, Action>)super.getServletContext().getAttribute("map");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   //parameter�� �Ѿ���� command �� �ޱ�
		String key = request.getParameter("command");//encType������� null
		if(key==null) key="list";
		
		Action action = map.get(key);
		try {
			action.execute(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}





