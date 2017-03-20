import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		FixStack stack = new FixStack();
		int c = sc.nextInt();
		while(c-- > 0){
			stack.init(sc.next(), sc.next());
			stack.fix();
			System.out.println(String.valueOf(stack.input));
		}

	}
	
	public static class FixStack{
		private char[] input;
		private int[] items = new int[100];
		private int idx = -1;
		private char[] lpa;
		private char[] rpa;
		
		public void init(String input, String paorder){
			this.input = input.toCharArray();
			this.lpa = paorder.toCharArray();
			this.rpa = new char[this.lpa.length];
			System.arraycopy(this.lpa, 0, this.rpa, 0, this.lpa.length);
			for(int i=0;i<this.lpa.length;i++){
				if(this.rpa[i] == '(')
					this.rpa[i] = ')';
				else if(this.rpa[i] == '{')
					this.rpa[i] = '}';
				else if(this.rpa[i] == '[')
					this.rpa[i] = ']';
				else if(this.rpa[i] == '<')
					this.rpa[i] = '>';
			}
		}
		public void push(int in){
			items[++idx] = in;
		}
		
		public int pop(){
			return items[idx--];
		}
		
		public void fix(){
			int len = input.length;
			char c;
			int item;
			int t;
			for(int i=0;i<len;i++){
				c = input[i];
				if(c == '(' || c == '{' || c == '[' || c == '<')
					push(i);
				else{
					item = pop();
					t = higher(input[item], c);
					input[item] = lpa[t];
					input[i] = rpa[t];
				}
			}
		}
		
		private int higher(char l, char r){
			int li = -1,ri = -1;
			for(int i=0;i<4;i++){
				if(l == lpa[i]) 
					li = i;
				if(r == rpa[i])
					ri = i;
			}
			return (li < ri)? li:ri;
		}
	}
}
