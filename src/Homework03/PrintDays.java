package Homework03;

//编写程序：从键盘上输入2014年的“month”和“day”，要求通过程序输出输入的日期为2014年的第几天。

import java.util.Scanner;

public class PrintDays {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("请输入月份：（1-12）");
            int month = scan.nextInt();
            System.out.println("请输入号数：（1-31）");
            int day = scan.nextInt();

            switch (month){
                case 1:
                    System.out.println("2014年的第" + day + "天");
                    break;
                case 2:
                    System.out.println("2014年的第" + (31 + day) + "天");
                    break;
                case 3:
                    System.out.println("2014年的第" + (59 + day) + "天");
                    break;
                case 4:
                    System.out.println("2014年的第" + (90 + day) + "天");
                    break;
                case 5:
                    System.out.println("2014年的第" + (120 + day) + "天");
                    break;
                case 6:
                    System.out.println("2014年的第" + (151 + day) + "天");
                    break;
                case 7:
                    System.out.println("2014年的第" + (181 + day) + "天");
                    break;
                case 8:
                    System.out.println("2014年的第" + (212 + day) + "天");
                    break;
                case 9:
                    System.out.println("2014年的第" + (243 + day) + "天");
                    break;
                case 10:
                    System.out.println("2014年的第" + (273 + day) + "天");
                    break;
                case 11:
                    System.out.println("2014年的第" + (304 + day) + "天");
                    break;
                case 12:
                    System.out.println("2014年的第" + (334 + day) + "天");
                    break;
            }
            }
        }
