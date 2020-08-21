package com.ning.javabase1;

/**
 * @Author: nicholas
 * @Date: 2020/8/21 21:50
 * @Descreption:
 */
public class GtnTest {
    public static void main(String[] args) {
        printZhiShu();
    }

    /*
    余数： 一个数除以一个数。除不尽。剩下的数。叫余数
     */
    public static void printZhiShu() {
        //外层循环
        for (int i = 2; i <= 100; i++) {
            // java一般定义循环变量是： i j k ...
            // && 表示：且
            // || 表示：或

            // 1 2 3 4 5 ......i j
            // 1 ? 不是质数。
            // 2 ？ 是
            // 3 ？ 是        3%1 = 0；        3%2 = 1；                3%3 = 0；                       //3只能被1 和 3 整除。
            // 4 ？ 不是      4%1 = 0；      4%2 = 0； 4%3 = 1；         4%4 = 0               // 4可以被1 2 4 这三个数整除，所以4不是质数。
            // 5 ？ 是        5%1 = 0；   5%2 = 1； 5%3 = 2； 5%4 = 1；  5%5 = 0；   // 5 只能被1 和自己整除，所以5是质数。
            // 6 ? 不是       6%1 = 0  6%2 = 0；6%3=0；6%4=2；6%5=1；    6%6 = 0；
            boolean isZhiShu = true;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0 && j != 1 && j != i) {
                    //不是质数
                    isZhiShu = false;
                }
            }
            if (isZhiShu) {
                System.out.println(i);
            }
        }
    }
}
