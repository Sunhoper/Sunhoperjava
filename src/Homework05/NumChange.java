package Homework05;

import java.util.Scanner;

public class NumChange {

    public static void main(String[] args) {
        System.out.println("请输入16进制数：");
        Scanner stringInput = new Scanner(System.in);
        String hexNumber = stringInput.nextLine();
        int decNumber = Integer.parseInt(hexNumber, 16);
        System.out.println("转换成10进制数为：" + decNumber);
    }
}
