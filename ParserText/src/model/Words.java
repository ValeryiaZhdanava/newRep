package model;

public class Words extends Sentence {
	private String word;
	
	public Words(String word) {
		this.word=word;
	}
	public String getWords() {
		return word;
	}

	public void setWords(String word){
		this.word=word;
	}
}
