
public class MarkovPlayer implements Player {
	private int opponentLastMove, currentMove;
	private double[][] predictMove;

	public MarkovPlayer() {
		predictMove = new double[3][3];
		
		opponentLastMove = RPS.ROCK;
	}
	
	@Override
	public int getMove() {
		double total = predictMove[opponentLastMove][RPS.ROCK] 
				+ predictMove[opponentLastMove][RPS.PAPER] 
						+ predictMove[opponentLastMove][RPS.SCISSORS];
		
		double rand = (Math.random()*total);

		if (rand >= 0 && rand < ((double) predictMove[opponentLastMove][RPS.ROCK] / total)) {
			return RPS.PAPER;
		} else if (rand >= ((double) predictMove[opponentLastMove][RPS.ROCK] / total) && 
				rand < ((double) predictMove[opponentLastMove][RPS.PAPER] + predictMove[opponentLastMove][RPS.ROCK]) / total) {
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
