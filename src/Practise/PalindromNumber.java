package Practise;

public class PalindromNumber {

	public static void main(String[] args) {
		
		int var = 123321;
		int orgvar = 0;
		int actvar = var;
		
		while(var!=0){
			
			orgvar = orgvar*10+var%10;
			var = var/10;
		}
		
		if(actvar==orgvar) {
			System.out.println("It's a palindrom Number");
		}
		else {
			System.out.println("It's not a palindrom Number");
		}
	}

}
