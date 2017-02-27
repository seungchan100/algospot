import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int n;
		int[] arr = new int[100];
		while(c-- > 0){
			n = sc.nextInt();
			if(isWeired(n)){
				System.out.println("weird");
			}else{
				System.out.println("not weird");
			}
			
		}
	}
	
	public static boolean checkDivisorSum(int[] divisor, int idx, int currentSum, int targetSum){
		if(targetSum == currentSum) return true;
		else if(targetSum < currentSum) return false;
		for(int i=idx;i>-1;i--){
			if(checkDivisorSum(divisor, i-1, currentSum + divisor[i], targetSum)){
				return true;
			}
		}
		return false;
	}
	
	public static boolean isWeired(int n){
		//get divisor
		int[] divisor = new int[708];
		int i, j = 0;
		divisor[j] = 1;
		for(i=2;i*i<n;i++){
			if(n % i == 0){
				divisor[++j] = i;
				divisor[++j] = n/i;
			}
		}
		Arrays.sort(divisor, 0, j+1);

		//if(sum of divisor == n){
		if(checkDivisorSum(divisor, j, 0, n))
			return false;

		//if(sum of divisor > n )
		int sum = 0;
		for(i=j;i>-1;i--){
			sum += divisor[i];
			if(sum > n)
				return true;
		}
		return false;
	}
}
