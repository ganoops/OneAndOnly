package k4star.oneandonly.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import k4star.oneandonly.model.dto.BoardDTO;
import k4star.oneandonly.model.service.SNSService;


public class InsertBoardAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse respons) throws ServletException, IOException {
		try {
			HttpSession session = request.getSession();
			String sessionEmail = (String) session.getAttribute("userEmail");
			
			SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
			String today = df.format(new Date());
			
			//���� ���� ���
			String saveDir = request.getServletContext().getRealPath("/")+"save/"+sessionEmail+"/"+today;
			int maxSize = 1024*1024*100;
			String encoding = "UTF-8";
			
			//������ ���ٸ�
			File saveDir2 = new File(saveDir);
			if(!saveDir2.exists()) {//������ ����
				saveDir2.mkdirs();//�������� ������ ������������ ����
			}
			
			//�̹��� ���ε�
			MultipartRequest m = new MultipartRequest(request, saveDir, maxSize, encoding, 
					new DefaultFileRenamePolicy());
			
			String content = m.getParameter("content");
			content = content.replaceAll(",", "&lt;");
			String photo = "save/"+sessionEmail+"/"+today+"/"+m.getFilesystemName("file");
			
			//boardDTO
			BoardDTO board = new BoardDTO(sessionEmail, content, photo);
			
			SNSService service = new SNSService();
			service.insertBoard(board);
			respons.sendRedirect("index.jsp");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
