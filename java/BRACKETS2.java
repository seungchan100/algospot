import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		sc.nextLine();
		while(c-- > 0){
			System.out.println(go(sc.nextLine()));
		}
	}
	
	public static String go(String in){
		int len = in.length();
		char c,t;
		Stack stack = new Stack();

		for(int i=0;i<len;i++){
			c = in.charAt(i);
			if(c == '(' || c == '{' || c == '[')
				stack.push(c);
			else{
				t = stack.pop();
				if(t == '(' && c == ')');
				else if(t == '{' && c == '}');
				else if(t == '[' && c == ']');
				else return "NO";
			}
		}

		if(stack.size != 0) return "NO";
		return "YES";
	}
	
	public static class Stack{
		private char[] items = new char[10000];
		public int size = 0;

		
		public void push(char c){
			items[size++] = c;
		}
		public char pop(){
			if(size == 0) return ' ';
			else return items[--size];
		}
	}
}
