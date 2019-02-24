package model;

public class ClueRooms {

	private int id;
	private String room;
	private int clueGameId;

	public ClueRooms(int id, String room, int clueGameId) {
		super();
		this.id = id;
		this.room = room;
		this.clueGameId = clueGameId;
	}

	public ClueRooms(String room) {
		this.room = room;
	}

	public ClueRooms() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public int getClueGameId() {
		return clueGameId;
	}

	public void setClueGameId(int clueGameId) {
		this.clueGameId = clueGameId;
	}

}
