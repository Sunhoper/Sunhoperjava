package Homework05;

import java.util.Scanner;

public class ChFound {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner stringInput = new Scanner(System.in);
        String longString = stringInput.nextLine();
        System.out.println("请输入需要查找的字符：");
        char findChar = (stringInput.nextLine()).charAt(0);
        int lastPosion = 0;
        for (int index = 0; index < longString.length(); index++) {
            if (findChar == longString.charAt(index)) lastPosion = index + 1;
        }
        if (lastPosion == 0) System.out.println("Not Found!");
        else System.out.println(findChar + "最后出现在" + longString + "的" + lastPosion + "位");
    }
}