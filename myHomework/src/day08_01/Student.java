package day08_01;

public class Student {
	private String username;
	private String password;
	private String birthday;
	private String hobby;
	
	public Student() {
		
	}
	public Student(String username,String password){
		this.username = username;
		this.password = password; 
		
	}
	public Student(String username, String password, String birthday,
			String hobby) {
		
		this.username = username;
		this.password = password;
		this.birthday = birthday;
		this.hobby = hobby;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
	
	
}
