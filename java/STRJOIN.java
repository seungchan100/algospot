import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int n;
		int[] arr = new int[100];
		while(c-- > 0){
			n = sc.nextInt();
			for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			go(n, arr);
		}
	}
	
	public static void go(int n, int[] arr){
		int sum = 0;
		int answer = 0;
		int tmp;
		
		Arrays.sort(arr, 0, n);
		
		for(int s=0;;s++){
			sum = arr[s] + arr[s+1];
			arr[s] = 0;
			arr[s+1] = sum;
			answer += sum;
			if(s+1 == n-1) break;
			for(int i=s+1;i+1<n;i++){
				if(arr[i] > arr[i+1]){
					tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}
			}
		}
		System.out.println(answer);
	}
}
