package Object;

public enum Users {

	USER1("Valery6693@gmail.com", "11kesha2011"), USER2("Valery6693@gmail.com",
			"dslr0101");
	// USER3()
	private final String login;
	private final String parol;

	Users(String login, String parol) {
		this.login = login;
		this.parol = parol;
	}

	public String getLogin() {
		return login;
	}

	public String getParol() {
		return parol;
	}

}
