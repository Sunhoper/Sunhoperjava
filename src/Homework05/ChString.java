package Homework05;

import java.util.Scanner;

public class ChString {
    public static void main(String[] args) {
        //判断是否为回文
        Scanner stringInput = new Scanner(System.in);
        System.out.println("please input any string:");
        String palindrome = stringInput.nextLine();
        StringBuffer newpalindrome = new StringBuffer();
        for (int index=palindrome.length()-1; index>=0; index--) {
            newpalindrome.append(palindrome.charAt(index));
        }
        boolean palin = false;
        for (int index=0; index<palindrome.length(); index++){
            if (palindrome.charAt(index)==newpalindrome.charAt(index))  palin=true;
            else palin=false;
        }
        if (palin) System.out.println("输入的的字符串："+palindrome+"是回文");
        else System.out.println("输入的的字符串："+palindrome+"不是回文");
}
}

