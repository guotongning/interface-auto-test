package com.ning.javabase1;

public class Test20200821 {
    /**
     * 用while循环输出100以内的质数
     */

    /**
     * 输出100以内的质数
     *
     * @param args
     */
    public static void main(String[] args) {
        int i = 2;
        int j = 1;
        while (i <= 100) {
            i++;
            boolean shizhishu = true;
            while (j <= i) {
                j++;
                if (i % j == 0 && j != i && j != 1) {
                    shizhishu = false;
                }
            }
            if (shizhishu) {
                    System.out.println(i);
                }
            }
        }

        /**
         * 循环打印100以内的偶数
         */
        public static void printoushu () {
            for (int x = 0; x < 100; x = x + 1) {
                if (x % 2 == 0) {
                    System.out.println(x);
                }
            }
        }

        /**
         * 输出100能被3整除的数
         */
        public static void printzhengchu3 () {
            int x = 0;
            while (x <= 100) {
                if (x % 3 == 0) {
                    System.out.println(x);
                }
                x = x + 1;
            }
        }
        public static void iszhishu () {
            for (int i = 1; i <= 100; i++) {
                if (i == 1) {
                    continue;
                }
                boolean iszhishu = true;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0 && j != i && j != 1) {
                        iszhishu = false;
                    }
                }
                if (iszhishu) {
                    System.out.println(i);
                }
            }
        }

    }
