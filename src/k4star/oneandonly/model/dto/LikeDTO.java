package k4star.oneandonly.model.dto;

public class LikeDTO {
	
	private int like_num;
	private int board_num;
	private String like_nick;
	
	public LikeDTO() {}

	public LikeDTO(int like_num, int board_num, String like_nick) {
		super();
		this.like_num = like_num;
		this.board_num = board_num;
		this.like_nick = like_nick;
	}

	public int getLike_num() {
		return like_num;
	}

	public void setLike_num(int like_num) {
		this.like_num = like_num;
	}

	public int getBoard_num() {
		return board_num;
	}

	public void setBoard_num(int board_num) {
		this.board_num = board_num;
	}

	public String getLike_nick() {
		return like_nick;
	}

	public void setLike_nick(String like_nick) {
		this.like_nick = like_nick;
	}
	

}
