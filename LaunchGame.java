import java.util.*;

class Player {
	int pguess;
	int guessNumber() {
		System.out.println("Guess Number between 1 to 10");
		Scanner sc = new Scanner(System.in);
		pguess = sc.nextInt();
		return pguess;
	}
}

class Guesser {
	int guess;
	int guessNumber() {
		System.out.println("Guess Number between 1 to 10");
		Scanner sc = new Scanner(System.in);
		guess = sc.nextInt();
		if(guess >= 10 || guess < 0) return -1;
		return guess;
	}
}

class Umpire {
	int Nump1;
	int Nump2;
	int Nump3;
	int numFromGuess;
	void collectNumberFromGuesser() {
		Guesser g = new Guesser();
		numFromGuess = g.guessNumber();
		if(numFromGuess == -1) System.out.println("Invalid Range");
	}
	void collectFromPlayer() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		Nump1 = p1.guessNumber();
		Nump2 = p2.guessNumber();
		Nump3 = p3.guessNumber();
	}
	void compare() {
		if(Nump1 == numFromGuess) {
			if(Nump2 == numFromGuess && Nump3 == numFromGuess) System.out.println("Tie Between all players");
			else if(Nump2 == numFromGuess) System.out.println("Tie Between player 1 and 2");
			else if(Nump3 == numFromGuess) System.out.println("Tie Between player 1 and 3");
			else System.out.println("player 1 is the winner");
		}
		else if(Nump2 == numFromGuess) {
			if(Nump3 == numFromGuess) System.out.println("Tie Between player 2 and 3");
			System.out.println("player 2 is the winner");
		}
		else if(Nump3 == numFromGuess) System.out.println("player 3 is the winner");
		else System.out.println("GAME LOST TRY AGAIN.....");
	}
}


public class LaunchGame {
	public static void main(String[] args) {
		Umpire up = new Umpire();
		up.collectNumberFromGuesser();
		up.collectFromPlayer();
		up.compare();
	}

}