/* O(min(a,b)) */
public class GCD {
public static int GCD(int a, int b){
	int gcd = 1;
	int c;
	if (a > b){
		c = b;}else
		{c = a;}
	for (int i = 2; i <= c; i++ ){
		if(a % i ==0 && b % i ==0)
			 gcd = i;
	}
	return gcd;
}

public static void main(String a[]){
	System.out.print(GCD(63,81));
}
}
