import java.util.Scanner;

public class Example_ {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Example c = new Example();
		
		System.out.println("Enter company name: ");
		c.setCompany(s.next());
		
		System.out.println("Enter color: ");
		c.setColor(s.next());
		
		System.out.println(c.getCompany());
		System.out.println(c.getColor());
	}
}