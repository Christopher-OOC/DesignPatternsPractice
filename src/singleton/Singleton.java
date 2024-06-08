package singleton;

public final class Singleton {
	
	private static Singleton singleton;
	
	private String name;
	
	private int age;
	
	private Singleton() {
		
	}
	
	public static synchronized Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		
		return singleton;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Singleton [name=" + name + ", age=" + age + "]";
	}
}
