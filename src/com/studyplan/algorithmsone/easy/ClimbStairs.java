package com.studyplan.algorithmsone.easy;

// https://leetcode.com/problems/climbing-stairs/solution/
public class ClimbStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(3));
	}

	public static int climbStairs(int n) {
		if (n == 1) {
			return 1;
		}
		int[] dp = new int[n + 1];
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}
}
