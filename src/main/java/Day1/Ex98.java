package Day1;

import java.util.Scanner;

//        Lập chương trình giải hệ:
//        {ax+by=c
//            dx+ey=f
//            Các hệ số a, b, c, d, e, f nhập từ bàn phím. Yêu cầu xét tất cả các trường
//            hợp có thể.
public class Ex98 {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        float a, b, c,d, e, f;
        System.out.println("Nhập các hệ số a b c d e f");
        a =  sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        d= sc.nextFloat();
        e = sc.nextFloat();
        f= sc.nextFloat();
        float D = a*e - d * b;
        float Dx = c*e - f*b;
        float Dy = a*f - d*c;

        if(D == 0 && Dx ==0 && Dy == 0) {
            System.out.println("Hệ phương trình vô số nghiệm");
        }else if(D != 0){
            System.out.printf("Nghiệm của phương trình %.2f, %.2f " ,Dx/D,Dy/D);
        }else {
            System.out.println("Hệ phương trình vô nghiệm");
        }
    }
}
