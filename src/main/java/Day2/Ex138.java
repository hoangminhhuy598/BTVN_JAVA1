package Day2;

import java.util.Scanner;

public class Ex138 {
    public static void main(String[] args) {
        // tim vi tri chan dau tien trong mang 1 chieu so nguyen . neu mang khong co gia tri
        // chan thi tra ve tri la -1
        Scanner sc= new Scanner(System.in);
        int[] arr={11,45,12,8,90};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.println("phan tu so le dau tien tron mang la"+arr[i]);
            }
        }


    }
}