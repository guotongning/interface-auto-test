package com.ning.javabase1;

public class Test20200821 {
    /**
     * 用while循环输出100以内的质数
     *
     * @param args
     */
    public static void main(String[] args) {
        int i, j;
        i = 2;
        while (i <=100) {
            j = 1;
            boolean shizhishu = true;
            while (j <= i) {
                if (i%j==0 && j!=i&& j!=1) {
                    shizhishu = false;
                    break;
                }
                j++;
            }
            if (shizhishu) {
                System.out.println(i);
            }
            i++;
        }
    }
}
