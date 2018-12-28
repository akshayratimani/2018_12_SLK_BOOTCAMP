### Assignment 1

1. Write a brief history of Java Programming Language
2. Explain Primitive types in Java
3. What are the different programming constructs in java? Explain with examples.

---

### Assignment 2

Implement the body for the following function:


````java
static boolean isValidDate(int year, int month, int day) { 
	// do stuff here
	return false; 
}
````

The function should check if the parameter values constitute a valid calendar date or not. Accordingly return true or false.


For example,


1) year=2018, month=13, day=1 is an invalid date as the possible values for month is 1 to 12.
2) year=2018, month=2, day=29 is an invalid date as the maximum days in February is 28 in the year 2018
3) year=2016, month=2, day=29 is a valid date.

Write a Java program to call the above function multiple times with different values.


---

### Assignment 3

Implement the body for the following function:

````java
static boolean isPrimeNumber(int num) { 
	// do stuff here
	return false; 
}
````

The function should check and return true only if the number passed as argument is a prime number.
  
Write a Java program to call the above function multiple times with different values.


---

### Assignment 4

Write a function called "sortThreeNumbers", which takes 3 distinct integers and prints them in ascending order.

````java
public static void sortThreeNumbers(int a, int b, int c) { 
	// do stuff here
}

````
For example,

* sortThreeNumbers(2, 10, 1); // prints 1, 2, 10 
* sortThreeNumbers(20, 10, 1); // prints 1, 10, 20 
* sortThreeNumbers(2, 10, 100); // prints 2, 10, 100 and so on.


Write a Java program to call the above function multiple times with different values.

---

### Assignment 5

Write a function called "sumOfPrimes", that takes two integers as input and returns the sum of all the prime numbers between the same.

````java
public static int sumOfPrimes(int from, int to) { 
	// do stuff here
	return 0; 
}
````

Write a Java program to call the above function multiple times with different values.


---

### Assignment 6

In mathematics, the Fibonacci numbers are the numbers in the following integer sequence, characterized by the fact that every number after the first two numbers is the sum of the two preceding ones:

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

Write a function called "fibonacci", that takes index as paramter and returns the fibonacci number at that index.

````java
public static int fibonacci(int index) { 
	// do stuff here
	return 0; 
}
````

---

### Assignment 7

Write a Java program to print the following pattern:

````
*
**
***
****
*****
````

The number of rows should be based on the value of a variable "num", and the number of stars in a row is based on the row number itself.


---

### Assignment 8

In trignometry, the Sine of an angle is represented by the series below:

<img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/3d9689077ce39529e3198213901261ebcf48197d">


Write a Java function that accepts angle in degrees and returns the sine of the given angle.


Call the function in main, multiple times by supplying multiple values and verify the same.

PS:
* Divide the function into small reusable functions, if possible.
* Do not use builtin Java classes like `Math`
* Inside the **sine** function, use a loop that iterates for **n** times (for example 10)
---

### Assignment 9


Implement the Java function listed below:

````java
public static void printCalendar(int month, int year) {
	/// do stuff here
}
````

The function should accept `month` and `year` and print the calendar for the same. If inputs are invalid, appropriate error message/s should be printed.

Sample output for the inputs (8, 2018):

````
Su Mo Tu We Th Fr Sa  
          1  2  3  4  
 5  6  7  8  9 10 11  
12 13 14 15 16 17 18  
19 20 21 22 23 24 25  
26 27 28 29 30 31  
````

PS: 
* Do not use any builtin Java classes like `Date` or `Calendar`
* Divide the function into small reusable functions, if possible.

---


### Assignment 10
Write a function called "sumOfEvensAndOdds", that takes an array of integers as input and returns another array of integers of length 2. The first element in the returned array is the sum of all even numbers in the input array, and the second element in the returned array is the sum of all odd numbers in the input array.

````java
public static int[] sumOfEvensAndOdds(int []nums) { 
	// do stuff here
	return null;
}
````

For example,
 
````java
int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
int [] result = sumOfEvensAndOdds(nums);
// result should be equal to {30, 25}
````

Hint:

An arrays is created as shown below:

````java
int []arr = new int[2];
arr[0] = 12;
arr[1] = 100;
````

or

````java
int []arr = {12, 100}
````

Call the function in main, multiple times by supplying multiple values and verify the same.

---

### Assignment 11
Write a function called "reverseByWords", that takes a sentence (string) as an input, and returns another string. The return value must be a sentence in which the words in the original sentence appear in reverse order.

````java
public static String reverseByWords(String sentence) { 
	// do stuff here
	return null; 
}
````


