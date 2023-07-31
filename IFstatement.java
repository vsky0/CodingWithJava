import java.util.*;

class IFstatement{
	public static void main(String args[]){
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		age = sc.nextInt();
		/*
		if(22)
			System.out.println("fasak");gives an error : int cannot be converted to boolean.
		*/
		if(age >= 18)// the condtion output value should be in boolean form only no other datatypes like int, 
			System.out.println("Eligible");
	}
}