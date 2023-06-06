import java.lang.StringBuilder;
import java.lang.reflect.Array;

public class Algorithms {
    public String doubleChar(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            sb.append(str.charAt(i));
        }
        return sb.toString();
      }
    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                count++;
            }
        
        }
        // String[] arr = str.split("code", -1);
        // int count = arr.length - 1;
        return count;
      }
      public boolean endOther(String a, String b) { //a = abc, b = AbC
        String lowerA = a.toLowerCase();
        String lowerB = b.toLowerCase();

        if (lowerB.length() >= lowerA.length()) {
           return lowerB.endsWith(lowerA);
        } else {
           return lowerA.endsWith(lowerB);
        }
      }
      public boolean xyzThere(String str) {
        if (str.substring(0, 3) == "xyz") {
            return true;
        }
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) != '.' && str.substring(i + 1, i + 3).equals("xyz")) {
                return false;
            } 
            else if (str.substring(i + 1, i + 3).equals("xyz")) {
                return true;
            }
        }
        return false;
      }
      int[] bubbleSort(int[] toSort) {
        for (int i = 0; i < toSort.length; i++) {
            for (int j = 0; j < toSort.length - 1 - i; j++) {
                if (toSort[j] > toSort[j + 1]) {
                    int temp = toSort[j];
                    toSort[j] = toSort[j + 1];
                    toSort[j + 1] = temp;
                }
            }
        }
        return toSort;
    }
    boolean findNumber(int[] arr, int numSelect) {
        // if a number in the array is the max int value will cause an integer overflow error
        int start = 0;
        int end = arr.length - 1;
    
        while (start <= end) {
            int mid = start + (end - start) / 2;
    
            if (arr[mid] == numSelect) {
                return true;
            } else if (arr[mid] < numSelect) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    
        return false;
    }

    public String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int front = 0;
        int back = str.length() - 1;

        for (int i = 0; i < str.length() / 2; i++) {
            char temp = charArray[front];
            charArray[front] = charArray[back];
            charArray[back] = temp;
            front++;
            back--;
        }
        return new String(charArray);
    }

}
