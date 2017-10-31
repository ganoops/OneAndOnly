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
		String result = "<font color='green'>사용 가능한 아이디입니다.</font>";
		try{
			if(nickname==null){
				throw new Exception("해당 계정명이 없습니다.");
			}
			if(SNSService.nicknameCheck(nickname)) {
				result = "<font color='red'>이미 사용 중인 아이디입니다.</font>";
			}
		}catch(Exception e){
			e.printStackTrace();
			request.setAttribute("errorMsg", e.getMessage());
		}
		PrintWriter out = response.getWriter();
		out.println(result);

	}

}
