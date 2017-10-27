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
	public int UpdateUser(UserDTO dto) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserDTO SelectUser(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int DeleteUser(String name) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<UserDTO> SelectByNic(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDTO> SelectBoardWriter(String writer) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardDTO SelectBoardNum(int num) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardDTO> SelectNewsFeed(String writer) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int InsertBoard(BoardDTO dto) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int UpdateBoard(BoardDTO dto) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int DeleteBoard(int num) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int InsertNotice(NoticeDTO dto) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<NoticeDTO> SelectNotice(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int InsertComment(CommentDTO dto) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int DeleteComment(int num) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CommentDTO> SelectComment(int num) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int UpdateLike(LikeDTO dto) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BoardDTO> SelectByHash(String hash) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int InsertFollow(String mynic, String nic) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int DeleteFollow(String mynic, String nic) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<UserDTO> SelectFollow(String mynic, String nic) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
