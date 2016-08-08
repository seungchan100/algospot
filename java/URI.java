import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static int stateMachine(int cState, char ch, StringBuffer result){
		int state = cState;
		if(state == -1){
			if(ch == '%') state = 0;
			else result.append(ch);
		}else if(state == 0){
			if(ch == '2') state = 1;
			else{
				result.append('%').append(ch);
				state = -1;
			}
		}else if(state == 1){
			if(ch == '0') result.append(' ');
			else if(ch == '1') result.append('!');
			else if(ch == '4') result.append('$');
			else if(ch == '5') result.append('%');
			else if(ch == '8') result.append('(');
			else if(ch == '9') result.append(')');
			else if(ch == 'a') result.append('*');
			else result.append("%2").append(ch);
			state = -1;
		}
		return state;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		while(c-- > 0){
			String str = sc.next();
			StringBuffer resultSB = new StringBuffer();
			int strLen = str.length();
			int state = -1;
			for(int i=0;i<strLen;i++){
				state = stateMachine(state, str.charAt(i), resultSB);
			}
			System.out.println(resultSB.toString());
		}
	}
}
