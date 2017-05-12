
public class BeatByFrequency implements Player {
	private int rockCount, paperCount, scissorsCount;
	private int opponentLastMove;

	public BeatByFrequency() {

	}

	@Override
	public int getMove() {
		double rand = Math.random();
//		System.out.println("Rock: " + getRockFrequency());
//		System.out.println("Paper: " + getPaperFrequency());
//		System.out.println("Scissors: " + getScissorsFrequency());
		
		System.out.println("Rock: " + rockCount);
		System.out.println("Paper: " + paperCount);
		System.out.println("Scissors: " + scissorsCount);

		if (rand >= 0 && rand < getRockFrequency()) {
			return RPS.PAPER;
		} else if (rand >= getRockFrequency() && rand < getPaperFrequency() + getRockFrequency()) {
			return RPS.SCISSORS;
		} else {
			return RPS.ROCK;
		}
	}

	public double getRockFrequency() {
		if ((rockCount + paperCount + scissorsCount) > 0) {
			return (double) rockCount / (rockCount + paperCount + scissorsCount);
		}
		return 0;
	}

	public double getPaperFrequency() {
		if ((rockCount + paperCount + scissorsCount) > 0) {
			return (double) paperCount / (rockCount + paperCount + scissorsCount);
		}
		return 0;
	}

	public double getScissorsFrequency() {
		if ((rockCount + paperCount + scissorsCount) > 0) {
			return (double) scissorsCount / (rockCount + paperCount + scissorsCount);
		}
		return 0;
	}

	@Override
	public void updateLastRoundInfo(int yourMove, int opponentMove, int outcome) {
		opponentLastMove = opponentMove;
		setCount();

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
}
