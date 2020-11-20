/*

PRIME1 - Prime Generator
#number-theory

Peter wants to generate some prime numbers for his cryptosystem. 
Help him! Your task is to generate all prime numbers between two given numbers!

Input

The input begins with the number t of test cases in a single line (t<=10). 
In each of the next t lines there are two numbers m and n (1 <= m <= n <= 1000000000, n-m<=100000) separated by a space.

Output

For every test case print all prime numbers p such that m <= p <= n, one number per line, test cases separated by an empty line.

Example

Input:
2
1 10
3 5

Output:
2
3
5
7

3
5

*/




import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
 
class Main
{
	public static boolean isPrime(int n) {
        if(n == 1)
            return false;
        else {
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0)
                    return false;
            }
        }
        return true;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            for(int i = m; i <= n; i++) {
                if(isPrime(i))
                    System.out.println(i);
            }
            System.out.println();
        }
	}
} 
























