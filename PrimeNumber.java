import java.util.*;

class PrimeNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n,i,FactorCount;
		FactorCount = 0;
		System.out.print("Enter the Number:");
		n = sc.nextInt();
		// Finding the number of factors.
		for(i=1;i<=n;i++){
			if(n%i == 0){
				FactorCount = FactorCount+1;
			}
		}
		// Checking number of factors must be 2.
		if(FactorCount == 2){
			System.out.println(n + " is a prime number.");
		}
		else{
			System.out.println(n + " is not a prime number.");
		}
	}
}