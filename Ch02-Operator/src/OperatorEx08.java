
public class OperatorEx08 {
	
	public static void main(String [] args) {
		
		int a = 10;
		float b = 10.0f;
		
//		if(���ǽ�:true) {
//		()���� ������ ���� ��쿡�� {}���� ����
		
		if(a == b) {
//			a�� bŸ���� ���� ����. a�� ����, b�� �Ǽ� 
//			��a�� �ڵ����� �Ǽ��� ����ȯ�ż� �Ǽ��� �Ǽ��� ����Ǿ���
//			int�� float�� �ڵ� ��ȯ�Ǿ���
			
			
			System.out.println("a�� b�� �����ϴ�.");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			
			System.out.println("=======================");
			
			char c = '0';
//			1byte
//			ĳ�����̹Ƿ� ���� 0�� ���ڷ� ó����
			int d = 0;
//			4byte
			
			System.out.println(c);
			System.out.println(d);
			
			
			if(c != d) {
//				char-->int�� ��ȯ�ؾ� ���� �񱳰� ����
//				��ȯ�� ���� �տ� (int)�Է�, ���� 0�� 48�� ����� ����
				
				System.out.println("c�� d�� ���� �ʽ��ϴ�.");
				System.out.println((int)c);
				System.out.println(d);
				
				char e = 'A';
				int f = 65;
				
				if(e == f) {
				System.out.println("e�� f�� �����ϴ�.");	
				System.out.println(e);
				System.out.println((char)f);
				System.out.println((int)e);
					
				}
				
				
			}
			
		}
		
		
		
	}

}