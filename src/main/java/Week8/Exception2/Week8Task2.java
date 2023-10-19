package Week8.Exception2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Week8Task2 {
    /**
     * Null Pointer Exception.
     */
    public void nullPointerEx() {
        String str = null;
        System.out.println(str.length());
    }

    /**
     * Test Null Pointer Exception.
     * @return "Lỗi Null Pointer" if exception is thrown, "Không có lỗi" otherwise.
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";
    }

    /**
     * Array Index Out of Bounds Exception.
     */
    public void arrayIndexOutOfBoundsEx() {
        int[] arr = new int[5];
        System.out.println(arr[10]);
    }

    /**
     * Test Array Index Out of Bounds Exception.
     * @return "Lỗi Array Index Out of Bounds" if exception is thrown, "Không có lỗi" otherwise.
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    /**
     * Arithmetic Exception.
     */
    public void arithmeticEx() {
        System.out.println(1 / 0);
    }

    /**
     * Test Arithmetic Exception.
     * @return "Lỗi Arithmetic" if exception is thrown, "Không có lỗi" otherwise.
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    /**
     * File Not Found Exception.
     * @throws FileNotFoundException Library java.io.FileNotFoundException.
     */
    public void fileNotFoundEx() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    /**
     * Test File Not Found Exception.
     * @return "Lỗi File Not Found" if exception is thrown, "Không có lỗi" otherwise.
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
        return "Không có lỗi";
    }

    /**
     * IO Exception.
     * @throws IOException Library java.io.IOException.
     */
    public void ioEx() throws IOException {
        throw new IOException();
    }

    /**
     * Test IO Exception.
     * @return "Lỗi IO" if exception is thrown, "Không có lỗi" otherwise.
     */
    public String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }
}
