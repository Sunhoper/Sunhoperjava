package Homework02;

//打印1~100之间所有奇数的和

public class Printtheodd {
        public static void main(String[] args) {
            int j=0;
            for(int i=1;i<=100;i++) {
                //100以内的数,通过取余求出尾数
                if (i % 2 - 1 == 0) {
                    j += i;//100以内的奇数和
                }
            }
                    System.out.println(j);
            }
        }

