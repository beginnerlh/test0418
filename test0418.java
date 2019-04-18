/*
编写一个程序，找出第 n 个丑数。
丑数就是只包含质因数 2, 3, 5 的正整数。

 示例:
 输入: n = 10
 输出: 12
 解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。
   */
package lianxi0418;

public class test0418 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int index = 14;
        int a = s.GetUglyNumber_Solution(index);
        System.out.println(a);
    }
}

class Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index < 1){
            return 0;
        }
        int[] num = new int[index];
        num[0] = 1;
        int n2 = 0;
        int n3 = 0;
        int n5 = 0;
        for(int i = 1; i<index;i++){
            num[i] = Math.min(Math.min(num[n2]*2,num[n3]*3),num[n5]*5);
            if(num[i] == num[n2]*2){
                n2++;
            }
            if(num[i] == num[n3]*3){
                n3++;
            }
            if(num[i] == num[n5]*5){
                n5++;
            }
        }
        return num[index - 1];
    }
}
