
public class StayIfWinSwitchIfLosePlayer implements Player {
	int prevMove;
	
	public StayIfWinSwitchIfLosePlayer() {
		prevMove = RPS.ROCK;
	}
	
	@Override
	public int getMove() {
		return prevMove;
	}

	@Override
	public void setOutcome(int yourMove, int opponentMove, int outcome) {
		if (outcome == RPS.OPPONENT) {
			prevMove = getMoveToBeat(opponentMove);
		}
	}
	
	private int getMoveToBeat(int prev) {
		if (prev == RPS.ROCK) return RPS.PAPER;
		if (prev == RPS.SCISSORS) return RPS.ROCK;
		return RPS.SCISSORS;
	}
}
