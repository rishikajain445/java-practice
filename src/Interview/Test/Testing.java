package Interview.Test;

import java.util.HashSet;

public class Testing {

    public void main (String []args) {
        int[] arr = {100, 200, 101, 5, 4, 1, 3, 2};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int maxLength = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int length = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum = currentNum + 1;
                    length = length + 1;
                }
                maxLength = Math.max(maxLength, length);
            }
            System.out.println (maxLength);
        }
    }
}
