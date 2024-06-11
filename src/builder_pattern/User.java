package builder_pattern;

import java.util.Date;

public class User {
	
	private int userId;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String password;
	
	private Date dateRegistered;
	
	public User() {
		
	}

	public User(int userId, String firstName, String lastName, String email, String password, Date dateRegistered) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dateRegistered = dateRegistered;
	}
	
	private User(UserBuilder builder) {
		this.userId = builder.userId;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.email = builder.email;
		this.password = builder.password;
		this.dateRegistered = builder.dateRegistered;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateRegistered() {
		return dateRegistered;
	}

	public void setDateRegistered(Date dateRegistered) {
		this.dateRegistered = dateRegistered;
	}
	
	public static UserBuilder builder() {
		return new UserBuilder();
	}
	
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", dateRegistered=" + dateRegistered + "]";
	}
	
	public static class UserBuilder {
		
		private int userId;
		
		private String firstName;
		
		private String lastName;
		
		private String email;
		
		private String password;
		
		private Date dateRegistered;
		
		private UserBuilder() {
			
		}
		
		public UserBuilder userId(int id) {
			this.userId = id;
			
			return this;
		}
		
		public UserBuilder firstName(String firstName) {
			this.firstName = firstName;
			
			return this;
		}
		
		public UserBuilder lastName(String lastName) {
			this.lastName = lastName;
			
			return this;
		}
		
		public UserBuilder email(String email) {
			this.email = email;
			
			return this;
		}
		
		public UserBuilder password(String password) {
			this.password = password;
			
			return this;
		}
		
		public UserBuilder dateRegistered(Date date) {
			this.dateRegistered = date;
			
			return this;
		}
		
		public User build() {
			return new User(this);
		}
	}
}
