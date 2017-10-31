package k4star.oneandonly.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import k4star.oneandonly.model.dto.BoardDTO;
import k4star.oneandonly.model.dto.CommentDTO;
import k4star.oneandonly.model.dto.LikeDTO;
import k4star.oneandonly.model.dto.NoticeDTO;
import k4star.oneandonly.model.dto.UserDTO;
import k4star.oneandonly.util.DBUtil;

public class OneandOnlyDAOImpl implements OneandOnlyDAO {

	@Override
	public int join(UserDTO dto) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("INSERT INTO sns_user(email,password,phone,introduce,profile_pic,join_date,nickname)" 
			+ " VALUES(?,?,?,?,?,sysdate,?)");

			ps.setString(1, dto.getEmail());
			ps.setString(2, dto.getPassword());
			ps.setString(3, dto.getPhone());
			ps.setString(4, dto.getIntroduce());
			ps.setString(5, dto.getProfile_pic());
			ps.setString(6, dto.getNickname());
			// 실행완료
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.dbClose(con, ps,null);
		}
		return result;
	}

	@Override
	public boolean login(String email, String password) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
		boolean result=false;
		try {
			con=DBUtil.getConnection();
			ps = con.prepareStatement("select * from sns_user where email=? and password =?");
			ps.setString(1, email);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if(rs.next()){
				result=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.dbClose(con, ps, rs);
		}
		return result;
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

	@Override
	public boolean duplicateIdCheck(String email) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
		boolean result=false;
		try {
			con=DBUtil.getConnection();
			ps = con.prepareStatement("select * from sns_user where email=?");
			ps.setString(1, email);
			rs = ps.executeQuery();
			if(rs.next()){
				result=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.dbClose(con, ps, rs);
		}
		return result;
	}
	public boolean duplicateNickCheck(String nickName) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
		boolean result=false;
		try {
			con=DBUtil.getConnection();
			ps = con.prepareStatement("select * from sns_user where nickname=?");
			ps.setString(1, nickName);
			rs = ps.executeQuery();
			if(rs.next()){
				result=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.dbClose(con, ps, rs);
		}
		return result;
	}
	
	

}
