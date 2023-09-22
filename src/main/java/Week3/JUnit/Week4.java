package Week3;

import static java.lang.String.format;

public class Week4 {
    /**
     * Phương thức tìm giá trị lớn nhất của hai số nguyên.
     *
     * @param a số nguyên 1.
     * @param b số nguyên 2.
     * @return số lớn nhất trong hai số a và b.
     */
    public static int max2Int(int a, int b) {
        // Tim gia tri lon nhat cua hai so nguyen
        if (a > b) return a;
        else return b;
    }

    /**
     * Phương thức tìm giá trị nhỏ nhất của mảng
     *
     * @param array Mảng số nguyên đầu vào.
     * @return
     */
    public static int minArray (int[] array) {
        // Tim gia tri nho nhat cua 1 mang so nguyen
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    /**
     * Phương thức tính chỉ số BMI.
     *
     * @param weight cân nặng.
     * @param height chiều cao.
     * @return chỉ số BMI.
     */
    public static String calculateBMI(double weight, double height){
        // Tinh BMI
        double BMI = weight / Math.pow(height, 2);
        format("%.1f", BMI);

        if (BMI  < 18.5) {
            return "Thiếu cân";
        } else if (BMI >= 18.5 && BMI <=22.9) {
            return "Bình thường";
        } else if (BMI >=23 && BMI <= 24.9) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }
}