For example,

````java
String out = reverseByWords("my name is vinod and i live in bangalore");
// the variable "out" should be equal to "bangalore in live i and vinod is name my".
````

Call the function in main, multiple times by supplying multiple values and verify the same.

---
### Assignment 12


Write a function called "inWords" that takes a number between 1 and 99,99,99,999 and returns a String representing the input number in words.

````java
public static String inWords(int num) { 
	// do stuff here
	return null; 
}

````
For example,

````java
inWords(12345);
// should return "twelve thousand three hundred forty five"
inWords(10203040);
// should return "one crore two lakh three thousand forty"
inWords(101);
// should return "one hundred one"
````


Call the function in main, multiple times by supplying multiple values and verify the same.


---
### Assignment 13

Implement the following function:

```java
public static String generatePassword(int length) {
	// do stuff here
}
```

The function should return a random string, each time when called, of required length (function argument). The password consists of lower case and upper case alphabets, digits from 0 to 9, special characters ~!@#$%^&*



Hint: 

`Math.random()` returns a number between 0.0 and 1.0


---
### Assignment 14

Implement the following function:

```java
public static void printAllCombinations(String word) {
	// do stuff here
}
```

The function should take a word (no spaces and special characters, only alpha numeric), and print all possible combinations of letters in the given word.

For example, for the input "win", the output should be:

```
[iwn, nwi, inw, wni, win, niw]
```

And for the input "vinod", the output should be:
```
[vidon, vonid, doniv, dovin, inodv, ivdon, vdnio, nivod, ovdin, ivodn, viodn, noidv, 
ondiv, dvoni, vidno, indvo, ivdno, nvodi, oindv, oivdn, idvon, dnovi, idnov, nvdoi, 
onidv, doinv, vndoi, voind, noivd, vdion, iovnd, ovidn, nvoid, idvno, ionvd, dvnoi, 
vnido, oidvn, vdoni, ndivo, vindo, novdi, idnvo, ndoiv, oidnv, dionv, vndio, iovdn, 
iondv, viond, ndvoi, odniv, odvin, diovn, nodiv, nviod, onvdi, vodni, invod, ovndi, 
vinod, dinov, vodin, divon, donvi, nvdio, ivnod, idonv, ovdni, dvion, nidov, ovnid, 
ondvi, niodv, idovn, ndvio, onvid, dvino, divno, vnoid, dnoiv, odivn, ndiov, vondi, 
nvido, dnivo, dinvo, dnvoi, odinv, dvoin, iodnv, nidvo, doivn, invdo, ovind, vdoin, 
iodvn, vnodi, oinvd, ndovi, vdino, ivndo, onivd, nivdo, oivnd, inovd, ivond, dnvio, 
odnvi, voidn, novid, dniov, dovni, vniod, nodvi, odvni, vdnoi, dvnio, indov, niovd]

```

Call the function in main, multiple times by supplying multiple values and verify the same.

---
### Assignment 15

Create classes `Circle` and `Cylinder` as shown in the *UML* diagram below:

