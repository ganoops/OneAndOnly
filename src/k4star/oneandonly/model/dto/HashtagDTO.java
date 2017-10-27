package k4star.oneandonly.model.dto;

public class HashtagDTO {
	
	private int hashtag_num;
	private int board_num;
	private String hashtag;
	
	public HashtagDTO() {}

	public HashtagDTO(int hashtag_num, int board_num, String hashtag) {
		super();
		this.hashtag_num = hashtag_num;
		this.board_num = board_num;
		this.hashtag = hashtag;
	}

	public int getHashtag_num() {
		return hashtag_num;
	}

	public void setHashtag_num(int hashtag_num) {
		this.hashtag_num = hashtag_num;
	}

	public int getBoard_num() {
		return board_num;
	}

	public void setBoard_num(int board_num) {
		this.board_num = board_num;
	}

	public String getHashtag() {
		return hashtag;
	}

	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
	}
	

}
