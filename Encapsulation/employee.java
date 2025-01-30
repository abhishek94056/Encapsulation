import java.util.Scanner;
public class employee {

	public static void main(String[] args) {
		//WAP to accept employee details from the user and assign them to variables using setter methods. 
		//Print all details using getter method. 
		//The Employee class has all variables as private.
		Scanner s = new Scanner(System.in);
		
		employee_ e = new employee_();
		
		System.out.println("Enter employee good name: ");
		String k = s.next();
		e.setE_name(k);
		
		System.out.println("Enter Employee Id: ");
		int a = s.nextInt();
		e.setE_id(a);
		
		System.out.println(e.getE_name());
		System.out.println(e.getE_id());
		
		

	}

}
