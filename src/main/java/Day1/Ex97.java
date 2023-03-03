package Day1;

import java.util.Scanner;
//        Viết chương trình nhập 3 cạnh của một tam giác. Hãy cho biết đó là tam giác gì?
public class Ex97 {
    public static void main(String[] args) {

        float a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a= ");
        a=sc.nextFloat();
        System.out.println("Nhập b= ");
        b=sc.nextFloat();
        System.out.println("Nhập c= ");
        c=sc.nextFloat();
        if(a + b <= c || a + c <= b ||  b + c <= a)
        {
            System.out.println("\nTam giác không hợp lệ. Vui lòng kiểm tra lại !");
        }
        else
        {
            System.out.println("\nDay la tam giac: ");
            if((a == b) && (b == c))
            {
                System.out.println("Đều");
            }
            else
            {
                if(a * a + b * b == c * c || a * c + c * c == b * b || b * b + c * c == a * c)
                {
                    System.out.println("Vuông");
                }
                if(a == b || a == c || b == c)
                {
                    System.out.println("Cân");
                }
                else
                {
                    System.out.println("Thường");
                }
            }
        }
    }
}