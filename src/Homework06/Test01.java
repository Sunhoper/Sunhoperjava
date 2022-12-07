package Homework06;

public class Test01 {
    private void test01(int num){

        if (num<2) System.out.println("不是素数");
        else {
            int primes[] = new int[num];
            int counter = 0;
            boolean flag=true;
            for (int index=2; index<=num; index++) {
                flag=true;
                for (int index01=2; index01<index;index01++) {
                    if (index%index01==0){
                        flag = false;
                        break;
                    }
                }if (flag) {
                    primes[counter]=index;
                    counter++;
                }
            }
            System.out.println(num+"之内有"+counter+"个素数");
            for (int index=0; index<counter; index++){System.out.print(primes[index]+";");}

        }
    }

    public static void main(String[] args) {

        Test01 test01= new Test01();
        int num = 75;
        test01.test01(num);

    }
}