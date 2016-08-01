import java.util.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		long in, out;
		while(c-- > 0){
			in = sc.nextLong();
			out =((in << 24) & ((long)255 << 24))
				+ ((in << 8) & ((long)255 << 16))
				+ ((in >>> 8) & ((long)255 << 8))
				+ ((in >>> 24) & ((long)255));
			
			System.out.println(out);
		}
	}
}
