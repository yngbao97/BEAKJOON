package boj_11048_이동하기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] maze = new int[N+1][M+1];
		int[][] dp = new int[N+1][M+1];
		
		for (int i = 1 ; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				maze[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				dp[i][j] = Math.max(dp[i-1][j-1], Math.max(dp[i-1][j], dp[i][j-1])) + maze[i][j];
			}
		}
		
		System.out.println(dp[N][M]);
		sc.close();
	}

	private static void print(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

}
