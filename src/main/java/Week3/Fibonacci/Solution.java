package Week3.Fibonacci;

import java.util.Scanner;

public class Solution {
    /**
     * Tính toán số Fibonacci thứ n.
     *
     * @param n Số Fibonacci thứ n cần tính.
     * @return Số Fibonacci thứ n.
     */
    public static long fibonacci(long n) {
        if (n < 0) {
            return -1;
        } else if (n <= 1) {
            return n;
        }

        long prev = 0;
        long curr = 1;

        for (int i = 2; i <= n; i++) {
            long tmp = curr;
            curr = prev + curr;

            if (curr < 0) {
                return Long.MAX_VALUE;
            }

            prev = tmp;
        }

        return curr;
    }

    /**
     * Hàm main để thực thi chương trình.
     *
     * @param args Tham số dòng lệnh (không sử dụng trong ví dụ này).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        scanner.close();

        long re = fibonacci(n);

        System.out.print(re);
    }
}

