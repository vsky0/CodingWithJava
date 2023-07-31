// 
import java.util.*;
class nCr {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		System.out.print("Enter r: ");
		int r = sc.nextInt();
		
		
		int nfact = fact(n);
		int rfact = fact(r);
		int n_r = fact(n-r);
		
		int ans = nfact/(rfact*n_r);
		System.out.println(ans);
		

	}
	
	public static int fact(int n){
		int ans = 1;
		
		for(int i=n;i>0;i--){
			ans = ans*i;
		}
		return ans;
	}
}