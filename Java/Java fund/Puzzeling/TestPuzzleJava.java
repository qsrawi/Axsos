import java.util.Random;


public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		int [] rolls =new int[10];
		rolls =generator.getTenRolls();
		System.out.println(rolls[1]);

        char letter =generator.getRandomLetter();
		System.out.println(letter);

		String password =generator.generatePassword();
		System.out.println(password);
	}
}
