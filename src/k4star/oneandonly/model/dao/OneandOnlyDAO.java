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
	/*join(UserDTO) int
	login(String id, String pw) boolean
	UpdateUser(UserDTO) int
	SelectUser(String name) UserDTO
	DeleteUser(String name, String pw) int
	SelectByNic(String name) List<UserDTO>
	---*/
	int join(UserDTO dto) throws SQLException;
	boolean login(String id, String pw) throws SQLException;
	int UpdateUser(UserDTO dto) throws SQLException;
	UserDTO SelectUser(String name) throws SQLException;
	int DeleteUser(String name) throws SQLException;
	List<UserDTO> SelectByNic(String name) throws SQLException;
	
	/*SelectBoardWriter(String writer) List<UserDTO>
	SelectBoardNum(int num) Map<BoardDTO, List<PhotoDTO>>
	SelectNewsFeed(String writer) List<BoardDTO>
	InsertBoard(BoardDTO) int
	UpdateBoard(BoardDTO) int
	DeleteBoard(int num) int
	---*/
	List<UserDTO> SelectBoardWriter(String writer) throws SQLException;
	BoardDTO SelectBoardNum(int num) throws SQLException;
	List<BoardDTO> SelectNewsFeed(String writer) throws SQLException;
	int InsertBoard(BoardDTO dto) throws SQLException;
	int UpdateBoard(BoardDTO dto) throws SQLException;
	int DeleteBoard(int num) throws SQLException;
	
	/*InsertNotice(NoticeDTO) int
	SelectNotice(String name) List<NoticeDTO>
	---
	InsertComment(CommentDTO) int
	DeleteComment(int num) int
	SelectComment(int num) List<CommentDTO>
	---*/
	int InsertNotice(NoticeDTO dto) throws SQLException;
	List<NoticeDTO> SelectNotice(String name) throws SQLException;
	
	int InsertComment(CommentDTO dto) throws SQLException;
	int DeleteComment(int num) throws SQLException;
	List<CommentDTO> SelectComment(int num) throws SQLException;
	
	/*UpdateLike(LikdeDTO) int
	---
	SelectByHash(Strin hash) List<BoardDTO> 
	---*/
	/*InsertFollow(String mynic, String nic) int
	DeleteFollow(String mynic, String nic) int
	SelectFollow(String mynic) List<UserDTO>*/
	
	int UpdateLike(LikeDTO dto) throws SQLException;
	List<BoardDTO> SelectByHash(String hash) throws SQLException;
	int InsertFollow(String mynic, String nic) throws SQLException;
	int DeleteFollow(String mynic, String nic) throws SQLException;
	List<UserDTO> SelectFollow(String mynic, String nic) throws SQLException;
}
