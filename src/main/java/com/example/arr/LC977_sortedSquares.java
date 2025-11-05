package com.example.arr;

import com.example.abs.LeetCodeProblem;

import java.util.Arrays;

/**
 * 给你一个按 非递减顺序 排序的整数数组 nums
 * 返回 每个数字的平方 组成的新数组
 * 要求也按 非递减顺序 排序。
 *
 * 输入：nums = [-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 解释：平方后，数组变为 [16,1,0,9,100]
 * 排序后，数组变为 [0,1,9,16,100]
 */
public class LC977_sortedSquares implements LeetCodeProblem {

    // 暴力一点的解法就是直接平方完了排序 可以弄 但是既然最开始给的数组就已经排序好的，就可以用双指针法
    // 不过没想起来，是leetcode上的题解 对比正负数平方之后的大小 用双指针来两头对比 然后放进新数组
    public int[] sortedSquares(int[] nums) {
        int[] square = new int[nums.length];
        int[] result = new int[nums.length];

        // 平方
        for (int i = 0; i <= nums.length - 1; i++) {
            square[i] = nums[i] * nums[i];
        }
        // 之后的排序 两边指针应该是越往中间走平方数越小 所以要倒着放进结果数组里
        int left = 0;
        int right = nums.length - 1;
        int resultLocation = nums.length - 1;
        while (left <= right) {
            if (square[left] < square[right]) {
                result[resultLocation] = square[right];
                resultLocation--;
                right--;
            } else {
                // 大于或等于就存左边的
                result[resultLocation] = square[left];
                resultLocation--;
                left++;
            }
        }

        return result;
    }

    @Override
    public void test() {
        int[] nums = {-4,-1,0,3,10};
        int[] result = sortedSquares(nums);
        System.out.print("题目977：有序数组的平方，输入：" + Arrays.toString(nums));
        System.out.println("运行方法后得到：" + Arrays.toString(result));
    }


    public static void main(String[] args) {
        new LC977_sortedSquares().test();
    }
}
