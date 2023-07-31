import java.util.*;
public class Combination{
	public static void main(String[] args){
		int n,r;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		n = sc.nextInt();
		
		System.out.print("Enter r: ");
		r = sc.nextInt();
		
		int nfact =1;
		for(int i =1;i<=n;i++){
			nfact = n*i;
		}
		
		int n_rfact = 1;
		for(int i=1;i<=n-r;i++){
			n_rfact = n*i;
		}
		int rfact = 1;
		for(int i=1;i<=r;i++){
			rfact = n*i;
		}
		
		int ans = nfact/(n_rfact)*(rfact);
		System.out.println(ans);
		
	}	
}