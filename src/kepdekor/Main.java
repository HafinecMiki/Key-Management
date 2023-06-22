package kepdekor;

public class Main {
	public static void main(String[] args) {
		KeyManager km = new KeyManager();
		
		int a1=km.getKey(); // a1=0
		System.out.println("a1=" + a1);
		
		int a2=km.getKey(); // a2=1
		System.out.println("a2=" + a2);
		
		int a3=km.getKey(); // a3=2
		System.out.println("a3=" + a3);
		
		km.releaseKey(a2); // 1 most már szabad
		
		int a4=km.getKey(); // a4=1
		System.out.println("a4=" + a4);
		
		km.releaseKey(a1);
		km.releaseKey(a3);
		km.releaseKey(a4);
		
		// minden kulcs ismét szabad
		System.out.println("Minden kulcs ismet szabad.");
		//km.getRooms();	
	}
}
