package Day1;

import java.util.Scanner;

//        Viết chương trình nhập vào hai số thực. Kiểm tra xem chúng có cùng
//        dấu hay không.

public class Ex83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a,b;
        System.out.println("Nhập a= ");
        a=sc.nextFloat();
        System.out.println("Nhập b= ");
        b=sc.nextFloat();

        if(a>=0&&b>=0) {
            System.out.println(a+ " cùng dấu với " + b);
        }
        else {
            System.out.println(a+ " trái dấu với " + b);
        }
    }
}