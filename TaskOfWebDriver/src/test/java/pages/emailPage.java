package pages;

public class emailPage {
	private String sendTo;
	private String Subject;
	private String BodyMessage;

	public String getSendTo() {
		return sendTo;
	}

	public void setSendTo(String sendTo) {
		this.sendTo = sendTo;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public String getBodyMessage() {
		return BodyMessage;
	}

	public void setBodyMessage(String bodyMessage) {
		BodyMessage = bodyMessage;
	}

}
