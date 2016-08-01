import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		while(c-- > 0){
			String str = sc.next();
			int len = str.length();
			for(int i=0;i<len;i+=2){
				System.out.print(str.charAt(i));	
			}
			for(int i=1;i<len;i+=2){
				System.out.print(str.charAt(i));
			}
			System.out.print("\n");	
		}
	}	
}
