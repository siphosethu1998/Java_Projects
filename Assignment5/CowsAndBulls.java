public class CowsAndBulls {
	// CowsAndBulls implements the logic for a cows and bulls guessing game. The player has 
	
	//	Constants
	public final static int NUM_DIGITS = 4;
	public final static int MAX_VALUE = 9876;
	public final static int MIN_VALUE = 1234;
	public final static int MAX_GUESSES = 10;
	
	// instance variables
	private int mysteryNumber;  
	private int guessesLeft;
	private boolean gameOver;

	//	Constructors
	public CowsAndBulls(int seed) {
		// Create a CowsAndBulls game using the given randomisation seed value to generate
		// a mystery number of NUM_DIGITS length, and that gives the player MAX_GUESSES guesses

		NumberPicker numPicker = new NumberPicker(seed, 1,9);
		mysteryNumber = numPicker.nextInt();
		guessesLeft = MAX_GUESSES;

		for(int num=1; num < NUM_DIGITS; num++) {
			mysteryNumber = mysteryNumber*10 + numPicker.nextInt(); 
		}
	
		gameOver = false;
	}

	public int guessesRemaining() {
		// Obtain the number of guesses remaining
		return guessesLeft;
	}

	public Result guess(int guessNumber) {
		// Evaluates a guess that the mystery number is guessNumber, returning the outcome in the form
		// of a Result object. Decrements guesses remaining.
		// Assumes that game is not over.

		if(gameOver != true) {

			int cows = NumberUtils.countIntersect(guessNumber, mysteryNumber);

			int bulls = NumberUtils.countMatch(guessNumber, mysteryNumber);

			guessesLeft--;
			
			if( NUM_DIGITS == bulls) {
				gameOver = true;
			}

			return new Result(cows, bulls);

		} else {

			throw new RuntimeException("CowsAndBulls : guess : game over");		
		}
			

	}

	public int giveUp() {
		// End the game, returning the secretNumber.
		gameOver = true;
		return mysteryNumber;
	}

	public boolean gameOver() {
		// Returns true if (i) the secret number has been guessed, or (ii) there are no more guesses.
		return gameOver;
	}
}
