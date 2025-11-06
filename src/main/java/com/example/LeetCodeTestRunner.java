package com.example;

import com.example.arr.*;

public class LeetCodeTestRunner {
    public static void main(String[] args) {
        // 数组
        // 移动零
        new LC283_moveZero().test();
        // 折半查找
        new LC704_halfSearch().test();
        // 移除相同元素
        new LC27_removeElement().test();
        // 有序数组的平方
        new LC977_sortedSquares().test();
        // 长度最小的子数组
        new LC209_minSubArrayLen().test();
        // 生成螺旋矩阵
        new LC56_generateMatrix().test();
        // 合并数组区间
        new LC59_merge().test();
    }
}
