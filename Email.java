import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	// local 
	private int mailCapacity = 500;
	private String alternateEmail;
	private static String companySuffix = "HELLYOT.com"; 
	
	public Email(String firstName , String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email CREATED : "+firstName+" "+lastName);
		this.department = setDepartment();
		this.password = setPassword();
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department.toLowerCase()+"."+companySuffix.toLowerCase();
	}
	
	private  String setDepartment() {
		System.out.print("Enter Department\n1 for sales\n2 for development\n3 for Accounting\n0 for none\n");
		Scanner sc = new Scanner(System.in);
		int depChoice =  sc.nextInt();
		switch (depChoice) {
		case 1: return "Sales";
		case 2: return "Development";
		case 3: return "Accounting";
		case 0: return "None";
		default: return "";
		}
	}
	private String setPassword() {
		  String NUMBERS = "0123456789";
	        String LETTERS_UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        String LETTERS_LOWER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();
	        String SYMOPLES = "@!#%$";
	        String container = NUMBERS + LETTERS_LOWER_CASE + LETTERS_UPPER_CASE +SYMOPLES;
	        Random randomPick = new Random();
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter Password Size");
	        int passwordSize = scanner.nextInt();
	        StringBuilder password = new StringBuilder();
	        
	        for (int i = 0; i < passwordSize; i++) {
	            char getter = container.charAt(randomPick.nextInt(container.length()));
	            password.append(getter);
	        }
	        scanner.close();
	        return password.toString();
	}


	public void setMailCapacity(int mailCapacity) {
		this.mailCapacity = mailCapacity;
	}
	public int getMailCapacity() {
		return mailCapacity;
	}
	
	public void changePassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return this.password;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	@Override
	public String toString() {
		return "Email:"+email+" >>> "+"Password:"+password+"\n"+"department:"+department+" >>> "+"mail Capacity"+mailCapacity+"Mb";
	}



		
}
