package builder_pattern;

public class BuilderPatternTest {
	
	private volatile Student student;
	
	public BuilderPatternTest() {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				student = Student.Builder.newInstance()
							.setId(1)
							.setName("Christopher")
							.setAddress("Lagos")
							.build();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				student = Student.Builder.newInstance()
							.setId(2)
							.setName("Richard")
							.setAddress("Abeokuta")
							.build();
			}
		});
		
		t1.start();
		t2.start();
	}
	
	public Student getStudent() {
		return student;
	}
	
	public static void main(String[] args) {
		BuilderPatternTest test = new BuilderPatternTest();
		
		System.out.println(test.getStudent());
	}

}
