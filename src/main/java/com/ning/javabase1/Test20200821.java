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
        j = 1;
        while (i <=100) {
            boolean shizhishu = true;
            while (j <= i) {
                if (i%j==0 && j!=i&& j!=1) {
                    shizhishu = false;
                } else j++;
            }
            if (shizhishu) {
                System.out.println(i);
            }
            i++;
        }
    }
}
