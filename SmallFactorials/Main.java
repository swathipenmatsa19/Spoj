/*


FCTRL2 - Small factorials
#math #big-numbers

You are asked to calculate factorials of some small positive integers.

Input

An integer t, 1<=t<=100, denoting the number of testcases, followed by t lines, each containing a single integer n, 1<=n<=100.

Output

For each integer n given at input, display a line with the value of n!

Example

Sample input:
4
1
2
5
3
Sample output:

1
2
120
6



*/



import java.util.*;
import java.lang.*;
import java.math.BigInteger;
 
class Main
{
	
	public static BigInteger fact(int n) {
        BigInteger fact = new BigInteger("1");
        
        for(int i = 2; i <=n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
       	}
        return fact;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- != 0) {
		int n = sc.nextInt();
        System.out.println(fact(n)); 
		}
	}
} 














