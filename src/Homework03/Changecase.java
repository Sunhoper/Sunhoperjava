package Homework03;

  //使用 switch 把小写类型的 char型转为大写。只转换 a, b, c, d, e. 其它的输出 “other”。

import java.util.Scanner;

public class Changecase {

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入小写的26字母：");
            String word = scan.next();
            char ch = word.charAt(0);

            switch(ch){
                case 'a':
                    System.out.println("A");
                    break;
                case 'b':
                    System.out.println("B");
                    break;
                case 'c':
                    System.out.println("C");
                    break;
                case 'd':
                    System.out.println("D");
                    break;
                case 'e':
                    System.out.println("E");
                    break;
                default:
                    System.out.println("other");

            }

        }
    }
