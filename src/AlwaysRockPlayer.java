
public class AlwaysRockPlayer implements Player {

	public AlwaysRockPlayer() {
		
	}
	
	@Override
	public int getMove() {
		return RPS.ROCK;
	}

	@Override
	public void setOutcome(int yourMove, int opponentMove, int outcome) {
		// we don't do anything with the outcome because we always throw ROCK.
	}

}
