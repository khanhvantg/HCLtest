

class Main{
	public static void main(String[] args) throws Exception{ 		
		
		//Fill your code
		
		Scanner s = new Scanner(System.in);
		String name, username,password;
		Long phoneNumber;
		
		User userOne = new User();
		User userTwo = new User();
		
		System.out.println("Enter Name");
		userOne.setName(s.nextLine());
		System.out.println("Enter UserName");
		userOne.setUsername(s.nextLine());
		System.out.println("Enter Password");
		userOne.setPassword(s.nextLine());
		System.out.println("Enter PhoneNumber");
		userOne.setPhoneNumber(s.nextLong());
		
		System.out.println("Enter Name");
		userTwo.setName(s.nextLine());
		System.out.println("Enter UserName");
		userTwo.setUsername(s.nextLine());
		System.out.println("Enter Password");
		userTwo.setPassword(s.nextLine());
		System.out.println("Enter PhoneNumber");
		userTwo.setPhoneNumber(s.nextLong());
		
		userOne.comparePhoneNumber(userOne, userTwo);
		if(userOne.flag)
			System.out.println("Same Users");
		else System.out.println("Different Users");
	}
}