public class practice {
	
	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		ar.add("10");
		ar.add("20");
		
		Iterator it=ar.it();
		while(it.hasNext()) {
			Object ob=it.next();
			System.out.println(ob);
		}
		
	}
	
}
