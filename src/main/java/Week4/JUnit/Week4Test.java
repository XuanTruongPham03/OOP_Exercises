package Week4.JUnit;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Week4Test {
    @Test
    public void testMax2Int1() {
        int re = Week4.max2Int(1, 2);
        assertEquals(2, re);
    }

    @Test
    public void testMax2Int2() {
        int re = Week4.max2Int(2, 3);
        assertEquals(3, re);
    }

    @Test
    public void testMax2Int3() {
        int re = Week4.max2Int(1, 1);
        assertEquals(1, re);
    }

    @Test
    public void testMax2Int4() {
        int re = Week4.max2Int(10, 9);
        assertEquals(10, re);
    }

    @Test
    public void testMax2Int5() {
        int re = Week4.max2Int(11, 1);
        assertEquals(11, re);
    }

    @Test
    public void testMinArray1() {
        int[] arr = {1, 2, 3};
        int min = Week4.minArray(arr);

        assertEquals(1, min);
    }

    @Test
    public void testMinArray2() {
        int[] arr = {9, 8, 7, 6};
        int min = Week4.minArray(arr);

        assertEquals(6, min);
    }

    @Test
    public void testMinArray3() {
        int[] arr = {5, 5, 5};
        int min = Week4.minArray(arr);

        assertEquals(5, min);
    }

    @Test
    public void testMinArray4() {
        int[] arr = {1, 1};
        int min = Week4.minArray(arr);

        assertEquals(1, min);
    }

    @Test
    public void testMinArray5() {
        int[] arr = {2, 3};
        int min = Week4.minArray(arr);

        assertEquals(2, min);
    }

    @Test
    public void testCalculateBMI1() {
        String bmi = Week4.calculateBMI(30, 1.7);

        assertEquals("Thiếu cân", bmi);
    }

    @Test
    public void testCalculateBMI2() {
        String bmi = Week4.calculateBMI(65, 1.72);

        assertEquals("Bình thường", bmi);
    }

    @Test
    public void testCalculateBMI3() {
        String bmi = Week4.calculateBMI(50, 1.52);

        assertEquals("Bình thường", bmi);
    }

    @Test
    public void testCalculateBMI4() {
        String bmi = Week4.calculateBMI(21, 1.3);

        assertEquals("Thiếu cân", bmi);
    }

    @Test
    public void testCalculateBMI5() {
        String bmi = Week4.calculateBMI(19, 1.2);

        assertEquals("Thiếu cân", bmi);
    }
}
