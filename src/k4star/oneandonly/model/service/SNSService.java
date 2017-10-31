package k4star.oneandonly.model.service;

import java.sql.SQLException;
import java.util.List;

import k4star.oneandonly.model.dao.OneandOnlyDAO;
import k4star.oneandonly.model.dao.OneandOnlyDAOImpl;
import k4star.oneandonly.model.dto.BoardDTO;
import k4star.oneandonly.model.dto.CommentDTO;
import k4star.oneandonly.model.dto.LikeDTO;
import k4star.oneandonly.model.dto.NoticeDTO;
import k4star.oneandonly.model.dto.UserDTO;

public class SNSService {
	private static OneandOnlyDAO dao   = new OneandOnlyDAOImpl();
	
	/**
	 * ȸ������(join)
	 * @param : UserDTO
	 * @return : 1�̸� ����, �ƴϸ� ����
	 * */
	public static int join(UserDTO userDTO) throws Exception{
		int result = dao.join(userDTO);
		return result;
	}
	/**
	 * �α���(login)
	 * @param : email, pass
	 * @return : true ����, false ����
	 * */
	public static boolean login(String email, String password) throws Exception{
		boolean result = dao.login(email, password);
		return result;
	}
	/**
	 * ȸ������(updateUser)
	 * @param : UserDTO
	 * @return : 1�̸� ����, �ƴϸ� ����
	 * */
	public static int updateUser(UserDTO userDTO) throws Exception{
		return 0;
	}
	/**
	 * ȸ�� �� ����
	 * @param name
	 * @return
	 * @throws SQLException
	 */
	UserDTO userDetailView(String nickname) throws SQLException{
		return null;
	};
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
	public static List<BoardDTO> selectBoardListByNickname(String writer) throws Exception{
		return null;
	}
	/**
	 * �����ǵ�
	 * @param : writer
	 * @return : List<BoardDTO>
	 * */
	public static List<BoardDTO> selectNewsFeed(String email) throws Exception{
		return null;
	}
	/**
	 * �̸��� �ߺ� üũ
	 * @param email
	 * @return true�� ���� ����, false�� �ߺ�
	 * @throws Exception
	 */
	public static boolean duplicateIdCheck(String email) throws SQLException{
		boolean result = dao.duplicateIdCheck(email);
		return result;
	}
	/**
	 * �г��� �ߺ� üũ
	 * @param nickName
	 * @return true�� ���� ����, false�� �ߺ�
	 * @throws Exception
	 */
	public static boolean duplicateNickCheck(String nickName) throws SQLException{
		boolean result = dao.duplicateNickCheck(nickName);
		return result;
	}
	/**
	 * �Խù� �󼼺���
	 * @param : writer
	 * @return : BoardDTO
	 * */
	public static BoardDTO selectBoardByNum(String boardNum) throws Exception{
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
	public static List<NoticeDTO> selectNotice(String nickname) throws Exception{
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
	 * '���ƿ�' ����
	 * @param dto
	 * @return
	 * @throws SQLException
	 */
	int insertLike(LikeDTO dto) throws SQLException{
		return 0;
	};
	
	/**
	 * '���ƿ�' ����
	 * @param dto
	 * @return
	 * @throws SQLException
	 */
	int deleteLike(LikeDTO dto) throws SQLException{
		return 0;
	};
	
	/**
	 * �ؽ��±� �˻�
	 * @param : writer
	 * @return : BoardDTO
	 * */
	public static List<BoardDTO> searchByHashtag(String hash) throws Exception{
		return null;
	}
	/**
	 * ������ �˻�
	 * @param : writer
	 * @return : BoardDTO
	 * */
	public static List<UserDTO> searchByNickname(String nickname) throws Exception{
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



