import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static int str2num(String str){
		if("zero".equals(str)) return 0;
		else if("one".equals(str)) return 1;
		else if("two".equals(str)) return 2;
		else if("three".equals(str)) return 3;
		else if("four".equals(str)) return 4;
		else if("five".equals(str)) return 5;
		else if("six".equals(str)) return 6;
		else if("seven".equals(str)) return 7;
		else if("eight".equals(str)) return 8;
		else if("nine".equals(str)) return 9;
		else if("ten".equals(str)) return 10;
		return -1;
	}
	public static String num2sstr(int num){
		if(0 == num) return "eorz";
		else if(1 == num) return "eno";
		else if(2 == num) return "otw";
		else if(3 == num) return "eehrt";
		else if(4 == num) return "foru";
		else if(5 == num) return "efiv";
		else if(6 == num) return "isx";
		else if(7 == num) return "eensv";
		else if(8 == num) return "eghit";
		else if(9 == num) return "einn";
		else if(10 == num) return "ent";
		return "";
	}
	public static String sortedStr(String str){
		int i,j;
		char[] charr = str.toCharArray();
		char tmp;
		int len = charr.length;
		for(i=0;i<len-1;i++){
			for(j=i;j<len;j++){
				if(charr[i] > charr[j]){
					tmp = charr[i];
					charr[i] = charr[j];
					charr[j] = tmp;
				}
			}
		}
		return String.valueOf(charr);
	}
	public static String isCorrect(int sol, String c){
		if(0 > sol || sol > 10) return "No";
		if( num2sstr(sol).equals(sortedStr(c)) ) return "Yes";
		//System.out.println(num2sstr(sol) + sortedStr(c));
		return "No";
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			String a, b, c, op;
			int anum, bnum, cnum, sol = -1;
			a = sc.next();
			op = sc.next();
			b = sc.next();
			sc.next();
			c = sc.next();
			anum = str2num(a);
			bnum = str2num(b);
			if("+".equals(op)) sol = anum+bnum;
			else if("*".equals(op)) sol = anum*bnum;
			else if("-".equals(op)) sol = anum-bnum;
			System.out.println( isCorrect(sol, c) );
		}
	}
}
