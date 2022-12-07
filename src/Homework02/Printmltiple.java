package Homework02;

//打印1~100之间所有是7的倍数的整数的个数及总和（体会设置计数器的思想）

public class Printmltiple {
    public static void main(String[] args){
        int count = 0, num = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 7 == 0){
                num++;
                count += i;
            }
        }
        System.out.println("个数" + num);
        System.out.println("总和" + count);
    }
}