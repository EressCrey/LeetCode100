## 项目简介
这个项目用以记录LeetCode常见算法题目
每道题都包含：
- **题目类**：实现算法逻辑
- **测试方法**：可单独运行验证结果
- **统一测试入口**：可以一次性运行所有题的测试

## 🧩 类结构规范

每个题目类通常包括以下部分：

```java
public class LC283_MoveZero {
    // 题解主方法
    public int[] moveZero(int[] nums, int target) { ... }

    // 测试方法
    public void test() { ... }

    // main 方法（便于单独运行）
    public static void main(String[] args) {
        new LC283_MoveZero().test();
    }
}
```

## 🧰 开发环境
| 工具 | 版本                 |
|------|--------------------|
| JDK	 | 1.8                |
| IDE	 | IntelliJ IDEA 2024 |

## 🚀 运行方式

### 运行单题
直接在 IDE（如 IntelliJ IDEA）中运行题目类的 `main()` 方法：
```bash
LC283_MoveZero.main()
```
### 运行全部题目
运行统一测试入口：
```bash
LeetCodeTestRunner.main()
```

## 目前记录的题目
### 数组：
283.移动零
704. 二分查找
27. 移除元素
977.有序数组的平方
209.长度最小的子数组
59.螺旋矩阵II
56. 合并区间
438.找到字符串中所有字母异位词
560.和为 K 的子数组
189.轮转数组
238.除自身以外数组的乘积
41. 缺失的第一个正数
