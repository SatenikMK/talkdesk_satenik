import java.util.Arrays;

public class FrequentDigit {

    public int[] digitsArray (int[] number) {
        if(number.length == 0) return number;
        int [] res = new int[number.length];
        int j = 0;
        for (int i = 0; i < number.length; i++) {
            int num = number[i];
            if(num == 0) {
                if (j == res.length) {
                    res = Arrays.copyOf(res, res.length+1);
                }
                res[j] = num;
                j++;
            }
            while (num > 0){
                int digit = num%10;
                num /= 10;
                if (j == res.length) {
                    res = Arrays.copyOf(res, res.length+1);
                }
                res[j] = digit;
                j++;
            }
        }
        return res;
    }

    public int [] findPopular(int [] a){
        int[] res = new int[2];
        Arrays.sort(a);

        int previous = a[0];
        int popular = a[0];
        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] == previous)
                count++;
            else {
                if (count > maxCount) {
                    popular = a[i-1];
                    maxCount = count;
                }
                previous = a[i];
                count = 1;
            }
        }

        res[0] = count > maxCount ? a[a.length-1] : popular;
        res[1] = maxCount;
        return res;
    }

    public int sum (int[] arr, int index1, int index2) {
        int sum = 0;
        if (index1 < arr.length) {
            sum += arr[index1-1];
        }
        if (index2 < arr.length) {
            sum += arr[index2-1];
        }
        return sum;
    }

    public int sumOf(int[] arr1, int[] arr2) {
        int[] digitsOfArray1 = digitsArray(arr1);
        int[] popularInArray = findPopular(digitsOfArray1);
        return sum(arr2, popularInArray[0], popularInArray[1]);
    }

}
