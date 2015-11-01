
public class BeatLastMovePlayer implements Player {
	int opponentLastMove;
	
	public BeatLastMovePlayer() {
		opponentLastMove = RPS.ROCK;		// we'll start by trying to beat rock
	}
	
	@Override
	public int getMove() {
		return getMoveToBeat(opponentLastMove);
	}

	private int getMoveToBeat(int prev) {
		if (prev == RPS.ROCK) return RPS.PAPER;
		if (prev == RPS.SCISSORS) return RPS.ROCK;
		return RPS.SCISSORS;
	}

	@Override
	public void setOutcome(int yourMove, int opponentMove, int outcome) {
		opponentLastMove = opponentMove;
	}

}
