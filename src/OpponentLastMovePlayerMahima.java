
public class OpponentLastMovePlayerMahima implements Player {
	private int opponentLastMove;
	
	public OpponentLastMovePlayerMahima(HumanPlayer p) {
		opponentLastMove = p.getMove();
	}
	
	public int getMove() {
		return getMoveToBeat(opponentLastMove);
	}

	private int getMoveToBeat(int prev) {
		if (prev == RPS.ROCK) return RPS.PAPER;
		if (prev == RPS.SCISSORS) return RPS.ROCK;
		return RPS.SCISSORS;
	}

	@Override
	public void updateLastRoundInfo(int yourMove, int opponentMove, int outcome) {
		opponentLastMove = opponentMove;
		
	}

}
