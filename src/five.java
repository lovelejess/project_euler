
public class five {
	// 2520 is divisible by each number 1-10
	// find smallest positive that is divisible by each number 1-20
	static boolean flag = false;
	
	static private boolean divByTwenty(int number){
		for(int i = 1; i <= 10; i++){ // for test purposes by 10 first 
			if((number % i) == 0) {
				flag = true;
			}
		}
		return flag;
	}
	
	public static void main(String args[]){
		int num = 1;
		
		while(flag == false){
			System.out.println("Testing number: " + num);
			if((divByTwenty(num)) == true){ 
				System.out.println("Lowest positive number divisible by 1-20 is: "+ num);
				System.exit(0);
			}
			else num++;
		}
	
		System.out.print("Program finished. Exiting.");
	}
}
