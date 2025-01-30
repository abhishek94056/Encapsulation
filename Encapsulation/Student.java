import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
	
		Scanner i = new Scanner(System.in);
		
		Student_ s = new Student_("abhi",72);
		System.out.println("Enter Student address: ");
		String b = i.nextLine();
		s.setAddress(b);
		System.out.println("enter student phone: ");
		int p = i.nextInt();
		s.setPhone(p);
		System.out.println(s.name);
		System.out.println(s.marks);
		System.out.println(s.getAddress());
		System.out.println(s.GetPhone());

	}

}
