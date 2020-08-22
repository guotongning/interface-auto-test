package com.ning.javabase1;

/**
 * *
 * ***
 * *****
 * *******
 * *********
 */

public class Test20200822 {
    /*

 *
 ***
 *****
 *******
 *********
  屏幕打印上面图形：
  分析：
  5行 每行递增的*号
  所以需要两层foreach.
  第一层：
  i :    1 2 3 4 5
  第二层：
  j :    1 3 5 7 9
  j + 1 :2 4 6 8 10
  i ---> j + 1
  公式： 2 * i = j
        (i - 1) *  = j - 1
        (i - 1) * 2 + 1 = j
  i ---> j
  公式： (i - 1) * 2 + 1 = j
    *
   ***
  *****
 *******
*********
第一层：
i:1 2 3 4 5
第二层：
j：1 3 5 7 9
k：4 3 2 1 0
(i - 1) * 2 + 1 = j
5-i=k
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
第一层：
i 1 2 3 4
j 7 5 3 1
k 1 2 3 4
j =
k= 5 -i
**************
***********
*********
*******
*****
***
*/

    public static void main(String[] args) {
        Test20200822 a = new Test20200822();
        //a.print1();
        //a.print2();
        //a.print3();
        a.print4();
    }
    public void print4(){
        for (int i= 1;i<=9;i++){
            for (int j =1; j <=i; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
    public void print3() {
        for (int i = 1; i <= 4; i++) {
            for (int k = 1; k <=i; k++) {
                System.out.print(" ");
            }
            for (int j = 7; j >=(i-1)*2+1 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void print1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void print2() {
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
