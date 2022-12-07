package Homework06;

public class Test03 {
    public void test03(int num){

        if (num<2) System.out.println("不是素数");
        else {
            int primes[] = new int[num];
            primes[0]=2;
            int counter = 0;
            boolean flag=true;
            for (int index=2; index<=num; index++) {
                flag=true;
                for (int index01=0; primes[index01]<=Math.sqrt(index);index01++) {
                    if (index%primes[index01]==0){
                        flag = false;
                        break;
                    }
                }if (flag) {
                    primes[counter]=index;
                    counter++;
                }
            }
            System.out.println(num+"之内有"+counter+"个素数");
            //for (int index=0; index<counter; index++){System.out.print(primes[index]+";");}

        }
    }

    public static void main(String[] args) {
        Test03 test03= new Test03();
        int num =75;
        test03.test03(num);

    }
}

