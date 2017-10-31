package k4star.oneandonly.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import k4star.oneandonly.model.dto.UserDTO;
import k4star.oneandonly.model.service.SNSService;

public class UpdateFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String url="errorView/errorView.jsp";
		try{
			if(email==null){
				throw new Exception("해당 계정명이 없습니다.");
			}
			UserDTO user = SNSService.userDetailView(email);
			System.out.println(user.getProfile_pic());
			System.out.println(user.getEmail());
			if(user==null){
				throw new Exception("해당하는 계정이 없습니다.");
			}else{
				request.setAttribute("user", user);
				url="successView/userUpdate.jsp";
			}
		}catch(Exception e){
			e.printStackTrace();
			request.setAttribute("errorMsg", e.getMessage());
		}
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
