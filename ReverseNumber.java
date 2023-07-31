import java.util.*;
class ReverseNumber{
	public static void main(String args[]) {
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		N = sc.nextInt();
		int LastDigit;
		while(N>0) {
			LastDigit = N%10;
			System.out.print(LastDigit);
			N = N/10;
		}
		System.out.print(" is the reverse number.");
	}
}