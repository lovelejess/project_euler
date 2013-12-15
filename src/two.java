
public class two {
	
	public static int recFib(int n){
		if(n == 0) return 0;
		if(n == 1) return 1;
		else return recFib(n-1) + recFib(n-2);		
	}
	
	public static void main(String args[]){
		int total = 0; // sum of all evens 
		int curr = 0;  // value returned for fib
		int count = 0; // count for n;
		while(curr < 4000000){
			System.out.println("Curr is : " + curr);
			if(recFib(count) % 2 == 0){
				//System.out.println(total);
				curr = recFib(count);
				total = total + curr;
			}count++;
			System.out.println(total);
		}
		
	}
}
