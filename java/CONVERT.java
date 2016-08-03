import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int seq = 1;
		while(c-- > 0){
			double in = sc.nextDouble();
			String unit = sc.next();
			double result = 0;
			if(unit.equals("kg")){
				result = in*2.2046;
				unit = "lb";
			}else if(unit.equals("g")){
				result = in*3.7854;
				unit = "l";
			}else if(unit.equals("l")){
				result = in*0.2642;
				unit = "g";
			}else if(unit.equals("lb")){
				result = in*0.4536;
				unit = "kg";
			}
			System.out.println((seq++)+" "+String.format("%.4f",result)+" "+unit);
		}
	}	
}
