package Methods_09;

public class Emirp {
	
	public static boolean isPrime(int x) {
		for(int i = 2; i <= x / 2; i++) {
			if(x % i == 0) return false;
		}
		return true;
	}
	
	public static int reversedInt(int x) {
		int res = 0;
		
		while(x!=0) {
			int digit = x % 10;
			
			res = res * 10 + digit;
			x /= 10;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		(Emirp) An emirp (prime spelled backward) is a nonpalindromic
//		prime number whose reversal is also a prime. For example, 17
//		is a prime and 71 is a prime, so 17 and 71 are emirps. Write a program 
//		that displays the first 120 emirps. Display 10 numbers per line, separated
//		by exactly one space, as follows:
		int ctr = 0, num = 13;
		
		while(ctr < 120) {
			if(isPrime(num) && isPrime(reversedInt(num))) {
				System.out.print(num + " ");
				ctr++;
				
				if(ctr % 10 == 0)System.out.print("\n");
			}
			num++;
			
		}
		
	}

}
