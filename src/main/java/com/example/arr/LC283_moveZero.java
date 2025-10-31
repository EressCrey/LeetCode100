package com.example.arr;

import com.example.abs.LeetCodeProblem;

import java.util.Arrays;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * 示例 1:
 * 输入: nums = [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * <p>
 * 示例 2:
 * 输入: nums = [0]
 * 输出: [0]
 */
public class LC283_moveZero implements LeetCodeProblem {
    /**
     * 有集中方法，包括额外数组存非零，然后补零；
     * 两轮遍历，第一轮挪非零同时记录下标到非零元素最后一个位置，第二轮从这个位置开始设为0
     * 这里写双指针法：
     * 官方解法，双指针法，左右指针在遇到非零元素时同时移动，遇到0左指针指向零，
     * 右指针后移到非零元素，然后交换，左右指针再次移动，重复上述过程。
     * 只要有零，那么左指针就会指向最左边的零，右指针一旦遍历到非零元素就会交换，
     * 这样左指针就一直指向最左边的零，有交换也不用怕乱序
     *
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int left = 0, right = 0;
        while (right < nums.length) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    @Override
    public void test() {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.printf(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        new LC283_moveZero().test();
    }
}
