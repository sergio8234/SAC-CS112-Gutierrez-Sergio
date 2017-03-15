package rock_paper_scissors;

 import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissors {
public static void main(String args[]) {
    // Arrays of moves: move name, beaten by 
    String[][] moves = { { "rock", "paper", },
            { "scissors", "rock", },
            { "paper", "scissors", },
    };
    String choice;
    int num = 0;
    Random r = new Random();
    num = r.nextInt(3);

    System.out.print("Choose: ");
    for (int i = 0; i < moves.length; i++ ) {
        if (i > 0)
            System.out.print(", ");             
        System.out.print(moves[i][0]);
    }
    System.out.println(".");
    Scanner userChoice = new Scanner(System.in);
    choice = userChoice.next().toLowerCase();

    System.out.println("System chose " + moves[num][0]);
    if (choice.matches(moves[num][0])) {
        System.out.println("Its a tie!");
    } else if (choice.matches(moves[num][1])) {
        System.out.println("You win!");
    } else {
        System.out.println("You lose!");
    }
}
}
			
			
			
		
		
		
		
	

