package GuessGame;

public class MainGame {
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame() {
	p1 = new Player();
	p2 = new Player();
	p3 = new Player();
	
	int guessp1 = 0;
	int guessp2 = 0;
	int guessp3 = 0;
	
	boolean p1isRight = false;
	boolean p2isRight = false;
	boolean p3isRight = false;
	
	int targetNumber = (int) (Math.random() * 10);
	System.out.println("Im thinking of a number between 0 and 9");
	
	while (true) {
		System.out.println("Number to guess is " + targetNumber);
	
	p1.guess();
	p2.guess();
	p3.guess();
	
	guessp1 = p1.number;
	System.out.println("Player one guess is " + targetNumber);
	
	guessp2 = p2.number;
	System.out.println("Player two guess is " + targetNumber);
	
	guessp3 = p3.number;
	System.out.println("Player three guess is " + targetNumber);
	
	if (guessp1 == targetNumber); {
		p1isRight= true;
	}
	
	if (guessp2 == targetNumber); {
		p2isRight= true;
	}
	
	if (guessp3 == targetNumber); {
		p3isRight= true;
	}
	
	if (p1isRight || p2isRight || p3isRight) {
		
		System.out.println("We have a winner!");
		System.out.println("Player one got it Right " + p1isRight);
		System.out.println("Player two got it Right " + p2isRight);
		System.out.println("Player three got it Right " + p3isRight);
		System.out.println("Game Over");
		break;}
		
		else {
			
			System.out.println("Try again all numbers are incorrect");
			
		}
	}
	
}
}


