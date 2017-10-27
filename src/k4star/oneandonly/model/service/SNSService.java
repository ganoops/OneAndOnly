package k4star.oneandonly.model.service;

import java.util.List;

import k4star.oneandonly.model.dto.BoardDTO;
import k4star.oneandonly.model.dto.CommentDTO;
import k4star.oneandonly.model.dto.LikeDTO;
import k4star.oneandonly.model.dto.NoticeDTO;
import k4star.oneandonly.model.dto.UserDTO;

public class SNSService {
	//private static DAO dao   = new ElecDaoImpl();
	
	/**
	 * ȸ������(InsertUser)
	 * @param : UserDTO
	 * @return : 1�̸� ����, �ƴϸ� ����
	 * */
	public static int insertUser(UserDTO userDTO) throws Exception{
		return 0;
	}
	/**
	 * �α���(SelectUser)
	 * @param : email, pass
	 * @return : true ����, false ����
	 * */
	public static boolean selectUser(String email, String pass) throws Exception{
		return false;
	}
	/**
	 * ȸ������(UpdateUser)
	 * @param : UserDTO
	 * @return : 1�̸� ����, �ƴϸ� ����
	 * */
	public static int updateUser(UserDTO userDTO) throws Exception{
		return 0;
	}
	/**
	 * ȸ������(deleteUser)
	 * @param : email, pass
	 * @return : 1�̸� ����, �ƴϸ� ����
	 * */
	public static int deleteUser(String Email, String pass) throws Exception{
		return 0;
	}
	/**
	 * �Խù��ۼ�(InsertBoard)
	 * @param : email, pass
	 * @return : 1�̸� ����, �ƴϸ� ����
	 * */
	public static int insertBoard(BoardDTO boardDTO) throws Exception{
		return 0;
	}
	/**
	 * �Խù� ����(updateBoard)
	 * @param : BoardDTO
	 * @return : 1�̸� ����, �ƴϸ� ����
	 * */
	public static int updateBoard(BoardDTO boardDTO) throws Exception{
		return 0;
	}
	/**
	 * �Խù� ����(DeleteBoard)
	 * @param : BoardDTO
	 * @return : 1�̸� ����, �ƴϸ� ����
	 * */
	public static int deleteBoard(int boardNum) throws Exception{
		return 0;
	}
	/**
	 * �����Խù� ��������
	 * @param : writer
	 * @return : List<BoardDTO>
	 * */
	public static List<BoardDTO> selectBoardWriter(String writer) throws Exception{
		return null;
	}
	/**
	 * �����ǵ�
	 * @param : writer
	 * @return : List<BoardDTO>
	 * */
	public static List<BoardDTO> selectNewspeed(String email) throws Exception{
		return null;
	}
	/**
	 * �Խù� �󼼺���
	 * @param : writer
	 * @return : BoardDTO
	 * */
	public static BoardDTO selectBoardNum(String boardNum) throws Exception{
		return null;
	}
	/**
	 * �˸� ����
	 * @param : NoticeDTO
	 * @return : BoardDTO
	 * */
	public static int insertNotice(NoticeDTO noticeDTO) throws Exception{
		return 0;
	}
	/**
	 * �˸� ��������
	 * @param : writer
	 * @return : BoardDTO
	 * */
	public static List<NoticeDTO> selectNotice(String name) throws Exception{
		return null;
	}
	/**
	 * ��� �ۼ��ϱ�
	 * @param : writer
	 * @return : BoardDTO
	 * */
	public static int insertComment(CommentDTO commentDTO) throws Exception{
		return 0;
	}
	/**
	 * ��� �����ϱ�
	 * @param : writer
	 * @return : BoardDTO
	 * */
	public static int deleteComment(int commentNum) throws Exception{
		return 0;
	}
	/**
	 * ��� ��������
	 * @param : writer
	 * @return : BoardDTO
	 * */
	public static List<CommentDTO> selectComment(int commentNum) throws Exception{
		return null;
	}
	/**
	 * ���ƿ� ����
	 * @param : writer
	 * @return : BoardDTO
	 * */
	public static int updateLike(LikeDTO likeDTO) throws Exception{
		return 0;
	}
	/**
	 * �ؽ��±� �˻�
	 * @param : writer
	 * @return : BoardDTO
	 * */
	public static List<BoardDTO> selectByHash(String hash) throws Exception{
		return null;
	}
	/**
	 * ������ �˻�
	 * @param : writer
	 * @return : BoardDTO
	 * */
	public static List<UserDTO> selectUser(String name) throws Exception{
		return null;
	}
	/**
	 * �ȷο� ����
	 * @param : writer
	 * @return : BoardDTO
	 * */
	public static int insertFollow(String mynic, String nic) throws Exception{
		return 0;
	}
	/**
	 * �ȷο� ����
	 * @param : writer
	 * @return : BoardDTO
	 * */
	public static int deleteFollow(String mynic, String nic) throws Exception{
		return 0;
	}
	/**
	 * �ȷο� �˻�
	 * @param : writer
	 * @return : BoardDTO
	 * */
	public static List<UserDTO> selectFollow(String mynic) throws Exception{
		return null;
	}
	
}



