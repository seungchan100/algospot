import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int seq = 1;
		while(c-- > 0){
			int in = sc.nextInt();
			String str = sc.next();
			System.out.println((seq++)+" "+
				str.substring(0,in-1)+
				str.substring(in, str.length()));
		}
	}	
}
