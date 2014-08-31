package model;

public class Symbol extends Sentence {
	private String sym;

	public Symbol(String sym) {
		this.sym = sym;
	}

	public String getSymbol() {
		return sym;
	}

	public void setSymbol(String sym) {
		this.sym = sym;
	}
}
