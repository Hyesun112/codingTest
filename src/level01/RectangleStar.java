package level01;

import java.util.Scanner;

class RectangleStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < b; i++ ) {
            for(int  j = 0; j < a; j++) {
                System.out.printf("%s", "*");
            }
            System.out.println();
        }
        System.out.println(a + b);
    }
}
