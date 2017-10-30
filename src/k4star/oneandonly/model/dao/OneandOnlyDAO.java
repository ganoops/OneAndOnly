package k4star.oneandonly.model.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import k4star.oneandonly.model.dto.BoardDTO;
import k4star.oneandonly.model.dto.CommentDTO;
import k4star.oneandonly.model.dto.LikeDTO;
import k4star.oneandonly.model.dto.NoticeDTO;
import k4star.oneandonly.model.dto.UserDTO;

public interface OneandOnlyDAO {
	
	/**
	 * ȸ������
	 * @param dto
	 * @return
	 * @throws SQLException
	 */
	int join(UserDTO dto) throws SQLException;
	
	/**
	 * �α���
	 * @param id
	 * @param pw
	 * @return
	 * @throws SQLException
	 */
	boolean login(String id, String pw) throws SQLException;
	
	/**
	 * ȸ�� ���� ����
	 * @param dto
	 * @return
	 * @throws SQLException
	 */
	int updateUser(UserDTO dto) throws SQLException;
	
	/**
	 * ȸ�� �� ����
	 * @param name
	 * @return
	 * @throws SQLException
	 */
	UserDTO userDetailView(String nickname) throws SQLException;
	
	/**
	 * ȸ�� Ż��
	 * @param name
	 * @return
	 * @throws SQLException
	 */
	int deleteUser(String nickname) throws SQLException;
	
	/**
	 * ���������� �˻�
	 * @param name
	 * @return
	 * @throws SQLException
	 */
	List<UserDTO> searchByNickname(String nickname) throws SQLException;

	/**
	 * ȸ�� �ǵ� ��� ��������
	 * @param writer
	 * @return
	 * @throws SQLException
	 */
	List<BoardDTO> selectBoardListByNickname(String nickname) throws SQLException;
	
	/**
	 * �Խù� �󼼺���
	 * @param num
	 * @return
	 * @throws SQLException
	 */
	BoardDTO selectBoardByNum(int num) throws SQLException;
	
	/**
	 * �����ǵ� �ҷ�����(�α��� �� ù ȭ��)
	 * @param writer
	 * @return
	 * @throws SQLException
	 */
	List<BoardDTO> selectNewsFeed(String nickname) throws SQLException;
	
	/**
	 * �Խù� ���
	 * @param dto
	 * @return
	 * @throws SQLException
	 */
	int insertBoard(BoardDTO dto) throws SQLException;
	
	/**
	 * �Խù� ����
	 * @param dto
	 * @return
	 * @throws SQLException
	 */
	int updateBoard(BoardDTO dto) throws SQLException;
	
	/**
	 * �Խù� ����
	 * @param num
	 * @return
	 * @throws SQLException
	 */
	int deleteBoard(int num) throws SQLException;
	
	/**
	 * �˸� ����
	 * @param dto
	 * @return
	 * @throws SQLException
	 */
	int insertNotice(NoticeDTO dto) throws SQLException;
	
	/**
	 * �˸� ��� �ҷ�����
	 * @param name
	 * @return
	 * @throws SQLException
	 */
	List<NoticeDTO> selectNotice(String nickname) throws SQLException;
	
	/**
	 * ��� ���
	 * @param dto
	 * @return
	 * @throws SQLException
	 */
	int insertComment(CommentDTO dto) throws SQLException;
	
	/**
	 * ��� ����
	 * @param num
	 * @return
	 * @throws SQLException
	 */
	int deleteComment(int num) throws SQLException;
	
	/**
	 * ��� ��� ��������
	 * @param num
	 * @return
	 * @throws SQLException
	 */
	List<CommentDTO> selectComment(int num) throws SQLException;
	
	/**
	 * '���ƿ�' ����
	 * @param dto
	 * @return
	 * @throws SQLException
	 */
	int insertLike(LikeDTO dto) throws SQLException;
	
	/**
	 * '���ƿ�' ����
	 * @param dto
	 * @return
	 * @throws SQLException
	 */
	int deleteLike(LikeDTO dto) throws SQLException;
	
	/**
	 * �ؽ��±׷� �˻�
	 * @param hash
	 * @return
	 * @throws SQLException
	 */
	List<BoardDTO> searchByHashtag(String hash) throws SQLException;
	
	/**
	 * �ȷο��ϱ�
	 * @param mynic
	 * @param nic
	 * @return
	 * @throws SQLException
	 */
	int insertFollow(String mynic, String nic) throws SQLException;
	
	/**
	 * ���ȷο��ϱ�
	 * @param mynic
	 * @param nic
	 * @return
	 * @throws SQLException
	 */
	int deleteFollow(String mynic, String nic) throws SQLException;
	
	/**
	 * �ȷο� ����Ʈ ��������
	 * @param mynic
	 * @param nic
	 * @return
	 * @throws SQLException
	 */
	List<UserDTO> selectFollow(String mynic) throws SQLException;
	
	/**
	 * �ȷο� �� ��������
	 * @param mynic
	 * @param nic
	 * @return
	 * @throws SQLException
	 */
	public int countFollower(String email) throws SQLException;
	
	/**
	 * �ȷο� �� ��������
	 * @param mynic
	 * @param nic
	 * @return
	 * @throws SQLException
	 */
	public int countFollow(String email) throws SQLException;
}
