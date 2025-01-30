
public class Student_ {
	//WAP to accept student details from the user and assign them to variables using setter methods. 
	//Print details of topper using getter method. 
	//The student class has all variables as public but address and phone are private.
	
	public String name;
	public int marks;
	private String address;
	private int phone;
	
	public Student_(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	
	public void setAddress(String address)
	{
		this.address =address;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setPhone(int phone)
	{
		this.phone = phone;
	}
	
	public int GetPhone()
	{
		return phone;
	}
	
	
	
	
	
	
	
	
	

}
