package entity;

public class Ingredients {

	private String fructose;
	private String sugar;
	private String vanilin;
	private String water;

	public String getFructose() {
		return fructose;
	}

	public void setFructose(String fructose) {
		this.fructose = fructose;
	}

	public String getSugar() {
		return sugar;
	}

	public void setSugar(String sugar) {
		this.sugar = sugar;
	}

	public String getVanilin() {
		return vanilin;
	}

	public void setVanilin(String vanilin) {
		this.vanilin = vanilin;
	}

	public String getWater() {
		return water;
	}

	public void setWater(String water) {
		this.water = water;
	}

	@Override
	public String toString() {
		return "Ingredients (fructose=" + fructose + ", sugar=" + sugar
				+ ", vanilin=" + vanilin + ", water=" + water + ")";
	}

}
