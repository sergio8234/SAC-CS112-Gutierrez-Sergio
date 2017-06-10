import java.util.Scanner;
public class Main {

	
	
	public static void main(String[]args){
		
		int compnum;
		String player; 
		String response = "y";
		int play = 0;
		double result;
		int win = 0;
		int loss = 0;
		String yo;
		
		Scanner input = new Scanner(System.in);
		do{
		play = play + 1;
		System.out.println("Let's play a game, guess if I am going to roll even or odd.");
		player = input.next();
		compnum = 1+(int)(Math.random()*6);
		
		System.out.println("I rolled:" +compnum);
		
		System.out.println("Did you guess it right? (y/n)");
		yo = input.next();
		
		if (yo.equals(response)){
			win = win + 1;
			System.out.println("You win!");
			
		}
		else {
			loss = loss + 1;
			System.out.println("You lose");
			
		}
		
		String [] score = new String [1];
		for (int i = 0; i < score.length; i++){
			score[i] = player;
		}
		
		String[] anwser = new String[1];
		for (int l = 0; l < anwser.length; l++){
			anwser[l] = yo;
		}
		System.out.println("Want to play again? (y/n)");
		player = input.next();
		
		if (player.equals(response)){
			System.out.println("Okay, let's play again!");
		}
		else{
			System.out.println("Goodbye"); 
			for (int j = 0; j < score.length; j++){
				System.out.println("Here is your history " +score[j]);
				}
			for (int a = 0; a <anwser.length; a++){
				System.out.println("You responded: " +anwser[a] );
			}
			break;
		}
		
	
		
		}while(true);
		
		result = win/play*100;
		System.out.println("You winning percentage is: " +result);
		
		input.close();
	}
}