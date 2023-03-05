package Day2;

import java.util.Random;
import java.util.Scanner;

public class Ex135 {
    public static void main(String[] args) {
        // tim gia tri duong dau tien trong mang 1 chieu cac so thuc
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số lượng mảng");
        int n=0;
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = sc.nextInt();
        } while (n < 0);
        int[] arr= new int[n];
        Random random= new Random();
        //tao mang
        for (int i = 0; i < n; i++) {
            // 0 -> 999
            arr[i] = random.nextInt(1000);
            System.out.println(arr[i]);
        }
        int i=0;
        for(i =0;i<arr.length;i++)
        {
            if(arr[i]>=0)
            {
                System.out.println("số dương đầu tiên trong mảng"+arr[i]);
                break;
            }else
            {
                System.out.println("không có phần tử nào thỏa mãn");
            }
        }
    }
}