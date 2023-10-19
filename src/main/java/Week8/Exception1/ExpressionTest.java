package Week8.Exception1;

public class ExpressionTest {
    // Viết lớp ExpressionTest để thử, trong đó tạo biểu thức (10^2 - 3 + 4*3)^2 và tính kết quả, in ra màn hình. Chú ý: không cần nhập dữ liệu từ tệp ngoài hoặc xử lý xâu kí tự chứa biểu thức.
    public static void main(String[] args) {
        Expression e = new Square(new Addition(new Subtraction(new Square(new Numeral(10)), new Numeral(3)), new Multiplication(new Numeral(4), new Numeral(3))));
        System.out.println(e.toString() + " = " + e.evaluate());
    }
}
