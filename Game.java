package Test;
import java.util.Random;
import java.util.Scanner;

   public class Game{
	
	   
	   
	   
	public static void main(String arg[]) {
		
		
		// System Objects
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		
		// Game Variables
		String[] opponents = {"Dragon","Cop","Dianasours","Anaconda"};
		int maxOpponentTime = 75;
		int timeLoss = 25;
		
		// Prince of Perasia
		int time = 100;
		int timeWasted = 50;
		int emptyCells = 5;
		int bonusTime = 50;
		
		boolean escaping = true;
		
		System.out.println("\t# WELCOME TO PRINCE OF PERASIA #");
		System.out.println("\t    Change the future     ");
		
		
		GAME:
		while(escaping) {
			System.out.println("\n\n\t__________________FRESH ATTEMPT________________________");
			
			int opponentTime = rand.nextInt(maxOpponentTime);
			String opponent = opponents[rand.nextInt(opponents.length)];
			
			System.out.println("\n\n\t" + opponent + " ahead\n");
			
			while(opponentTime>0) {
				System.out.println("\tTime left is " + time + " seconds");
				System.out.println("\tThe time " + opponent + " can spend on catching a prince is " + opponentTime + " seconds.");
				System.out.println("\n\t__WHAT DO YOU CHOOOSE TO DO ?__");
				System.out.println("\t1. Attack the Opponent.");
			    System.out.println("\t2 Gain Power!!!! .");
			    System.out.println("\t3. Befriend the Opponent.");
			    
			    String input = in.nextLine();
			    
			    if(input.equals("1")) {
			    	int damageDealt = rand.nextInt(timeLoss);
			        int damageTaken = rand.nextInt(timeWasted);
			        
			        opponentTime -= damageDealt;
			        time -= damageTaken;
			        
			       
			        
			        if(time<1) {
			        	System.out.println("\tThe Opponents have you now. Restart.");
			        	break;
			        }
			    }
			    
			    else if(input.equals("2")) {
			    	if(emptyCells>0) {
			    		time += rand.nextInt(bonusTime);
			    		emptyCells--;
			    		System.out.println("\tYou now have " + time + " seconds to go.");
			    	}
			    	else {
			    		System.out.println("\t  Fight>>>>>>>>>>>.");
			    	}
			    }
			    
			    else if(input.equals("3")) {
			    	System.out.println("\tYou are a clever brat! Go ahead with your mission");
			    	time -= rand.nextInt(5);
			    	
			    	continue GAME;
			    }
			    
			    else {
			    	System.out.println("\tYou are rebellious! Choose Again. ");
			    }
			    	
			}
			if(time<1) {
				break;
			}
			
			System.out.println("\tThe way ahead is clear.");
			System.out.println("\tYou recieved bonus time.");
			time += rand.nextInt(bonusTime);
			System.out.println("\tTime left with you is " + time + " seconds");
			
			
		
			
		System.out.println("\t## WHAT WOULD YOU LIKE TO DO NOW? ##");
		System.out.println("\t1. Continue with the mission ");
		System.out.println("\t2. Give up the idea.");
		
		String input = in.nextLine();
		
		while(!input.equals("1") && !input.equals("2")) {
			System.out.println("\tDon't rebel and choose amongst the provided options, please.");
			input = in.nextLine();
		}
		
		if(input.equals("1")) {
			System.out.println("\tGood Luck with the escape plan.");
		}
	
		else if(input.equals("2")){
				System.out.println("\tGood Luck with your survival.");
			    break;
		}		
	
      }
   }
}
	