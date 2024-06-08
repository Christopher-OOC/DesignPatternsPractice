package singleton_pattern;

public class SingletonTest {
	
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		singleton1.setAge(23);
		singleton1.setName("Olojede Christopher");
		
		Singleton singleton2 = Singleton.getInstance();
		singleton2.setName("Olojede Olamide Christopher");
		
		if (singleton1 == singleton2) {
			System.out.println("Wow!!!");
		}
		
		System.out.println(singleton1);
		System.out.println(singleton2);
		
		
	}

}
