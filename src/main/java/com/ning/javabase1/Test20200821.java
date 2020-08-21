package com.ning.javabase1;

public class Test20200821 {
    /**
     * 输出100以内的质数
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i==1){
                continue;
            }
            boolean iszhishu = true;
            for (int j = 1; j<=i; j++) {
                if (i % j == 0 && j != i && j != 1) {
                    iszhishu = false;
                }
            }
            if (iszhishu) {
                System.out.println(i);
            }
        }
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

    /**
     * 循环打印100以内的偶数
     */
    public static void printoushu() {
        for (int x = 0; x < 100; x = x + 1) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }
    }

    /**
     * 输出100能被3整除的数
     */
    public static void printzhengchu3() {
        int x = 0;
        while (x <= 100) {
            if (x % 3 == 0) {
                System.out.println(x);
            }
            x = x + 1;
        }
    }

}
