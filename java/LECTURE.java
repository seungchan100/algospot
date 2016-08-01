import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0){
			String str = sc.next();
			String[] arr = new String[str.length()/2];
			for(int i=0;i<str.length()/2;i++){
				arr[i] = str.substring(i*2, i*2+2);
			}
			String[] res_arr = sort(arr);
			int len = res_arr.length;
			for(int i=0;i<len;i++){
				System.out.print(res_arr[i]);
			}
			System.out.print("\n");
		}
	}
	private static String[] sort(String[] in){
		int len = in.length;
		String tmp;
		for(int i=0;i<len-1;i++){
			for(int j=i+1;j<len;j++){
				if(cmp(in[i], in[j]) > 0){
					tmp = in[i];
					in[i] = in[j];
					in[j] = tmp;
				}
			}
		}
		return in;
	}
		
	private static int cmp(String a, String b){
		char a1 = a.charAt(0);
		char b1 = b.charAt(0);
		
		if(a1 < b1){
			return -1;
		}else if(a1 > b1){
			return 1;
		}else{
			char a2 = a.charAt(1);
			char b2 = b.charAt(1);
			if(a2 < b2){
				return -1;
			}else if(a2 > b2){
				return 1;
			}else return 0;
		}
	}
}
