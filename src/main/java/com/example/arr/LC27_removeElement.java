package com.example.arr;

import com.example.abs.LeetCodeProblem;

import java.util.Arrays;

/**
 *给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素。
 * 元素的顺序可能发生改变。然后返回 nums 中与 val 不同的元素的数量。
 *
 * 假设 nums 中不等于 val 的元素数量为 k，要通过此题，您需要执行以下操作：
 * 更改 nums 数组，使 nums 的前 k 个元素包含不等于 val 的元素。
 * nums 的其余元素和 nums 的大小并不重要。
 * 返回 k。
 */
public class LC27_removeElement implements LeetCodeProblem {

    /**
     * 双指针
     */
    public int removeElement(int[] nums, int val) {
        //左指针
        int left = 0;
        //右指针
        int right = nums.length - 1;

        //左右指针靠拢
        while(left <= right){

            if(val == nums[left]){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                right --;
            }else {
                left ++;
            }
        }
        return left;
    }

    @Override
    public void test() {
        int[] nums = {3,2,2,3};
        int val = 3;
        int target = removeElement(nums, val);
        System.out.print("题目27：移除相同元素，输入："+ Arrays.toString(nums) + "需要移除" + val);
        System.out.println("返回移除后数组长度为：" + target);
    }

    public static void main(String[] args){
        new LC27_removeElement().test();
    }
}
