package model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "clue")

@Table(name = "clue")
public class ClueGame {
	// Has to be joined with the clue_clues table
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "game_id")
	private int gameId;
	@Column(name = "player_number")
	private int playerNum;
	@Column(name = "date_played")
	private LocalDate datePlayed;

	@OneToOne(cascade = CascadeType.ALL, mappedBy="clueGame", fetch = FetchType.EAGER, optional = false)
	private ClueSheet clueSheet;

	/**
	 * Constructor
	 * 
	 * @param gameId
	 * @param playerNum
	 * @param datePlayed
	 */
	public ClueGame(int gameId, int playerNum, LocalDate datePlayed, ClueSheet clueSheet) {
		super();
		this.gameId = gameId;
		this.playerNum = playerNum;
		this.clueSheet = clueSheet;
	}

	public ClueGame(int playerNum, LocalDate datePlayed) {
		super();
		this.playerNum = playerNum;
		this.datePlayed = datePlayed;
	}

	/**
	 * No arg constructor
	 * 
	 */
	public ClueGame() {

	}

	public ClueGame(int playerNum) {
		super();
		this.playerNum = playerNum;
	}

	// Getters and Setters
	
	public int getGameId() {
		return gameId;
	}

	public ClueSheet getClueSheet() {
		return clueSheet;
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

	public LocalDate getDatePlayed() {
		return datePlayed;
	}

	public void setDatePlayed(LocalDate datePlayed) {
		this.datePlayed = datePlayed;
	}

	// To string
	@Override
	public String toString() {
		return "ClueGame [gameId=" + gameId + ", playerNum=" + playerNum + ", datePlayed=" + datePlayed + "]";
	}

}
