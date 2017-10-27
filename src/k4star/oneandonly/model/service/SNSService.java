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
	 * 회원가입(InsertUser)
	 * @param : UserDTO
	 * @return : 1이면 성공, 아니면 실패
	 * */
	public static int insertUser(UserDTO userDTO) throws Exception{
		return 0;
	}
	/**
	 * 로그인(SelectUser)
	 * @param : email, pass
	 * @return : true 성공, false 실패
	 * */
	public static boolean selectUser(String email, String pass) throws Exception{
		return false;
	}
	/**
	 * 회원수정(UpdateUser)
	 * @param : UserDTO
	 * @return : 1이면 성공, 아니면 실패
	 * */
	public static int updateUser(UserDTO userDTO) throws Exception{
		return 0;
	}
	/**
	 * 회원삭제(deleteUser)
	 * @param : email, pass
	 * @return : 1이면 성공, 아니면 실패
	 * */
	public static int deleteUser(String Email, String pass) throws Exception{
		return 0;
	}
	/**
	 * 게시물작성(InsertBoard)
	 * @param : email, pass
	 * @return : 1이면 성공, 아니면 실패
	 * */
	public static int insertBoard(BoardDTO boardDTO) throws Exception{
		return 0;
	}
	/**
	 * 게시물 수정(updateBoard)
	 * @param : BoardDTO
	 * @return : 1이면 성공, 아니면 실패
	 * */
	public static int updateBoard(BoardDTO boardDTO) throws Exception{
		return 0;
	}
	/**
	 * 게시물 삭제(DeleteBoard)
	 * @param : BoardDTO
	 * @return : 1이면 성공, 아니면 실패
	 * */
	public static int deleteBoard(int boardNum) throws Exception{
		return 0;
	}
	/**
	 * 계정게시물 가져오기
	 * @param : writer
	 * @return : List<BoardDTO>
	 * */
	public static List<BoardDTO> selectBoardWriter(String writer) throws Exception{
		return null;
	}
	/**
	 * 뉴스피드
	 * @param : writer
	 * @return : List<BoardDTO>
	 * */
	public static List<BoardDTO> selectNewspeed(String email) throws Exception{
		return null;
	}
	/**
	 * 게시물 상세보기
	 * @param : writer
	 * @return : BoardDTO
	 * */
	public static BoardDTO selectBoardNum(String boardNum) throws Exception{
		return null;
	}
	/**
	 * 알림 저장
	 * @param : NoticeDTO
	 * @return : BoardDTO
	 * */
	public static int insertNotice(NoticeDTO noticeDTO) throws Exception{
		return 0;
	}
	/**
	 * 알림 가져오기
	 * @param : writer
	 * @return : BoardDTO
	 * */
	public static List<NoticeDTO> selectNotice(String name) throws Exception{
		return null;
	}
	/**
	 * 댓글 작성하기
	 * @param : writer
	 * @return : BoardDTO
	 * */
	public static int insertComment(CommentDTO commentDTO) throws Exception{
		return 0;
	}
	/**
	 * 댓글 삭제하기
	 * @param : writer
	 * @return : BoardDTO
	 * */
	public static int deleteComment(int commentNum) throws Exception{
		return 0;
	}
	/**
	 * 댓글 가져오기
	 * @param : writer
	 * @return : BoardDTO
	 * */
	public static List<CommentDTO> selectComment(int commentNum) throws Exception{
		return null;
	}
	/**
	 * 좋아요 저장
	 * @param : writer
	 * @return : BoardDTO
	 * */
	public static int updateLike(LikeDTO likeDTO) throws Exception{
		return 0;
	}
	/**
	 * 해쉬태그 검색
	 * @param : writer
	 * @return : BoardDTO
	 * */
	public static List<BoardDTO> selectByHash(String hash) throws Exception{
		return null;
	}
	/**
	 * 계정명 검색
	 * @param : writer
	 * @return : BoardDTO
	 * */
	public static List<UserDTO> selectUser(String name) throws Exception{
		return null;
	}
	/**
	 * 팔로워 저장
	 * @param : writer
	 * @return : BoardDTO
	 * */
	public static int insertFollow(String mynic, String nic) throws Exception{
		return 0;
	}
	/**
	 * 팔로워 삭제
	 * @param : writer
	 * @return : BoardDTO
	 * */
	public static int deleteFollow(String mynic, String nic) throws Exception{
		return 0;
	}
	/**
	 * 팔로워 검색
	 * @param : writer
	 * @return : BoardDTO
	 * */
	public static List<UserDTO> selectFollow(String mynic) throws Exception{
		return null;
	}
	
}



