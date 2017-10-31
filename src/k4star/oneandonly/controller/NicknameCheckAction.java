package k4star.oneandonly.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import k4star.oneandonly.model.dto.UserDTO;
import k4star.oneandonly.model.service.SNSService;

public class NicknameCheckAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String nickname = request.getParameter("nickname");
		String url="errView/errView.jsp";
		String result = "<font color='green'>��� ������ ���̵��Դϴ�.</font>";
		try{
			if(nickname==null){
				throw new Exception("�ش� �������� �����ϴ�.");
			}
			if(SNSService.nicknameCheck(nickname)) {
				result = "<font color='red'>�̹� ��� ���� ���̵��Դϴ�.</font>";
			}
		}catch(Exception e){
			e.printStackTrace();
			request.setAttribute("errorMsg", e.getMessage());
		}
		PrintWriter out = response.getWriter();
		out.println(result);

	}

}
