
public class Toolking {

	public Toolking() {
		System.out.println(this.getClass().getSimpleName() + "object is created");
		
		Toolking tool  = new Toolking();
		System.out.println(tool);
		
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		Toolking tool = new Toolking();
		System.out.println(tool);
		System.out.println("main ended");
	}
}
