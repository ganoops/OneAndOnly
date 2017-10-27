package k4star.oneandonly.model.dto;

public class NoticeDTO {
	
	private int notice_num;
	private String nickname;
	private String from_nick;
	private String notice_date;
	private String state;
	private String email;
	
	public NoticeDTO() {}

	public NoticeDTO(int notice_num, String nickname, String from_nick, String notice_date, String state,
			String email) {
		super();
		this.notice_num = notice_num;
		this.nickname = nickname;
		this.from_nick = from_nick;
		this.notice_date = notice_date;
		this.state = state;
		this.email = email;
	}

	public int getNotice_num() {
		return notice_num;
	}

	public void setNotice_num(int notice_num) {
		this.notice_num = notice_num;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getFrom_nick() {
		return from_nick;
	}

	public void setFrom_nick(String from_nick) {
		this.from_nick = from_nick;
	}

	public String getNotice_date() {
		return notice_date;
	}

	public void setNotice_date(String notice_date) {
		this.notice_date = notice_date;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