![](http://www.ntu.edu.sg/home/ehchua/programming/java/images/ExerciseOOP_CircleCylinder.png "")


In the `main()` function of a Program class, create an array of `Circle` references with the initialization shown below:

````java
Circle[] circles = {
	new Cylinder(12.34),
	new Cylinder(12.34, 10.0),
	new Cylinder(12.34, 10.0, "blue")
};

````

Print the area of the circular region of each cylinder along with the volume of the same.


---
### Assignment 16

Create the classes `Person`, `Student`, and `Staff` as shown in the *UML* diagram below:

![](http://www.ntu.edu.sg/home/ehchua/programming/java/images/ExerciseOOP_PersonAndSubclasses.png "")



In the `main()` function of a Program class, create an array of `Person` references with the initialization shown below:

````java
Person[] people = {
	new Student("Shyam", "Bangalore, Karnataka", "Java fundamentals", 2010, 4500.0),
	new Staff("Anand", "Bangalore, Karnataka", "Delhi Public school", 35000.0), 
	new Staff("Umesh", "Bangalore, Karnataka", "National Public school", 42000.0), 
	new Student("Suresh", "Hassan, Karnataka", "Java fundamentals", 2012, 4750.0),
	new Student("Kiran", "Vasco, Goa", "Reactjs", 2017, 12500.0)
};

````

Print the details of all `Person` objects (using the `toString()`).


---

### Assignment 17

Create the classes `Shape`, `Circle`, `Rectangle`, and `Square` as shown in the *UML* diagram below:


![](http://www.ntu.edu.sg/home/ehchua/programming/java/images/ExerciseOOP_ShapeAndSubclasses.png "")


The `toString` function of the above classes should return text as given below:

Classname|Sample return value from toString()
---|---
Shape|A Shape with color of xxx and filled/Not filled
Circle|A Circle with radius=xxx, which is a subclass of yyy (where yyy is the output of the toString() method from the superclass)
Rectangle|A Rectangle with width=xxx and length=zzz, which is a subclass of yyy (where yyy is the output of the toString() method from the superclass)
Square|A Square with side=xxx, which is a subclass of yyy (where yyy is the output of the toString() method from the superclass)

In the `main()` method of a Program class, create an array of 10 `Shape` references containing a mixture of `Circle`, `Rectangle` and `Square` objects of different dimensions. Using a loop, print the `perimeter` and `area` for all of them.

---

### Assignment 18

Write a Java application to accept integers in a loop. After each number is accepted, the user should be asked if he/she wishes to continue. If the user inputs "NO", then the loop should be stopped and following output should be displayed:

```
Number of inputs = X
Number of integer inputs = Y
Number of non-integer inputs = Z
Sum of all integer inputs = XX
The integer inputs = N1, N2, N3, ...
The non-integer inputs = ASD, SDF, DFG, ...
X, Y, Z, etc should be actual values, based on the inputs.
```

HINT: 

Use `java.util.Scanner` for accepting data from the user. 

```java
Scanner s = new Scanner(System.in);
String input = s.nextLine();
int n = s.nextInt();
double d = s.nextDouble();
// ... s
```

---

### Assignment 19

Write a function called "calendar" that takes a String representing year/month in YYYY-MM format and returns a two-dimensional array representing the calendar for the input month and year.


For example, if the input is "2018-03”, then the output is:

```
{
	{0, 0, 0, 0, 1, 2, 3},
	{4, 5, 6, 7, 8, 9, 10},
	{11, 12, 13, 14, 15, 16, 17}, 
	{18, 19, 20, 21, 22, 23, 24}, 
	{25, 26, 27, 28, 29, 30, 31}
}
```

For input "2018-02", the output should be:

```
{
	{0, 0, 0, 0, 1, 2, 3},
	{4, 5, 6, 7, 8, 9 10},
	{11, 12, 13, 14, 15, 16, 17}, 
	{18, 19, 20, 21, 22, 23, 24}, 
	{25, 26, 27, 28, 0, 0, 0}
}
```
The method should throw a custom exception **InvalidDateException**, in case if the input does not represent a valid year/month combination, and **InvalidInputException** in case if the input is not in the expected YYYY-MM format.

---

### Assignment 20

Download the file <a href="./game.jar">game.jar</a>.

Open a command prompt in the location where you downloaded the jar file and run the following command: 

```shell
java -jar game.jar
```

This will run a Java program from the JAR file, and will ask you to enter a dimension (of a matrix). Please enter a number between 3 and 10.

The game will show you a shuffled matrix of numbers, with an empty box. Our goal is to arrange the numbers in ascending order by moving numbers around the box.

You are required to understand the way the application works, and recreate the same as a Java application.

Once the numbers are arranged properly, a **contratulations** message should appear, and the application must terminate.

<video src="./game.mov" width="100%">


---

### Assignment 21

Interface *Movable* and its implementations *MovablePoint* and *MovableCircle*


Write two concrete classes - MovablePoint and MovableCircle - that implement the Movable interface.

![](http://www.ntu.edu.sg/home/ehchua/programming/java/images/ExerciseOOP_Movable.png "")

For the MovablePoint class, declare the instance variable x, y, xSpeed and ySpeed with package access as shown with '~' in the class diagram (i.e., classes in the same package can access these variables directly). For the MovableCircle class, use a MovablePoint to represent its center (which contains four variable x, y, xSpeed and ySpeed). In other words, the MovableCircle composes a MovablePoint, and its radius.


```java
public class MovablePoint implements Movable {
   // instance variables
   int x, y, xSpeed, ySpeed;     // package access
   
   // Constructor
   public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
      this.x = x;
      ......
   }
   ......
   
   // Implement abstract methods declared in the interface Movable
   @Override
   public void moveUp() {
      y -= ySpeed;   // y-axis pointing down for 2D graphics
   }
   ......
}
```


```java
public class MovableCircle implements Movable { // saved as "MovableCircle.java"
   // instance variables
   private MovablePoint center;   // can use center.x, center.y directly
                                  //  because they are package accessible
   private int radius;
   
   // Constructor
   public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
      // Call the MovablePoint's constructor to allocate the center instance.
      center = new MovablePoint(x, y, xSpeed, ySpeed);
      ......
   }
   ......
   
   // Implement abstract methods declared in the interface Movable
   @Override
   public void moveUp() {
      center.y -= center.ySpeed;
   }
   ......
}
```

Write a test program and try out these statements:

```java
Movable m1 = new MovablePoint(5, 6, 10, 15);     // upcast
System.out.println(m1);
m1.moveLeft();
System.out.println(m1);
   
Movable m2 = new MovableCircle(1, 2, 3, 4, 20);  // upcast
System.out.println(m2);
m2.moveRight();
System.out.println(m2);
```

Write a new class called *MovableRectangle*, which composes two *MovablePoint* objects (representing the top-left and bottom-right corners) and implementing the *Movable* Interface. Make sure that the two points has the same speed.

![](http://www.ntu.edu.sg/home/ehchua/programming/java/images/ExerciseOOP_MovableRectangle.png "")


In the test program, add the following code to test the new implementation:

```java
 
Movable m3 = new MovableRectangle(1, 2, 3, 4, 25, 35);  // upcast
System.out.println(m3);
m3.moveUp();
System.out.println(m3);
```

---

### Assignment 22

Create the following classes in the respective packages.

* Class com.slk.assignment22.utils.KeyboardUtil
* Class com.slk.assignment22.utils.DateUtil
* Enum com.slk.assignment22.entity.Gender
* Class com.slk.assignment22.entity.Contact
* Class com.slk.assignment22.dao.DaoException
* Interface com.slk.assignment22.dao.ContactsDao
* Class com.slk.assignment22.dao.DaoFactory
* Class com.slk.assignment22.dao.impl.ContactsDaoHashMapImpl

The code for the above classes/interfaces are shared below.
#### Note: DO NOT CHANGE THE CODE FOR THESE CLASSES/INTERFACES (except ContactsDaoHashMapImpl)

Class *com.slk.assignment22.utils.KeyboardUtil*

```java
package com.slk.assignment22.utils;

import java.util.Date;
import java.util.Scanner;

@SuppressWarnings("resource")
public final class KeyboardUtil {

	private KeyboardUtil() {
	}

	public static String getString(String message) {
		System.out.print(message);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	public static int getInt(String message) {
		System.out.print(message);
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public static double getDouble(String message) {
		System.out.print(message);
		Scanner sc = new Scanner(System.in);
		return sc.nextDouble();
	}

	public static Date getDate(String message) {
		return DateUtil.toDate(getString(message));
	}

}

```


Class *com.slk.assignment22.utils.DateUtil*

```java
package com.slk.assignment22.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateUtil {

	public static String PATTERN = "yyyy-MM-dd";

	private DateUtil() {
	}

	public static String toString(Date input) {
		if(input==null) {
			return "null";
		}
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(PATTERN);
			return sdf.format(input);
		} catch (Exception e) {
			return "";
		}
	}

	public static Date toDate(String input) {
		SimpleDateFormat sdf = new SimpleDateFormat(PATTERN);
		sdf.setLenient(false);
		try {
			return sdf.parse(input);
		} catch (ParseException e) {
			return null;
		}
	}
}

```

Enum: *com.slk.assignment22.entity.Gender*

```java
package com.slk.assignment22.entity;

public enum Gender {
	MALE, FEMALE
}

```

Class: *com.slk.assignment22.entity.Contact*

```java
public class Contact {

	private static int idCounter;

	private int id;
	private String firstname;
	private String lastname;
	private Gender gender = Gender.MALE;
	private String email;
	private String phone;
	private String address;
	private String city = "Bangalore";
	private String state = "Karnataka";
	private Integer pincode;
	private String country = "India";
	private Date birthDate;

	public Contact() {
		this.id = ++idCounter;
	}

	public Contact(String firstname, String lastname, String email, String phone, String city) {
		this.id = ++idCounter;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.city = city;
	}

	// add the getters and setters

}
```

Class *com.slk.assignment22.dao.DaoException*

```java
package com.slk.assignment22.dao;

public class DaoException extends Exception {

	private static final long serialVersionUID = 1L;

	public DaoException() {
		super();
	}

	public DaoException(String message) {
		super(message);
	}

	public DaoException(Throwable cause) {
		super(cause);
	}

}

```

Interface *com.slk.assignment22.dao.ContactsDao*

```java
package com.slk.assignment22.dao;

import java.util.Date;
import java.util.List;

import com.slk.assignment22.entity.Contact;

public interface ContactsDao {
	// CRUD operations
	public void addContact(Contact contact) throws DaoException;
	public Contact getContact(int id) throws DaoException;
	public void updateContact(Contact contact) throws DaoException;
	public void deleteContact(int id) throws DaoException;

	// Queries
	public Contact getContactByEmail(String email) throws DaoException;
	public Contact getContactByPhone(String phone) throws DaoException;
	public List<Contact> getContactsByLastname(String lastname) throws DaoException;
	public List<Contact> getContactsByCity(String city) throws DaoException;
	public List<Contact> getContacts() throws DaoException;
	public List<Contact> getContactsByBirthDate(Date from, Date to) throws DaoException;
}
```

Interface *com.slk.assignment22.dao.DaoFactory*

```java
package com.slk.assignment22.dao;

import com.slk.assignment22.dao.impl.ContactsDaoHashMapImpl;

public final class DaoFactory {

	private static final String discriminator = "HASHMAP";

	private DaoFactory() {
	}

	public static ContactsDao getContactsDao() throws DaoException {
		switch (discriminator.toUpperCase()) {
		case "JDBC":
			 // return new ContactsDaoJdbcImpl();
			 break;
		case "HASHMAP":
			return new ContactsDaoHashMapImpl();
		case "CSV":
			// return new ContactsDaoCsvImpl();
			break;
		case "ARRAYLIST":
			// return new ContactsDaoArrayListImpl();
			break;
		}
		throw new DaoException("No implementation found for discriminator: " + discriminator);
	}
}

```


Create a class com.slk.assignment22.dao.impl.ContactsDaoHashMapIpml that implements the interface com.slk.assignment22.dao.ContactsDao, and implement the abstract functions inherited from the interface. The class must have a variable of *java.util.Map* type and must be initialized to an instance of *java.util.HashMap*. The methods from the interface which are implemented here must make use of this *map* to store and retrieve the *Contact* data. When implemented properly, the application should work properly as expected.

class *com.slk.assignment22.dao.impl.ContactsDaoHashMapIpml* 

```java
public class ContactsDaoHashMapIpml implements ContactsDao {

	private Map<Integer, Contact> map;

	public ContactsDaoHashMapIpml() {
		map = new HashMap<>();
	}

	// implement the methods from the ContactsDao interface 
	// that store/retrieve/modify the data stored in the variable 'map'

```

Once the above class is created make sure to update the *DaoFactory* to return a new instance of ContactsDaoHashMapImpl.


The code for the main class *com.slk.assignment22.programs.Main* is listed below:

```java
package com.slk.assignment22.programs;

import java.util.Date;
import java.util.List;

import com.slk.assignment22.dao.ContactsDao;
import com.slk.assignment22.dao.DaoException;
import com.slk.assignment22.dao.DaoFactory;
import com.slk.assignment22.entity.Contact;
import com.slk.assignment22.entity.Gender;
import com.slk.assignment22.utils.DateUtil;
import com.slk.assignment22.utils.KeyboardUtil;

public class Main {

	private ContactsDao dao;

	public Main() throws DaoException {
		// LOOSE COUPLING VIA FACTORY METHOD
		dao = DaoFactory.getContactsDao();
	}

	public void start() {
		int choice;

		while ((choice = menu()) != 0) {

			switch (choice) {
			case 1:
				addNewContact();
				break;
			case 2:
				listAllContacts();
				break;
			case 3:
				searchByLastname();
				break;
			case 4:
				searchByEmail();
				break;
			case 5:
				searchByPhone();
				break;
			case 6:
				searchByCity();
				break;
			case 7:
				searchByDateOfBirthRange();
				break;
			case 8:
				Contact contactToDelete = searchContactById();
				if (contactToDelete != null) {
					deleteContact(contactToDelete.getId());
				}
				break;
			case 9:
				Contact contactToEdit = searchContactById();
				if (contactToEdit != null) {
					editAndUpdateContact(contactToEdit);
				}
				break;

			}
		}

		System.out.println("Thanks for using the app!");
	}

	private void searchByEmail() {
		try {
			String email = KeyboardUtil.getString("Enter email address for searching contact: ");

			Contact contact = dao.getContactByEmail(email);
			if (contact == null) {
				System.out.println("No contact found for email: " + email);
				return;
			}
			printContactDetails(contact);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Invalid input. Please try agian!");
		}
	}

	private void searchByPhone() {
		try {
			String phone = KeyboardUtil.getString("Enter phone number for searching contact: ");

			Contact contact = dao.getContactByPhone(phone);
			if (contact == null) {
				System.out.println("No contact found for phone number: " + phone);
				return;
			}
			printContactDetails(contact);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Invalid input. Please try agian!");
		}
	}

	private void deleteContact(int id) {
		String choice = getString("Do you want to delete this record? (yes/no)", "no");
		if (choice.equalsIgnoreCase("yes")) {
			try {
				dao.deleteContact(id);
				System.out.println("Contact deleted successfully!");
			} catch (DaoException e) {
				e.printStackTrace();
			}
		}
	}

	private void searchByDateOfBirthRange() {
		Date from = KeyboardUtil.getDate("Enter from date in YYYY-MM-DD format: ");
		Date to = KeyboardUtil.getDate("Enter to date in YYYY-MM-DD format: ");

		try {
			List<Contact> list = dao.getContactsByBirthDate(from, to);
			printContacts(list);
		} catch (DaoException e) {
			e.printStackTrace();
		}
	}

	private void searchByCity() {
		String city = KeyboardUtil.getString("Enter city to search contacts: ");
		try {
			List<Contact> list = dao.getContactsByCity(city);
			printContacts(list);
		} catch (DaoException e) {
			e.printStackTrace();
		}
	}

	private void listAllContacts() {
		List<Contact> list;
		try {
			list = dao.getContacts();
			printContacts(list);
		} catch (DaoException e) {
			e.printStackTrace();
		}
	}

	private void searchByLastname() {
		String lastname = KeyboardUtil.getString("Enter lastname to search contacts: ");
		try {
			List<Contact> list = dao.getContactsByLastname(lastname);
			printContacts(list);
		} catch (DaoException e) {
			e.printStackTrace();
		}
	}

	public int menu() {

		while (true) {
			line("~");
			System.out.println("1. Add new contact");
			System.out.println("2. List all contacts");
			System.out.println("3. Search by lastname");
			System.out.println("4. Search by email address");
			System.out.println("5. Search by phone number");
			System.out.println("6. Search by city");
			System.out.println("7. Search by date of birth range");
			System.out.println("8. Delete contact");
			System.out.println("9. Edit contact");
			line("~");
			try {
				int choice = KeyboardUtil.getInt("Enter your choice (0 to exit): ");
				if (choice < 0 || choice > 9) {
					System.out.println("Invalid choice. Please try again!");
				} else {
					return choice;
				}
			} catch (Exception e) {
				System.out.println("Only integers are acceptable. Please try again!");
			}
		}
	}

	private void addNewContact() {
		Contact c = new Contact();
		c = getFieldValuesFromKeyboard(c);

		try {
			dao.addContact(c);
		} catch (DaoException e) {
			e.printStackTrace();
		}
	}

	private void printContacts(List<Contact> list) {
		if (list == null) {
			return;
		}

		if (list.size() == 0) {
			System.out.println("The search did not match any records!");
			return;
		}

		line("-");
		System.out.printf("%3s %-30s %-30s %-15s %-15s\n", "Id", "Name", "Email id", "Phone no.", "City");
		line("-");
		for (Contact c : list) {
			String title = c.getGender() == Gender.MALE ? "Mr." : "Ms.";

			System.out.printf("%3d %-30s %-30s %-15s %-15s\n", c.getId(),
					title + c.getFirstname() + " " + (c.getLastname() == null ? "" : c.getLastname()), c.getEmail(),
					c.getPhone(), c.getCity());

		}

	}

	private void editAndUpdateContact(Contact contact) {
		String choice = getString("Do you want to edit details? (yes/no)", "yes");
		if (choice.equalsIgnoreCase("yes")) {
			contact = getFieldValuesFromKeyboard(contact);
			try {
				dao.updateContact(contact);
				System.out.println("Contact details updated successfully!");
				line("=");
			} catch (DaoException e) {
				e.printStackTrace();
			}

		}
	}

	private Contact searchContactById() {
		try {
			int id = KeyboardUtil.getInt("Enter id for searching contact: ");
			Contact c = dao.getContact(id);
			if (c == null) {
				System.out.println("No contact found for id " + id);
				return null;
			}

			printContactDetails(c);

			return c;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Invalid input. Please try agian!");
		}
		return null;

	}

	private void printContactDetails(Contact contact) {
		String title = contact.getGender() == Gender.MALE ? "Mr." : "Ms.";
		String fullname = String.format("%s%s %s", title, contact.getFirstname(), contact.getLastname());
		System.out.println("Name          : " + fullname);
		System.out.println("Date of birth : " + DateUtil.toString(contact.getBirthDate()));
		System.out.println("Email id      : " + contact.getEmail());
		System.out.println("Phone number  : " + contact.getPhone());
		System.out.println("Address       : " + contact.getAddress());
		System.out.println("City          : " + contact.getCity());
		System.out.println("State         : " + contact.getState());
		System.out.println("Pincode       : " + contact.getPincode());
		System.out.println("Country       : " + contact.getCountry());
	}

	private Contact getFieldValuesFromKeyboard(Contact contact) {
		contact = copyOf(contact);
		contact.setFirstname(getString("Firstname", contact.getFirstname()));
		contact.setLastname(getString("Lastname", contact.getLastname()));

		String input = getString("Gender", contact.getGender().toString());
		if (input.equalsIgnoreCase("male")) {
			contact.setGender(Gender.MALE);
		} else if (input.equalsIgnoreCase("female")) {
			contact.setGender(Gender.FEMALE);
		} else {
			System.out.println("Invalid value for gender. Accepted as MALE");
		}

		contact.setEmail(getString("Email", contact.getEmail()));
		contact.setPhone(getString("Phone", contact.getPhone()));
		contact.setAddress(getString("Address", contact.getAddress()));
		contact.setCity(getString("City", contact.getCity()));
		contact.setState(getString("State", contact.getState()));
		contact.setPincode(getInt("Pincode", contact.getPincode()));
		contact.setBirthDate(getDate("D.O.B in yyyy-mm-dd format", contact.getBirthDate()));
		contact.setCountry(getString("Country", contact.getCountry()));

		return contact;
	}

	private Contact copyOf(Contact contact) {
		Contact c = new Contact();
		c.setId(contact.getId());
		c.setFirstname(contact.getFirstname());
		c.setLastname(contact.getLastname());
		c.setEmail(contact.getEmail());
		c.setPhone(contact.getPhone());
		c.setBirthDate(contact.getBirthDate());
		c.setGender(contact.getGender());
		c.setAddress(contact.getAddress());
		c.setCity(contact.getCity());
		c.setState(contact.getState());
		c.setCountry(contact.getCountry());
		c.setPincode(contact.getPincode());
		return c;
	}

	private String getString(String field, String value) {
		String msg = String.format("%s %s", field, value == null ? "" : "(" + value + ") ");
		String input = KeyboardUtil.getString(msg);
		if (input.trim().equals("")) {
			input = value;
		}
		return input;
	}

	private Integer getInt(String field, Integer value) {
		String msg = String.format("%s %s", field, value == null ? "" : "(" + value + ") ");
		String input = KeyboardUtil.getString(msg);
		if (input.trim().equals("")) {
			return value;
		}
		try {
			return Integer.parseInt(input);
		} catch (NumberFormatException e) {
			return null;
		}
	}

	private Date getDate(String field, Date value) {
		String msg = String.format("%s %s", field, value == null ? "" : "(" + DateUtil.toString(value) + ") ");
		Date input = KeyboardUtil.getDate(msg);
		if (input == null) {
			input = value;
		}
		return input;
	}

	private void line(String ch) {
		for (int i = 0; i < 90; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}

	public static void main(String[] args) throws DaoException {
		new Main().start();
	}

}

```

Run the above class as a Java Application and test each of the operations.
#### Note: DO NOT EDIT THE ABOVE CODE

---

### Assignment 23

Create a class `com.slk.assignment22.dao.impl.ContactsDaoCsvImpl` that implements the interface `com.slk.assignment22.dao.ContactsDao`, such that the data is now stored in a CSV file.

*Note: Avoid unnecessary read/write operations on the file*

Hint: 
* You may write some private helper methods for read/write operations and call them at appropriate locations of the overridden functions.
* Update the `com.slk.assignment22.dao.DaoFactory` with necessary code

### Assignment 24

Create a class `com.slk.assignment22.dao.impl.ContactsDaoBinaryImpl` that implements the interface `com.slk.assignment22.dao.ContactsDao`, such that the data is now stored in a binary file. 

Make the class `com.slk.assignment22.entity.Contact` a serializable class.

*Note: Avoid unnecessary read/write operations on the file*

Hint: 
* You may write some private helper methods for read/write operations and call them at appropriate locations of the overridden functions.
* Update the `com.slk.assignment22.dao.DaoFactory` with necessary code

---

### Assignment 25

JDBC implementation

Create a new database `assignment_22`, and create table `CONTACTS` with the following fields:

Column name|Data type
---|---
id|int (primary key, autoincrement)
first_name|varchar(50)
last_name|varchar(50)
gender|varchar(10)
email|varchar(250)
phone|varchar(50)
address|varchar(250)
city|varchar(50)
state|varchar(50)
pincode|Integer
country|varchar(50)
birth_date|Date


Create a class `ContactsDaoJdbcImpl` that implements `ContactsDao` interface

Each method of this class must use *JDBC* api to store/retrieve data from **CONTACTS** table in the H2 database.

For example, the `getContacts()` method should do the following:

```java
public List<Contact> getContacts() throws DaoExceptoion {
	String sql = "select * from contacts";
	List<Contct> list = new ArrayList<>();

	try(
		// Open Connection
		// Create PreparedStatement
		// Execute the query and get the ResultSet
	) {
		// Using a loop, for each record in the ResultSet, 
		// create a Contact object and add to the ArrayList
	}
	catch(Exception ex) {
		throw new DaoException(ex);
	}

	return list;
}
```

Another example:

The `addContact(Contact contact)` method should do the following:

```java
public void addContact(Contact contact) throws DaoException {
	// Do the necessary validations

	String sql = "insert into contacts (first_name, last_name, gender, email, phone, address, city, state, pincode, country, birth_date) values (?,?,?,?,?,?,?,?,?,?,?)";

	try(
		// Open Connection
		// Create PreparedStatement
	) {
		// set the PreparedStatement's parameters using the function's argument contact
		// For example, stmt.setString(1, contact.getFirstname()) and so on..

		// for stmt.setDate(pos, value), value should be of java.sql.Date and not java.util.Date
		// to convert, use this statment: new java.sql.Date(contact.getBirthDate().getTime())

		// execute the statement
	}
	catch(Exception ex) {
		throw new DaoException(ex);
	}

}
```

Note: Conversion of `java.sql.Date` to `java.util.Date`

The class `java.sql.Date` inherits from `java.util.Date`. 

Consider, two Date variables - d1 and d2.

```java
java.util.Date d1 = ....;
java.sql.Date d2 = ...;

d1 = d2; // downcasting; implicit
d2 = d1; // error
d2 = (java.sql.Date) d1; // error

d2 = new java.sql.Date(d1.getTime()); // creates a new `java.sql.Date` object using the milliseconds represented by d1
```

---

### Assignment 26

Create a new `Dynamic Web Project` with the name `Assignment 26`.

The homepage should display a text box with a label *Enter category: * along with a button to submit.

When the button is clicked, a servlet should be invoked which displays the list of all products that belongs to the input category, in the form of a HTML table.

Also, provide a hyperlink to go back to the homepage.

Note:

* Use member variables of type Connection, PreparedStatement and ResultSet
* Initialize the Connection and PreparedStatement in the `init` method
* Close the Connection and PreparedStatement in the `destroy` method
* Execute the query in the `doGet` method and close the ResultSet also in the same.
* In case if there are no products for the entered category, display an appropriate message.

```java
public class ProductsByCategoryServlet .... {
	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;

	public void init() {
		try {
			conn = ...
			stmt = ...
		}
		catch(Exception ex) {
			...
		}
	}
	public void destroy() {
		try {
			stmt.close();
			conn.close();
		}
		catch(Exception ex) {
			...
		}
	}
	protected void doGet(...) {
		try {
			rs = ...
			...
			...
		}
		catch(Exception ex) {
			...
		}
	}
}
```

Here is the output expected:

<img src="./images/assignment26.gif" width="100%">


### Assignment 27

Create a new `Dynamic Web Project` with the name `Assignment 27`.

The homepage should display a text box with a label *Enter category: * along with a button to submit.

When the button is clicked, a servlet should be invoked which displays the list of all products that belongs to the input category, in the form of a HTML table.

Also, provide a hyperlink to go back to the homepage.

Create the following classes and interfaces for the working of the above application

* Entity class - com.slk.training.entity.Product
* Dao interface - com.slk.training.dao.ProductDao (containing the methods listed below)
	* public Product getProductById(int id) throws DaoException
	* public List<Product> getAllProducts() throws DaoException
	* public List<Product> getProductsByCategory(String category) throws DaoException
* Dao factory class - com.slk.training.dao.DaoFactory (containing the methods listed below)
	* public static ProductDao getProductDao() throws DaoExceptoion (returns an instance of ProductDaoJdbcImpl)
* Dao implementation class - com.slk.training.dao.impl.ProductDaoJdbcImpl implements com.slk.training.dao.ProductDao
* Servlet class - com.slk.training.web.ProductsByCategoryServlet
	* The doGet(..) of this servlet uses the DaoFactory to get a ProductDao instance using which the search is done

Note:

* copy and paste the `h2-1.4.xxx.jar` into `WebContent/WEB-INF/lib` directory, and the JAR file will be automatically be in the CLASSPATH