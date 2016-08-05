import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		while(c-- > 0){
			int limit = sc.nextInt();
			int sum = 0;
			for(int i=0;i<9;i++)
				sum += sc.nextInt();
			if(sum <= limit) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
