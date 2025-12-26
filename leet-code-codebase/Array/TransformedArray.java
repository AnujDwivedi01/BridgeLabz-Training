/*
3379. Transformed Array
Easy
Topics
premium lock icon
Companies
Hint
You are given an integer array nums that represents a circular array. Your task is to create a new array result of the same size, following these rules:

For each index i (where 0 <= i < nums.length), perform the following independent actions:
If nums[i] > 0: Start at index i and move nums[i] steps to the right in the circular array. Set result[i] to the value of the index where you land.
If nums[i] < 0: Start at index i and move abs(nums[i]) steps to the left in the circular array. Set result[i] to the value of the index where you land.
If nums[i] == 0: Set result[i] to nums[i].
Return the new array result.

Note: Since nums is circular, moving past the last element wraps around to the beginning, and moving before the first element wraps back to the end.
*/

class Solution {
    public int[] constructTransformedArray(int[] nums) {
	int n = nums.length;
	int res[] = new int[n];
	for(int i=0; i<n; i++) {
		if(nums[i] == 0) res[i] = 0;
		else if(nums[i] < 0) {
			int minus = Math.abs(nums[i])%n;
			int new_i = i-minus;
			if(new_i >= 0) res[i] = nums[new_i];
			else res[i] = nums[n+new_i];
		} else {
			int add = nums[i]%n;
			res[i] = nums[(i+add)%n];
		}
	}
	return res;
}
}