
public class MarkovPlayer implements Player {
	private int opponentLastMove, currentMove;
	private double[][] predictMove;

	public MarkovPlayer() {
		predictMove = new double[3][3];
		
		opponentLastMove = RPS.ROCK;
	}
	
	@Override
	public int getMove() {
		double rand = Math.random();

		if (rand >= 0 && rand < predictMove[opponentLastMove][0]) {
			return RPS.PAPER;
		} else if (rand >= predictMove[opponentLastMove][0] && rand < predictMove[opponentLastMove][1] + predictMove[opponentLastMove][0]) {
			return RPS.SCISSORS;
		} else {
			return RPS.ROCK;
		}
	}

	@Override
	public void updateLastRoundInfo(int yourMove, int opponentMove, int outcome) {
		currentMove = opponentMove;
		
		predictMove[opponentLastMove][currentMove]++;
		
		opponentLastMove = currentMove;
	}
}
