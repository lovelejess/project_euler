

public class four {
	//working on two digit numbers first. 91 x 99 = 9009
	static Boolean flag = true;
	
	private static Boolean isPalindrome(String test){
	// tests if the input string is a palindrome
	// returns true if it is a palindrome, otherwise false 
		
		int sLen = test.length()-1;
		int f = 0;
		int l = sLen;
			
		while((flag == true) && (f < sLen) && (l > 0)){
			if(test.charAt(f) == test.charAt(l)){
				f++;
				l--;
			}
			else flag = false;
		}
		return flag;
	}
	
	public static int palindrome(){
		
		//int largest = 1;
		//int curr = 1;
		
		Integer largest = 1;
		Integer curr = 1; 
		String sCurr;
		
		// iterate through to find all possible combinations of 2 X 2 integers
		// and determine if they are palindromes
		for (int m = 1; m <= 999; m++) {
			for (int n = 1; n <= m; n++) {
				curr = m * n;
				System.out.println(m + " * " + n + " = " + curr);
				
				sCurr = curr.toString(); 
				
				if(sCurr.length() % 2 == 0){// if string length even then continue 
					if(isPalindrome(sCurr) == true){
						System.out.println(sCurr);
						if (curr > largest){
							largest = curr;
						}
						
					}
				}
				flag = true;
				
				}				
			}
		return largest;
	}
	
	public static void main(String args[]){
		System.out.println("Largest palindrome is: " + palindrome());
	}

}
