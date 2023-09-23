package Week2.Fraction;

public class Solution {
    private int numerator;
    private int denominator;

    /**
     * Hàm khởi tạo mặc định.
     */
    public Solution() {
        this.numerator = 1;
        this.denominator = 1;
    }

    /**
     * Hàm khởi tạo cho phân số.
     *
     * @param numerator Tử số.
     * @param denominator Mẫu số.
     */
    public Solution(int numerator, int denominator) {
        if (denominator != 0) {
            this.numerator = numerator;
            this.denominator = denominator;
        } else {
            this.numerator = numerator;
            this.denominator = 1;
        }
    }

    /**
     * Hàm lấy giá trị tử số.
     *
     * @return Giá trị tử số.
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Hàm đặt giá trị tử số.
     *
     * @param numerator Giá trị tử số.
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * Hàm lấy giá trị mẫu số.
     *
     * @return Giá trị mẫu số.
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Hàm đặt giá trị mẫu số.
     *
     * @param denominator Giá trị mẫu số.
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            return;
        }
    }

    /**
     * Hàm tính ước chung lớn nhất.
     *
     * @param a Số tự nhiên 1.
     * @param b Số tự nhiên 2.
     * @return Ước chung lớn nhất của hai số a và b.
     */
    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if (b == 0)  {
            return a;
        }

        return gcd(b, a % b);
    }

    /**
     * Hàm thu gọn phân số.
     *
     * @return Phân số đã thu gọn.
     */
    public Solution reduce() {
        if (denominator == 0) {
            this.denominator = 1;
        } else {
            int k = gcd(numerator, denominator);

            if (k != 0) {
                numerator /= k;
                denominator /= k;
            }
        }
        return this;
    }

    /**
     * Hàm tính tổng hai phân số.
     *
     * @param that Phân số được cộng thêm.
     * @return Phân số sau khi đã cộng thêm that.
     */
    public Solution add(Solution that) {
        int deno = this.denominator * that.denominator;
        int newNum1 = this.numerator * that.denominator;
        int newNum2 = this.denominator * that.numerator;

        this.numerator = newNum1 + newNum2;
        this.denominator = deno;

        return this;
    }

    /**
     * Hàm trừ hai phân số.
     *
     * @param that Phân số trừ.
     * @return Phân số sau khi trừ đi that.
     */
    public Solution subtract(Solution that) {
        int deno = this.denominator * that.denominator;
        int newNum1 = this.numerator * that.denominator;
        int newNum2 = this.denominator * that.numerator;

        this.numerator = newNum1 - newNum2;
        this.denominator = deno;

        return this;
    }

    // Multiply
    /**
     * Hàm tính tích hai phân số.
     *
     * @param that Phân số thừa số.
     * @return Phân số sau khi đã nhân với that.
     */
    public Solution multiply(Solution that) {
        if (that.denominator == 0) {
            that.denominator = 1;
        }

        if (this.denominator == 0) {
            denominator = 1;
        }

        this.numerator *= that.numerator;
        this.denominator *= that.denominator;

        return this;
    }

    /**
     * Hàm tính thương hai phân số.
     *
     * @param that Phân số chia.
     * @return Phân số sau khi chia cho that.
     */
    public Solution divide(Solution that) {
        if (that.denominator == 0) {
            that.denominator = 1;
        }

        if (this.denominator == 0) {
            this.denominator = 1;
        }

        this.numerator *= that.denominator;
        this.denominator *= that.numerator;

        return this;
    }

    // Compare two fractions
    @Override
    public boolean equals(Object obj) {
        if (this.denominator == 0) {
            return false;
        }

        if (obj instanceof Solution) {
            Solution that = (Solution) obj;

            if (that.denominator == 0) {
                return false;
            }

            this.reduce();
            that.reduce();

            if ((this.numerator == that.numerator) && (this.denominator == that.denominator)) {
                return true;
            }

            return false;
        }

        return false;
    }
}