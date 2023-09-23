package Week2.GCD;

import java.util.Scanner;

public class Solution {
    /**
     * Tính ước số chung lớn nhất của hai số nguyên a và b.
     *
     * @param a Số nguyên a.
     * @param b Số nguyên b.
     * @return Ước số chung lớn nhất của a và b.
     */
    public static int gcd(int a, int b) {
        // Đảm bảo a và b không âm
        a = Math.abs(a);
        b = Math.abs(b);

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    /**
     * Hàm main.
     *
     * @param args Tham số dòng lệnh (Không sử dụng).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        scanner.close();

        int result = gcd(a, b);

        System.out.print(result);
    }
}
