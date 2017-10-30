package k4star.oneandonly.model.dao;

import java.sql.SQLException;
import java.util.List;

import k4star.oneandonly.model.dto.BoardDTO;
import k4star.oneandonly.model.dto.CommentDTO;
import k4star.oneandonly.model.dto.LikeDTO;
import k4star.oneandonly.model.dto.NoticeDTO;
import k4star.oneandonly.model.dto.UserDTO;

public class OneandOnlyDAOImpl implements OneandOnlyDAO {

	@Override
	public int join(UserDTO dto) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean login(String id, String pw) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int updateUser(UserDTO dto) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserDTO userDetailView(String nickname) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteUser(String nickname) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<UserDTO> searchByNickname(String nickname) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardDTO> selectBoardListByNickname(String nickname) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardDTO selectBoardByNum(int num) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardDTO> selectNewsFeed(String nickname) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertBoard(BoardDTO dto) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBoard(BoardDTO dto) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBoard(int num) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertNotice(NoticeDTO dto) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<NoticeDTO> selectNotice(String nickname) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertComment(CommentDTO dto) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteComment(int num) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CommentDTO> selectComment(int num) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertLike(LikeDTO dto) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteLike(LikeDTO dto) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BoardDTO> searchByHashtag(String hash) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertFollow(String mynic, String nic) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteFollow(String mynic, String nic) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<UserDTO> selectFollow(String mynic) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
