package com.java.DTO;

public class UsersDTO {
	int userid;
	String fullname;
	String email;
	long phone;
	String dob;
	private String gender;
	String username;
	String password;

	public UsersDTO() {

	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UsersDTO(int userid, String fullname, String email, long phone, String dob, String gender, String username,
			String password) {
		super();
		this.userid = userid;
		this.fullname = fullname;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.gender = gender;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "UsersDTO [userid=" + userid + ", fullname=" + fullname + ", email=" + email + ", phone=" + phone
				+ ", dob=" + dob + ", gender=" + gender + ", username=" + username + ", password=" + password + "]";
	}

}
