
public class OperatorEx11 {
	public static void main(String [] args) {
		
		boolean t = true;
		boolean f = false;
		boolean result;
		
		result = t && f;
//		both of them have to be true otherwise false
//		we expect false
		
		System.out.println("t && f :" + result);
//		as we expected, it resulted false
		
		result = t||f;
		System.out.println("t || f :" + result);
		
		result = !t;
		System.out.println("!t :" + result);
		
		
		
	}

}
