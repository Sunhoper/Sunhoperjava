package Homework06;

public class Test02 {
    private void test02(int num){

        if (num<2) System.out.println("不是素数");
        else {
            int primes[] = new int[num];
            int counter = 0;
            boolean flag=true;
            for (int index=2; index<=num; index++) {
                flag=true;
                for (int index01=2; index01<=Math.sqrt(index);index01++) {
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


        }
    }

    public static void main(String[] args) {

        Test02 test02= new Test02();
        int num =75;
        test02.test02(num);

    }
}

