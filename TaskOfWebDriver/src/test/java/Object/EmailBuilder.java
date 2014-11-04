package Object;

public class EmailBuilder {
	private String adress;
	private String subject;
	private String bodyMessage;

	public EmailBuilder subject(String subject) {
		this.subject = subject;
		return this;
	}

	public EmailBuilder adress(String adress) {
		this.adress = adress;
		return this;
	}

	public EmailBuilder bodyMessage(String bodyMessage) {
		this.bodyMessage = bodyMessage;
		return this;
	}

//	public Email build() {
//		Email email = new Email(this);
//		validateUserObject(email);
//		return email;
//	}
//
//	private void validateUserObject(Email email) {
//
//	}
}
