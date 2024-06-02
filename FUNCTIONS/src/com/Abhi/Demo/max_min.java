package com.Abhi.Demo;

public class max_min {
    public static void main(String[] args) {
        System.out.println(Max(3, 5, 7));
        System.out.println(Min(2, 56, 01));
    }

    static int Min(int a, int b, int c) {
        return Math.min(c, Math.min(a, b));
    }

    static int Max(int a, int b, int c) {
//        return Math.max(c,Math.max(a,  b));
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
/*int max = first;
if (second > max)
 { max = second; }
if (third > max)
{
max = third; }
return max;
 }
 */


