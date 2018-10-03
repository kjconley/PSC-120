package Hello;

public class Hello {

	public void run() {
		System.out.println("Hello, world!");
	}
	
	public static void main(String[] args) {
		Hello h = new Hello();
		h.run();
		System.exit(0);
	}
}
