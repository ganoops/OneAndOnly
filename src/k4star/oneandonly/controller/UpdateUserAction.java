package k4star.oneandonly.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import k4star.oneandonly.model.dto.UserDTO;
import k4star.oneandonly.model.service.SNSService;

public class UpdateUserAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String saveDir = request.getServletContext().getRealPath("/save")+"/"+request.getParameter("email");
        File targetDir = new File(saveDir);
        if(!targetDir.exists()) {    //디렉토리 없으면 생성.
            targetDir.mkdirs();
        }
		String encoding = "UTF-8";
		int maxSize = 1024*1024*100;//100M
		
		MultipartRequest m = new MultipartRequest(request, saveDir, maxSize, encoding, new DefaultFileRenamePolicy());
		
		String nickname = m.getParameter("nickname");
		String phone = m.getParameter("phone");
		String email = m.getParameter("email");
		String introduce = m.getParameter("introduce");
		
		String fName = m.getFilesystemName("file");
		
		String resultMessage = "프로필 저장 실패하였습니다.";
		
		UserDTO user = new UserDTO(nickname,  fName, email, phone, introduce);
		
		try {
			int result = SNSService.updateUser(user);
			if(result > 0) {
				resultMessage = "프로필 저장 완료하였습니다.";
			}
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg", e.getMessage());
		}
		
		PrintWriter out = response.getWriter();
		out.println(resultMessage);
	}
}
