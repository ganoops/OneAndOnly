package k4star.oneandonly.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import k4star.oneandonly.model.dto.BoardDTO;
import k4star.oneandonly.model.dto.CommentDTO;
import k4star.oneandonly.model.dto.LikeDTO;
import k4star.oneandonly.model.dto.NoticeDTO;
import k4star.oneandonly.model.dto.UserDTO;
import k4star.oneandonly.util.DBUtil;

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
	
	/**
	 * 회원정보 불러오기
	 * (계정 상세보기, 계정 수정?)
	 */
	@Override
	public UserDTO userDetailView(String nickname) throws SQLException {
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		UserDTO userDTO = null;
		try {
			con = DBUtil.getConnection();
			st = con.prepareStatement("select nickname, profile_pic, email, password, phone, introduce, join_date"
					+ " from sns_user where email = ?");
			st.setString(1, nickname);
			rs = st.executeQuery();
			
			if(rs.next()) {
				userDTO = new UserDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), 
						rs.getString(5), rs.getString(6), rs.getString(7));
			}
			
		} finally {
			DBUtil.dbClose(con, st, rs);
		}
		return userDTO;
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
	
	/***
	 * 계정 이름별 게시글 가져오기
	 * board, hashtag, comment, like
	 */
	@Override
	public List<BoardDTO> selectBoardListByNickname(String email) throws SQLException {
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		List<BoardDTO> list = new ArrayList<>();
		try {
			//int board_num, String nickname, String write_date, String content, String photo
			con = DBUtil.getConnection();
			st = con.prepareStatement("select board_num, nickname, content, write_date,"
					+ "photo, email from board where email = ?");
			st.setString(1, email);
			rs = st.executeQuery();
			
			while(rs.next()) {
				list.add(new BoardDTO(rs.getInt(1), rs.getString(2), rs.getString(4), 
						rs.getString(3), rs.getString(5)));
			}
			
		} finally {
			DBUtil.dbClose(con, st, rs);
		}
		
		return list;
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

	/**
	 * 팔로워 수
	 * (나를 팔로우 하는 사람)
	 */
	@Override
	public int countFollower(String email) throws SQLException{
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		int followerCount = 0;
		try {
			con = DBUtil.getConnection();
			st = con.prepareStatement("select count(nickname) from follow "
					+ "where follow_nic = (select nickname from sns_user where email = 'test@naver.com')");
			rs = st.executeQuery();
			
			if(rs.next()) {
				followerCount = rs.getInt(1);
			}
			
		}finally {
			DBUtil.dbClose(con, st, rs);
		}
		return followerCount;
	}
	/**
	 * 팔로우 수
	 * (내가 팔로우 하는 사람)
	 */	
	@Override
	public int countFollow(String email) throws SQLException{
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		int followerCount = 0;
		try {
			con = DBUtil.getConnection();
			st = con.prepareStatement("select count(nickname) from follow "
					+ "where nickname = (select nickname from sns_user where email = 'test@naver.com')");
			rs = st.executeQuery();
			
			if(rs.next()) {
				followerCount = rs.getInt(1);
			}
			
		}finally {
			DBUtil.dbClose(con, st, rs);
		}
		return followerCount;
	}
	
}
