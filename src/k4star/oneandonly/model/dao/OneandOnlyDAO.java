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
	 * 회원가입
	 * @param dto
	 * @return
	 * @throws SQLException
	 */
	int join(UserDTO dto) throws SQLException;
	
	/**
	 * 로그인
	 * @param id
	 * @param pw
	 * @return
	 * @throws SQLException
	 */
	boolean login(String id, String pw) throws SQLException;
	
	/**
	 * 회원 정보 수정
	 * @param dto
	 * @return
	 * @throws SQLException
	 */
	int updateUser(UserDTO dto) throws SQLException;
	
	/**
	 * 회원 상세 보기
	 * @param name
	 * @return
	 * @throws SQLException
	 */
	UserDTO userDetailView(String nickname) throws SQLException;
	
	/**
	 * 회원 탈퇴
	 * @param name
	 * @return
	 * @throws SQLException
	 */
	int deleteUser(String nickname) throws SQLException;
	
	/**
	 * 계정명으로 검색
	 * @param name
	 * @return
	 * @throws SQLException
	 */
	List<UserDTO> searchByNickname(String nickname) throws SQLException;

	/**
	 * 회원 피드 목록 가져오기
	 * @param writer
	 * @return
	 * @throws SQLException
	 */
	List<BoardDTO> selectBoardListByNickname(String nickname) throws SQLException;
	
	/**
	 * 게시물 상세보기
	 * @param num
	 * @return
	 * @throws SQLException
	 */
	BoardDTO selectBoardByNum(int num) throws SQLException;
	
	/**
	 * 뉴스피드 불러오기(로그인 후 첫 화면)
	 * @param writer
	 * @return
	 * @throws SQLException
	 */
	List<BoardDTO> selectNewsFeed(String nickname) throws SQLException;
	
	/**
	 * 게시물 등록
	 * @param dto
	 * @return
	 * @throws SQLException
	 */
	int insertBoard(BoardDTO dto) throws SQLException;
	
	/**
	 * 게시물 수정
	 * @param dto
	 * @return
	 * @throws SQLException
	 */
	int updateBoard(BoardDTO dto) throws SQLException;
	
	/**
	 * 게시물 삭제
	 * @param num
	 * @return
	 * @throws SQLException
	 */
	int deleteBoard(int num) throws SQLException;
	
	/**
	 * 알림 생성
	 * @param dto
	 * @return
	 * @throws SQLException
	 */
	int insertNotice(NoticeDTO dto) throws SQLException;
	
	/**
	 * 알림 목록 불러오기
	 * @param name
	 * @return
	 * @throws SQLException
	 */
	List<NoticeDTO> selectNotice(String nickname) throws SQLException;
	
	/**
	 * 댓글 등록
	 * @param dto
	 * @return
	 * @throws SQLException
	 */
	int insertComment(CommentDTO dto) throws SQLException;
	
	/**
	 * 댓글 삭제
	 * @param num
	 * @return
	 * @throws SQLException
	 */
	int deleteComment(int num) throws SQLException;
	
	/**
	 * 댓글 목록 가져오기
	 * @param num
	 * @return
	 * @throws SQLException
	 */
	List<CommentDTO> selectComment(int num) throws SQLException;
	
	/**
	 * '좋아요' 생성
	 * @param dto
	 * @return
	 * @throws SQLException
	 */
	int insertLike(LikeDTO dto) throws SQLException;
	
	/**
	 * '좋아요' 삭제
	 * @param dto
	 * @return
	 * @throws SQLException
	 */
	int deleteLike(LikeDTO dto) throws SQLException;
	
	/**
	 * 해쉬태그로 검색
	 * @param hash
	 * @return
	 * @throws SQLException
	 */
	List<BoardDTO> searchByHashtag(String hash) throws SQLException;
	
	/**
	 * 팔로우하기
	 * @param mynic
	 * @param nic
	 * @return
	 * @throws SQLException
	 */
	int insertFollow(String mynic, String nic) throws SQLException;
	
	/**
	 * 언팔로우하기
	 * @param mynic
	 * @param nic
	 * @return
	 * @throws SQLException
	 */
	int deleteFollow(String mynic, String nic) throws SQLException;
	
	/**
	 * 팔로우 리스트 가져오기
	 * @param mynic
	 * @param nic
	 * @return
	 * @throws SQLException
	 */
	List<UserDTO> selectFollow(String mynic) throws SQLException;
	
	/**
	 * 팔로워 수 가져오기
	 * @param mynic
	 * @param nic
	 * @return
	 * @throws SQLException
	 */
	public int countFollower(String email) throws SQLException;
	
	/**
	 * 팔로우 수 가져오기
	 * @param mynic
	 * @param nic
	 * @return
	 * @throws SQLException
	 */
	public int countFollow(String email) throws SQLException;
}
