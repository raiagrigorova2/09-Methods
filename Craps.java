package Methods_09;

import java.util.Random;

public class Craps {
	
	public static boolean craps(int val) {
		if(val == 2 || val == 3 || val == 12) {
			System.out.println("Craps! You lose!");
			return true;
		}
		return false;
	}
	
	public static boolean natural(int val) {
		if (val == 11 || val ==7) {
			System.out.println("Natural. You win!");
			return true;
		}
		return false;
	}
	
	
	public static void print(int dice1, int dice2, int sum) {
		System.out.println("Dice 1: " + dice1 +" Dice 2: " + dice2 + " Sum:" + sum);
	}
	
	
	public static void anotherValue(int dice1, int dice2, int sum, int val) {
		Random r = new Random ();
		
		while(true) {
			dice1 = r.nextInt(6) + 1;
			dice2 = r.nextInt(6) + 1;
			
			sum = dice1 + dice2;
			
			print(dice1, dice2, sum);
			
			if(sum == 7) {
				System.out.println("You lose!");
				return;
			}
			
			else if(sum == val){
				System.out.println("You win!");
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Craps is a popular dice game played in casinos. Write a program to play a
		 * variation of the game, as follows: Roll two dice. Each die has six faces
		 * representing values 1, 2, . . ., and 6, respectively. Check the sum of the
		 * two dice. If the sum is 2, 3, or 12 (called craps), you lose; if the sum is 7
		 * or 11 (called natural), you win; if the sum is another value (i.e., 4, 5, 6,
		 * 8, 9, or 10), a point is established. Continue to roll the dice until either
		 * a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise,
		 * you win. Your program acts as a single player. Here are some sample runs.
		 */
		//the sums are 2,3,4,5,6,7,8,9,10,11,12
		
		Random r = new Random();
		int dice1 = r.nextInt(6) + 1;
		int dice2 = r.nextInt(6) + 1;
		
		int sum = dice1 + dice2;
		
		print(dice1, dice2, sum);
		
		if(craps(sum)) {
			return;
		}
		
		else if(natural(sum)){
			return;
		}
		
		else {
			int val = sum;
			
			anotherValue(dice1, dice2, sum, val);
		}
		
	}

}
