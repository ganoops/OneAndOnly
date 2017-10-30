package k4star.oneandonly.model.dto;

public class BoardDTO {
	
	private int board_num;
	private String nickname;
	private String write_date;
	private String content;
	private String photo;
	
	public BoardDTO() {}

	public BoardDTO(int board_num, String nickname, String write_date, String content, String photo) {
		super();
		this.board_num = board_num;
		this.nickname = nickname;
		this.write_date = write_date;
		this.content = content;
		this.photo = photo;
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

	public String getWrite_date() {
		return write_date;
	}

	public void setWrite_date(String write_date) {
		this.write_date = write_date;
	}


	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	

}
