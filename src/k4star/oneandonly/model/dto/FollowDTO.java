package k4star.oneandonly.model.dto;

public class FollowDTO {
	
	private int follow_num;
	private String follow;
	private String email;
	private String nickname;
	
	public FollowDTO() {}

	public FollowDTO(int follow_num, String follow, String email, String nickname) {
		super();
		this.follow_num = follow_num;
		this.follow = follow;
		this.email = email;
		this.nickname = nickname;
	}

	public int getFollow_num() {
		return follow_num;
	}

	public void setFollow_num(int follow_num) {
		this.follow_num = follow_num;
	}

	public String getFollow() {
		return follow;
	}

	public void setFollow(String follow) {
		this.follow = follow;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	

}
