
public class BeatLastWinningMovePlayer implements Player {
	private int lastWinningMove, opponentLastMove;
	
	public BeatLastWinningMovePlayer() {		
		lastWinningMove = calcLastWinningMove();
	}
	
	private int calcLastWinningMove() {
		int winner = RPS.getWinnerFor(this.getMove(), opponentLastMove);
		
		if (winner == 1) {
			return this.getMove();
		} else if (winner == 2){
			return opponentLastMove;
		}
		return 0;
	}
	
	public int getMove() {
		return getMoveToBeat(lastWinningMove);
	}
	
	private int getMoveToBeat(int winningMove) {
		if (winningMove == RPS.ROCK) return RPS.PAPER;
		if (winningMove == RPS.SCISSORS) return RPS.ROCK;
		if (winningMove == RPS.TIE) return this.getMove();
		return RPS.SCISSORS;
	}

	@Override
	public void updateLastRoundInfo(int yourMove, int opponentMove, int outcome) {
		opponentLastMove = opponentMove;
		
	}

}
