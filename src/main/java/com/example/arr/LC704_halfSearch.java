package com.example.arr;

import com.example.abs.LeetCodeProblem;

import java.util.Arrays;

/**
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果 target 存在返回下标，否则返回 -1。
 * 你必须编写一个具有 O(log n) 时间复杂度的算法。
 *
 * 示例 1:
 * 输入: nums = [-1,0,3,5,9,12], target = 9
 * 输出: 4
 * 解释: 9 出现在 nums 中并且下标为 4
 * 示例 2:
 * 输入: nums = [-1,0,3,5,9,12], target = 2
 * 输出: -1
 * 解释: 2 不存在 nums 中因此返回 -1
 */
public class LC704_halfSearch implements LeetCodeProblem {

    public int halfSearch(int[] nums, int start, int end, int target) {
        // 折半
        int half = (end - start) >> 1;
        if (0 == half) {
            return target == nums[start + half] ? start + half : -1;
        }
        // 目标比中间值大 往右比
        if (target > nums[start + half]) {
            return halfSearch(nums, start + half, end, target);
        }
        // 目标比中间值小 往左比
        if (target < nums[start + half]) {
            return halfSearch(nums, start, start + half, target);
        }
        if (target == nums[start + half]) {
            return start + half;
        }
        return -1;
    }

    @Override
    public void test() {
        int[] nums = {-1,0,3,5,9,12};
        int target = halfSearch(nums, 0, nums.length - 1, 5);
        System.out.print("题目704：移动零，输入："+ Arrays.toString(nums) + "查找所有，需要找到5");
        System.out.println("运行方法后得到：" + target);
    }

    public static void main(String[] args) {
        new LC704_halfSearch().test();
    }
}
