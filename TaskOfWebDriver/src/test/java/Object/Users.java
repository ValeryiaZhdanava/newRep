package Object;

public enum Users {

	USER1("Valery6693@gmail.com", "11kesha2011"), 
	USER2("Valery6693@gmail.com",  "dslr0101"),
	USER3 ("webdrivertestemail@gmail.com", "111sun111");
	
	// USER3()
	private final String login;
	private final String password;

	Users(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

}
