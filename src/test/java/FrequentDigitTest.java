import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class FrequentDigitTest {

    FrequentDigit frequentDigit = new FrequentDigit();

    @Test
    void digitsArray_onlySingleDigits() {
        int[] actualArray = new int[]{1, 5, 6, 7, 8, 4, 1};
        int[] expected = frequentDigit.digitsArray(actualArray);
        Assertions.assertArrayEquals(expected,actualArray);
    }

    @Test
    void digitsArray_empty() {
        int[] actualArray = new int[]{};
        int[] expected = frequentDigit.digitsArray(actualArray);
        Assertions.assertArrayEquals(expected,actualArray);
    }

    @Test
    void digitsArray_containsTwoDigits() {
        int[] actualArray = new int[]{2, 4, 12, 56, 4, 8};
        int[] digitArray = new int[] {2, 4, 1, 2, 5, 6, 4, 8};
        int[] expected = frequentDigit.digitsArray(actualArray);
        Assertions.assertEquals(expected.length,digitArray.length);
    }

    @Test
    void findPopular() {
        int[] actualArray = new int[]{1, 5, 15, 525, 8, 8, 1};
        int[] expected = frequentDigit.findPopular(actualArray);
        Assertions.assertEquals(5, expected[0]);
        Assertions.assertEquals(4, expected[1]);
    }

    @Test
    void sum() {
        int[] givenArray = new int[]{11, 5, 15, 525, 8, 8, 1};
        int index1 = 5;
        int index2 = 2;
        int sum = frequentDigit.sum(givenArray,index1,index2);
        Assertions.assertEquals(13, sum);
    }

    @Test
    void frequentDigitFullTest() {
        int[] set1 = new int[]{ 3,5,768,3,6,23,98,38,32,45,34,234};
        int[] set2 = new int[]{10,12,43,74,25,56,37,98,29,10};

        int sum = frequentDigit.sumOf(set1,set2);
        Assertions.assertEquals(80, sum);
    }

}