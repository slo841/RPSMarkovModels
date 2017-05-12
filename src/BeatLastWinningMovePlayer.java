
public class BeatLastWinningMovePlayer implements Player {
	private int lastWinningMove, opponentLastMove, previousMove;
	
	public BeatLastWinningMovePlayer() {		
		lastWinningMove = calcLastWinningMove();
	}
	
	private int calcLastWinningMove() {
		int winner = RPS.getWinnerFor(previousMove, opponentLastMove);
		
		if (winner == 1) {
			return previousMove;
		} else if (winner == 2){
			return opponentLastMove;
		}
		return 0;
	}
	
	public int getMove() {
		lastWinningMove = calcLastWinningMove();
		return getMoveToBeat(lastWinningMove);
	}
	
	private int getMoveToBeat(int winningMove) {
		if (winningMove == RPS.SCISSORS) return RPS.ROCK;
		if (winningMove == RPS.ROCK) return RPS.PAPER;
//		if (winningMove == RPS.TIE) return previousMove;
		return RPS.SCISSORS;
	}

	@Override
	public void updateLastRoundInfo(int yourMove, int opponentMove, int outcome) {
		opponentLastMove = opponentMove;
		previousMove = yourMove;
		
	}

}
