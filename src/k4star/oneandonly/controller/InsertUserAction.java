package k4star.oneandonly.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import k4star.oneandonly.model.dao.OneandOnlyDAO;
import k4star.oneandonly.model.dao.OneandOnlyDAOImpl;
import k4star.oneandonly.model.dto.UserDTO;
import k4star.oneandonly.model.service.SNSService;

public class InsertUserAction implements Action {
	 public static void fileMake(String makeFileName) {
		  File f1 = new File(makeFileName);
		  try {
		   f1.createNewFile();
		  } catch (IOException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		 }
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		 response.setContentType("text/html; charset=UTF-8");   //�ѱۼ���
		    request.setCharacterEncoding("utf-8");    
		String saveDir=request.getServletContext().getRealPath("/save/a");
		File saveDir2 = new File(saveDir);
        if(!saveDir2.exists()) {//������ ����
           saveDir2.mkdirs();//�������� ������ ������������ ����
        }

		int maxSize=1024*1024*100; 
		String encoding="UTF-8";
		response.setContentType("text/html;charset=UTF-8");
		
		request.setCharacterEncoding("UTF-8");
		String url = "errView/errView.jsp";
		MultipartRequest m = 
		new MultipartRequest(request, saveDir, maxSize, encoding,new DefaultFileRenamePolicy());
		
		OneandOnlyDAO dao =new OneandOnlyDAOImpl();
		PrintWriter out = response.getWriter();
				
		String email = m.getParameter("userEmail");
		String password = m.getParameter("password");
		String phone = m.getParameter("phone");
		String introduce = m.getParameter("introduce");
		String nickname = m.getParameter("nickname");	
		String password2 = m.getParameter("password_confirm");
		  //���        
		  File targetDir = new File(request.getServletContext().getRealPath("/save")+"/"+email);
		
        String profile_pic = m.getOriginalFileName("profile_pic");
        String dir = "save/"+email+"/"+profile_pic;
        
        
		UserDTO dto = new UserDTO(nickname,dir, email, password, phone, introduce, "");

		try {
			boolean result2 = true;
			char ch;
			int i;
			 File[] a=saveDir2.listFiles();
			if(email.equals("")) {
				out.println("<script>alert('�̸����� �Է����ּ���');history.back();</script>");
				result2 = false;
			}
			else if(SNSService.duplicateIdCheck(email)) {
				out.println("<script>alert('�̸��� �ߺ��Դϴ�');history.back();</script>");
				result2 = false;
			}
			else if(password.equals("")) {
				out.println("<script>alert('��й�ȣ�� �Է����ּ���');history.back();</script>");
				result2 = false;
			}else if (password.trim().indexOf(" ") >= 0) {
				out.println("<script>alert('����������');history.back();</script>");
				result2 =  false;
	        }
			else if (password.length()<6 || password.length()>15) {
				out.println("<script>alert('��й�ȣ�� 6�� �̻� 15�� ���Ϸ� �Է����ּ���');history.back();</script>");
				result2 = false;
	        }else if(password2.equals("") || password2.equals(password)==false) {
				out.println("<script>alert('��й�ȣ �ٽ� �ѹ� Ȯ��!!!');history.back();</script>");
				result2 = false;
			}
	        else if(phone.equals("")) {
				out.println("<script>alert('�ڵ��� ��ȣ�� �Է����ּ���');history.back();</script>");
				result2 = false;
			}
			else if (phone.trim().indexOf(" ") >= 0) {
				out.println("<script>alert('����������');history.back();</script>");
				result2 =  false;
	        }else if (phone.length()>11) {
				out.println("<script>alert('�г����� 11�� ���Ϸ� �Է����ּ���');history.back();</script>");
				result2 = false;
	        }
			
	        else if(introduce.equals("")) {
				out.println("<script>alert('�ڱ�Ұ��� �Է����ּ���');history.back();</script>");
				result2 = false;
			}else if(introduce.length()>300){
				out.println("<script>alert('�ڱ�Ұ��� 150���̳��� �Է����ּ���');history.back();</script>"); 
	            result2 =  false;
	          }
			else if(nickname.equals("")) {
				out.println("<script>alert('�г����� �Է����ּ���');history.back();</script>");
				result2 = false;
			}else if (nickname.length()<4 || nickname.length()>15) {
				out.println("<script>alert('�г����� 4�� �̻� 15�� ���Ϸ� �Է����ּ���');history.back();</script>");
				result2 = false;
	        }
		   
		   else if (nickname.trim().indexOf(" ") >= 0) {
				out.println("<script>alert('����������');history.back();</script>");
				result2 =  false;
	        }
		   else if(SNSService.duplicateNickCheck(nickname)) {
				out.println("<script>");
				out.println("alert('�г��� �ߺ��Դϴ�');");
				out.println("history.back();");
				out.println("</script>");
				result2 = false;
		   }
			if(result2 ==  false) {
				System.out.println(saveDir2);
				for(i =0; i<a.length;i++){
				    a[i].delete();
				}
				saveDir2.delete();
				targetDir.delete();
			}
		   else if(result2 == true) {
			   if(!targetDir.exists()) {    //���丮 ������ ����.
					saveDir2.renameTo(targetDir);
				}
				int result = SNSService.join(dto);
				if(result == 1) {
					url = "successView/LoginForm.jsp";
					response.sendRedirect(url);
				}
			}
			
			///
			for (i = 0; i < nickname.length(); i++) {
	            ch = nickname.charAt(i);
	            if (!(ch >= '0' && ch <= '9') && !(ch >= 'a' && ch <= 'z')&&!(ch >= 'A' && ch <= 'Z')) {
	            	out.println("<script>alert('�г����� ��ҹ���, ���� �Է����ּ���');history.back();</script>"); 
		            result2 =  false;
	            }
	        }
			for (i = 0; i < phone.length(); i++) {
		        ch =  phone.charAt(i);
		        if (!(ch >= '0' && ch <= '9')) {
		        	out.println("<script>alert('�ڵ��� ��ȣ�� ���ڸ� �Է����ּ���');history.back();</script>"); 
		            result2 =  false;
		        }
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
}
