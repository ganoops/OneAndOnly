package k4star.oneandonly.model.dto;

public class CommentDTO {
	
	private int comment_num;
	private int board_num;
	private String nickname;
	private String content;
	
	public CommentDTO() {}

	public CommentDTO(int comment_num, int board_num, String nickname, String content) {
		super();
		this.comment_num = comment_num;
		this.board_num = board_num;
		this.nickname = nickname;
		this.content = content;
	}

	public int getComment_num() {
		return comment_num;
	}

	public void setComment_num(int comment_num) {
		this.comment_num = comment_num;
	}

	public int getBoard_num() {
		return board_num;
	}

	public void setBoard_num(int board_num) {
		this.board_num = board_num;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
