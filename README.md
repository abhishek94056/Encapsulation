Q. What is Encapsulation?
A. The Encapsulation is the process of binding together logically related data.

Q. Why to achieve it?
A. For easy accessibility and security purpose

Getter & Setter methods:
Getter method - The method which GETS the value of variable.
Setter method - The method which SETS the value of variable.

Q. Why to use Getter & Setter methods?
A. To access private data of some class outside that class.

Bullet points:

The Getter method ALWAYS returns some data; its return type can never be void.
The Getter method NEVER has a parameter.
The Getter method is ALWAYS publicly available.
The Setter method NEVER returns a value; its return type is ALWAYS void.
The Setter method ALWAYS has a parameter.
The Setter method is ALWAYS publicly available.
The Getter & Setter methods are ALWAYS written in camel case.

Tasks:

1. WAP to accept employee details from the user and assign them to variables using setter methods. 
   Print all details using getter method. 
   The Employee class has all variables as private.

2. WAP to accept student details from the user and assign them to variables using setter methods. 
   Print details of topper using getter method. 
   The student class has all variables as public but address and phone are private.

   Q. Create Pattern class with following constructors:

3. non-parameterized constructor: If object is created using this constructor then it should greet Welcome to the user.

4. parameterized constructor with 1 character parameter: If object is created using this constructor then it should print right angle triangle pattern of 5 lines using given character.

5. parameterized constructor with 1 character parameter and 1 noOfLines parameter: If object is created using this constructor then it should print right angle triangle pattern using given character for given number of lines.

6. Create following classes:

public class Student {
	public String name;
	public Address addr;
	public long phone;
	public String emailId;
}

public class Address {
	public String area;
	public String locality;
	public String country;
	public int pincode;
}

Write getter and setter methods for every variable in both classes. Create one object for yourself. Accept all values from user using Scanner class.
