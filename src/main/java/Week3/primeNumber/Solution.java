package Week3.primeNumber;

import java.util.Scanner;

public class Solution {
    /**
     * Phương thức isPrime kiểm tra số nguyên tố.
     * @param n Số tự nhiên.
     * @result true nếu n là số nguyên tố hoặc false nếu không.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Hàm thực thi main.
     * @param args Tham số dòng lệnh (Không sử dụng).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        scanner.close();
        if (isPrime(n)) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}