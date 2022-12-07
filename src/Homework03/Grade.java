package Homework03;

//对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”

import java.util.Scanner;

public class Grade {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("请输入考试成绩：(0-100)");
            int grade = scan.nextInt();

            switch (grade / 60){
                case 0:
                    System.out.println("不及格");
                    break;
                case 1:
                    System.out.println("及格");
                    break;
            }

        }
    }
