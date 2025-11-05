package com.example.arr;

import com.example.abs.LeetCodeProblem;

import java.util.Arrays;

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 target 。
 * 找出该数组中满足其总和大于等于 target 的长度最小的
 *  [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 * 示例 1：
 * 输入：target = 7, nums = [2,3,1,2,4,3]
 * 输出：2
 * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
 * 示例 2：
 * 输入：target = 4, nums = [1,4,4]
 * 输出：1
 * 示例 3：
 * 输入：target = 11, nums = [1,1,1,1,1,1,1,1]
 * 输出：0
 */
public class LC209_minSubArrayLen implements LeetCodeProblem {

    /**
     * 滑动窗口法
     */
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        int start = 0, end = 0;
        int sum = 0;
        while (end < n) {
            sum += nums[end];
            while (sum >= target) {
                ans = Math.min(ans, end - start + 1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    @Override
    public void test() {
        int[] nums = {2,3,1,2,4,3};
        int result = minSubArrayLen(7, nums);
        System.out.print("题目209：长度最小的子数组，输入目标：7，输入数组：" + Arrays.toString(nums));
        System.out.println("运行方法后得到：" + result);
    }

    public static void main(String[] args) {
        new LC209_minSubArrayLen().test();
    }
}
