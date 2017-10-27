package k4star.oneandonly.model.dto;

public class UserDTO {
	
	private String nickname;
	private String profile_pic;
	private String email;
	private String password;
	private String phone;
	private String introduce;
	private String join_date;
	
	public UserDTO() {}

	public UserDTO(String nickname, String profile_pic, String email, String password, String phone, String introduce,
			String join_date) {
		super();
		this.nickname = nickname;
		this.profile_pic = profile_pic;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.introduce = introduce;
		this.join_date = join_date;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getProfile_pic() {
		return profile_pic;
	}

	public void setProfile_pic(String profile_pic) {
		this.profile_pic = profile_pic;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getJoin_date() {
		return join_date;
	}

	public void setJoin_date(String join_date) {
		this.join_date = join_date;
	}
	

}
