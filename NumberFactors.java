import java.util.*;
class NumberFactors {
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number:");
		int N,i;
		N = sc.nextInt();
		
		for(i=1;i<=N;i++){
			if(N%i == 0){
				System.out.print(i +" ");
			}
		}
		System.out.print(" are the factors of " + N);
	}
}