
public class one{

	public static void main(String args[]){
		int total = 0;
		int var = 0;
		
		while(var < 1000){
			if((var % 3 == 0) || (var % 5 == 0)){
				total = total + var;
				System.out.println(total);
			}
			var++;			
		}
	}
}