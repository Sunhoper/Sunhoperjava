package Homework02;

//输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。例如:153= 1*1*1＋3*3*3＋5*5*5。

public class GetNum {
    public static void main(String[] args) {
        //遍历寻找所有的三位数
        for (int i = 100; i < 1000; i++) {
            //判断是不是水仙花数
            if(isAim(i)) {
                //如果是水仙花数，就打印
                System.out.println(i);
            }
        }
    }

    //判断水仙花数的方法
    public static boolean isAim(int a) {
        int x = a/100;
        int y = a/10%10;
        int z = a%10;
        if(a == x*x*x+y*y*y+z*z*z) {
            return true;
        }
        return false;
    }
}

