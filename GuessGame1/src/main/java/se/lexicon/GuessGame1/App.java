package se.lexicon.GuessGame1;

public class App {

	public static void main(String[] args) {

		int answer = 0, guess = 0, times = 0, min = 0, max = 1, maxg = 5;
		boolean run = true, vl = false;

		System.out.println("Welcome to The Guessing Game!");
		while (run) {
			if (times == 0) {// only active when start a new game.

				while (!vl) {// get a valid limit
					System.out.println("Setting the limit");
					System.out.print("Min: ");
					min = FixInt.getInt();
					System.out.print("Max: ");
					max = FixInt.getInt();
					if (min < max) {
						vl = true;
					} else {
						System.out.println("Not a valid limit");
					}
				}

				answer = FixInt.randomInt(max,min);
				System.out.println("Gusse the Number: " + min + " to " + max + "(" + maxg + " tries)");
			}
			// iteration part
			System.out.print("Your guess: ");
			guess = FixInt.getIntFromLimit(max, min);
			times++;

			// check the answer
			if (answer == guess && times < (maxg + 1)) {
				System.out.println(guess + " is the right.(" + maxg + " tries)");
				System.out.println("You Win!!!");
				run = YesOrNo.bool();

				if (run == true) {// yes to rest the game
					times = 0;
					vl = false;
				}

			} else if (times == (maxg + 1)) {
				System.out.println("Max trytimes. You Lose.");
				run = YesOrNo.bool();

				if (run == true) {// rest the game
					times = 0;
					vl = false;
				}
			} else if (answer < guess) {
				System.out.println("Your guess " + guess + " is too high.(" + times + "of " + maxg + " tries)");
			} else {
				System.out.println("Your guess " + guess + " is too low.(" + times + "of " + maxg + " tries)");
			}

		}
		System.out.println("Goodbye!");

	}
}
