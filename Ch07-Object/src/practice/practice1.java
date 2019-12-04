package practice;



class Outer{
	private String name;
	private int num;
	
	public Outer(String name) {
		this.name=name;
		num=0;
	}
	
	public void whats() {
		num++;
		System.out.println("outer "+ name + " outer "+num);
	}
	
	class Inner{
		public Inner() {
			whats();
		}
	}
}

	public class practice1 {

		

		public static void main(String[] args) {
			Outer outer1=new Outer("alice");
			Outer outer2=new Outer("steve");
			
			outer1.whats();
			outer2.whats();
			
			
			
	}	
}

