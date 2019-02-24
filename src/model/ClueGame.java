package model;

public class ClueGame {

	private int gameId;
	private int playerNum;
	private int datePlayed;

	public ClueGame(int gameId, int playerNum, int datePlayed) {
		super();
		this.gameId = gameId;
		this.playerNum = playerNum;
		this.datePlayed = datePlayed;
	}

	public ClueGame() {

	}

	public ClueGame(int playerNum) {

	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getPlayerNum() {
		return playerNum;
	}

	public void setPlayerNum(int playerNum) {
		this.playerNum = playerNum;
	}

	public int getDatePlayed() {
		return datePlayed;
	}

	public void setDatePlayed(int datePlayed) {
		this.datePlayed = datePlayed;
	}

	@Override
	public String toString() {
		return "ClueGame [gameId=" + gameId + ", playerNum=" + playerNum + ", datePlayed=" + datePlayed + "]";
	}

}
