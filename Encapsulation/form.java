import java.util.Scanner;
public class form {

	public static void main(String[] args) {
		// practice 
		
		Scanner s = new Scanner(System.in);
		form_ f =new form_();
		
		System.out.println("Enter name: ");
		String n = s.next();
		f.setName(n);
		
		System.out.println("Enter Address: ");
		String a = s.next();
		f.setAdd(a);
		
		System.out.println("Enter phone no: ");
		int p = s.nextInt();
		f.setPhone(p);
		
		System.out.println("Enter rollno: ");
		int r = s.nextInt();
		f.setRollno(r);
		
		System.out.println("name: "+f.getName());
		System.out.println("Address: "+f.getAdd());
		System.out.println("Phone no.: "+f.getPhone());
		System.out.println("Rollno.: "+f.getRollno());
	}

}
