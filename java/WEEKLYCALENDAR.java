import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args)
	{
		int i;
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		String[] dayofweek = 
			new String[]{"Sunday","Monday", "Tuesday","Wednesday",
				"Thursday","Friday","Saturday"};
		int[] maxday = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		while(c-- > 0){
			int m = sc.nextInt();
			int d = sc.nextInt();
			String dow = sc.next();
			int dowi=-1;
			for(i=0;i<dayofweek.length;i++){
				if(dayofweek[i].equals(dow))
					dowi = i;
			}

			int cday = d-dowi;
			m--;
			if(cday < 1){
				m = (m == 0)? 11:m-1;
				cday = maxday[m]+cday;
			}
			
			for(i=0;i<7;i++){
				System.out.print(cday+" ");
				cday = (cday == maxday[m])? 1:cday+1;
			}
			System.out.print("\n");
		}
	}
}
