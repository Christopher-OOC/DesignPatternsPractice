package builder_pattern;

import java.util.Date;

public class TestUser {
	
	public static void main(String[] args) {
		User user1 = User.builder()
						.userId(1)
						.firstName("Christopher")
						.lastName("Olojede")
						.email("olojedechristopher@gmail.com")
						.password("1234567")
						.dateRegistered(new Date())
						.build();
		
		User user2 = User.builder()
				.userId(2)
				.firstName("Richard")
				.lastName("Olojede")
				.email("olojederichard@gmail.com")
				.password("7654321")
				.dateRegistered(new Date())
				.build();
		
		System.out.println(user1);
		System.out.println(user2);
	}

}
