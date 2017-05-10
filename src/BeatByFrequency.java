
public class BeatByFrequency implements Player {
	private int rockCount, paperCount, scissorsCount;
	private int opponentLastMove;

	public BeatByFrequency(HumanPlayer p) {
	}

	@Override
	public int getMove() {
		return 0;
		
	}
	
	private void setCount() {
		if (opponentLastMove == RPS.ROCK) {
			rockCount++;
		} else if (opponentLastMove == RPS.PAPER) {
			paperCount++;
		} else {
			scissorsCount++;
		}
	}

	@Override
	public void updateLastRoundInfo(int yourMove, int opponentMove, int outcome) {
		opponentLastMove = opponentMove;

	}

	public double getFrequency() {
		return 0;
	}
}
