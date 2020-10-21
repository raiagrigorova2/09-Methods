package Methods_09;

public class palindromicPrime {
	
	public static boolean isPrime(int x) {
		for(int i = 2; i <= x / 2 ; i++) {
			if(x % i == 0)return false;
		}
		return true;
	}
	
	public static boolean isPalindrome(int x) {
		String s = String.valueOf(x);
		
		int l = 0, r = s.length() - 1;
		
		if(l == r)return true;
		
		while(l < r) {
			if(s.charAt(l)!=s.charAt(r))return false;
			
			l++;
			r--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ctr=0;
		
		int num = 2;
		while(ctr < 120) {
			if(isPrime(num) && isPalindrome(num)) {
				System.out.print(num + " ");
				ctr++;
				
				if(ctr % 10 == 0) {System.out.println();}
			}
			num++;
		}
	}

}
