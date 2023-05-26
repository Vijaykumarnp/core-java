
public class Task {

	public static void main(String[] args) {
		
		int h = 6;
		int count = 0;
		for (int i = 1; i <= h; i++) {
			if(h%i == 0 ) {
				count = count+1;
				
			}
			
		}
		System.out.println(count);	
		if(count == 2) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
		
		
		
		
	}
	
	
	
}
