package model;

public class ClueSheet {
	// suspects
	private String scarlet;
	private String mustard;
	private String white;
	private String green;
	private String peacock;
	private String plum;
	// weapons
	private String knife;
	private String candlestick;
	private String pipe;
	private String revolver;
	private String rope;
	private String wrench;
	// rooms
	private String ballroom;
	private String kitchen;
	private String conservatory;
	private String billard;
	private String dining;
	private String library;
	private String hall;
	private String study;
	private String lounge;

	public ClueSheet(String scarlet, String mustard, String white, String green, String peacock, String plum,
			String knife, String candlestick, String pipe, String revolver, String rope, String wrench, String ballroom,
			String kitchen, String conservatory, String billard, String dining, String library, String hall,
			String study, String lounge) {
		super();
		this.scarlet = scarlet;
		this.mustard = mustard;
		this.white = white;
		this.green = green;
		this.peacock = peacock;
		this.plum = plum;
		this.knife = knife;
		this.candlestick = candlestick;
		this.pipe = pipe;
		this.revolver = revolver;
		this.rope = rope;
		this.wrench = wrench;
		this.ballroom = ballroom;
		this.kitchen = kitchen;
		this.conservatory = conservatory;
		this.billard = billard;
		this.dining = dining;
		this.library = library;
		this.hall = hall;
		this.study = study;
		this.lounge = lounge;
	}

	@Override
	public String toString() {
		return "ClueSheet [scarlet=" + scarlet + ", mustard=" + mustard + ", white=" + white + ", green=" + green
				+ ", peacock=" + peacock + ", plum=" + plum + ", knife=" + knife + ", candlestick=" + candlestick
				+ ", pipe=" + pipe + ", revolver=" + revolver + ", rope=" + rope + ", wrench=" + wrench + ", ballroom="
				+ ballroom + ", kitchen=" + kitchen + ", conservatory=" + conservatory + ", billard=" + billard
				+ ", dining=" + dining + ", library=" + library + ", hall=" + hall + ", study=" + study + ", lounge="
				+ lounge + "]";
	}

	public ClueSheet() {

	}

	public String getScarlet() {
		return scarlet;
	}

	public void setScarlet(String scarlet) {
		this.scarlet = scarlet;
	}

	public String getMustard() {
		return mustard;
	}

	public void setMustard(String mustard) {
		this.mustard = mustard;
	}

	public String getWhite() {
		return white;
	}

	public void setWhite(String white) {
		this.white = white;
	}

	public String getGreen() {
		return green;
	}

	public void setGreen(String green) {
		this.green = green;
	}

	public String getPeacock() {
		return peacock;
	}

	public void setPeacock(String peacock) {
		this.peacock = peacock;
	}

	public String getPlum() {
		return plum;
	}

	public void setPlum(String plum) {
		this.plum = plum;
	}

	public String getKnife() {
		return knife;
	}

	public void setKnife(String knife) {
		this.knife = knife;
	}

	public String getCandlestick() {
		return candlestick;
	}

	public void setCandlestick(String candlestick) {
		this.candlestick = candlestick;
	}

	public String getPipe() {
		return pipe;
	}

	public void setPipe(String pipe) {
		this.pipe = pipe;
	}

	public String getRevolver() {
		return revolver;
	}

	public void setRevolver(String revolver) {
		this.revolver = revolver;
	}

	public String getRope() {
		return rope;
	}

	public void setRope(String rope) {
		this.rope = rope;
	}

	public String getWrench() {
		return wrench;
	}

	public void setWrench(String wrench) {
		this.wrench = wrench;
	}

	public String getBallroom() {
		return ballroom;
	}

	public void setBallroom(String ballroom) {
		this.ballroom = ballroom;
	}

	public String getKitchen() {
		return kitchen;
	}

	public void setKitchen(String kitchen) {
		this.kitchen = kitchen;
	}

	public String getConservatory() {
		return conservatory;
	}

	public void setConservatory(String conservatory) {
		this.conservatory = conservatory;
	}

	public String getBillard() {
		return billard;
	}

	public void setBillard(String billard) {
		this.billard = billard;
	}

	public String getDining() {
		return dining;
	}

	public void setDining(String dining) {
		this.dining = dining;
	}

	public String getLibrary() {
		return library;
	}

	public void setLibrary(String library) {
		this.library = library;
	}

	public String getHall() {
		return hall;
	}

	public void setHall(String hall) {
		this.hall = hall;
	}

	public String getStudy() {
		return study;
	}

	public void setStudy(String study) {
		this.study = study;
	}

	public String getLounge() {
		return lounge;
	}

	public void setLounge(String lounge) {
		this.lounge = lounge;
	}

}
