import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Nqueen nqueen = new Nqueen();
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int in;
		while(c-- > 0){
			in = sc.nextInt();
			System.out.println(nqueen.search(in));
		}
	}
	
	public static class Nqueen{
		private static int[] resultCache = new int[12];
		private boolean[][] cell = new boolean[12][12];
		private int result;
		private int max;
		
		static{
			for(int i=0;i<12;i++)
				resultCache[i] = -1;
		}
		
		public int search(int in){
			if(resultCache[in-1] != -1)
				return resultCache[in-1];
			result = 0;
			max = in;
			for(int i=0;i<max;i++)
				for(int j=0;j<max;j++)
					cell[i][j] = false;
			putNextQueen(0);
			resultCache[in-1] = result;
			return result;
		}
		
		private void putNextQueen(int row){
			if(row == max){
				result++;
				return;
			}
			
			for(int i=0;i<max;i++){
				if(canPut(row,i)){
					cell[row][i] = true;
					putNextQueen(row+1);
					cell[row][i] = false;
				}
			}
		}
		
		private boolean canPut(int row, int col){
			for(int i=0;i<row;i++){
				//col check
				if(cell[i][col]) 
					return false;
				
				//left diagonal
				if( col-(row-i) >= 0 &&
					cell[i][col-(row-i)] ) 
					return false;
				
				//right diagonal
				if( col+row-i < max &&
					cell[i][col+(row-i)]) 
					return false;
			}
			return true;
		}
	}
}
