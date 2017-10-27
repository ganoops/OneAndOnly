package k4star.oneandonly.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse respons) throws ServletException, IOException {
		System.out.println("Action!");
		
	}

}
