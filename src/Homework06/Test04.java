package Homework06;

import java.util.Scanner;

public class Test04 {
    private void test04(int num) {

        int primes[] = new int[num];
        primes[0] = 2;
        if (num < 2) System.out.println("不是素数");
        else {
            int counter = 0;
            boolean flag = true;
            for (int index = 2; index <= num; index++) {
                flag = true;
                for (int index01 = 0; primes[index01] <= Math.sqrt(index); index01++) {
                    if (index % primes[index01] == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    primes[counter] = index;
                    counter++;
                }
            }
        }
        //再进行分解
        for (int index = 0; primes[index] <= Math.sqrt(num); index++) {
            if (num % primes[index] == 0) {
                System.out.println(num+"="+primes[index]+"*"+(num/primes[index]));
                break;
            }
        }
    }
    public static void main(String[] args) {
        Test04 test04 = new Test04();
        Scanner intInput = new Scanner(System.in);
        System.out.println("please input your number:");
        int num =intInput.nextInt();
        test04.test04(num);
    }
}

