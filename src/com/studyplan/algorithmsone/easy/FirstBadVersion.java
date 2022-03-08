package com.studyplan.algorithmsone.easy;

public class FirstBadVersion {
	public static void main(String[] args) {
		int n = 1, targetVersion = 1;

		int version = test(targetVersion);
		System.out.println("version = " + version);
	}

	private static boolean isBadVersion(int i) {
		return true;

	}

	public int firstBadVersion(int n) {
		int start = 1;
		int end = n;
		int ans = 0;
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (!isBadVersion(mid)) {
				start = mid + 1;
			}

			else {
				ans = mid; // difference between this and below methods
				end = mid - 1;
			}

		}
		return ans;
	}

	private static int test(int n) {
		int left = 1;
		int right = n;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (isBadVersion(mid)) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return left;
	}
}
