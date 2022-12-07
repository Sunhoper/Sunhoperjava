package Homework04;

public class Matrix {



        public static int[][] addMtrix(int[][] c, int[][] d) {
            int a[][] = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    a[i][j] = c[i][j] + d[i][j];
                }
            }
            return a;
        }

        public static void printMatrix(int[][] a){
            for(int i = 0; i < a.length; i++) {
                for(int j = 0; j < a.length; j++) {
                    System.out.print(a[i][j] + "        ");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            int c [] [] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            int d [] [] = {{2, 2, 2}, {1, 1, 1}, {3, 3, 3}};
            int a [] [] = addMtrix(c,d);
            System.out.println("两个数组的和为：");
            printMatrix(a);
        }
    }



