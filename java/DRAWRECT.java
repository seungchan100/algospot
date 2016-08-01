import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int in, x, y;
		while(c-- >0){
			x = y = 0;
			for(int i=0;i<3;i++){
				x ^= sc.nextInt();
				y ^= sc.nextInt();
			}
			System.out.println(x+" "+y);
		}
	}	
}
