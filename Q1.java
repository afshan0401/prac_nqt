import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Q1 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 1, 2, 3 };

        System.out.println(uniqueElements(a, b));

        // only if sorted
        System.out.println(sortedArraySolution(a, b));

        // using hashmap
        System.out.println(usingHashMap(a, b));
    }

    public static int uniqueElements(int[] a, int[] b) {
        HashSet<Integer> hs = new HashSet<>();

        for (int el : a) {
            hs.add(el);
        }
        for (int el : b) {
            hs.add(el);
        }
        return hs.size();
    }

    public static int sortedArraySolution(int[] a, int[] b) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                arr.add(a[i]);
                int val = a[i];
                while (i < a.length && a[i] == val)
                    i++;

            } else if (a[i] > b[j]) {
                arr.add(b[j]);
                int val = b[j];
                while (j < b.length && b[j] == val)
                    j++;
            } else {
                arr.add(a[i]);
                int val = a[i];
                while (i < a.length && a[i] == val)
                    i++;
                while (j < b.length && b[j] == val)
                    j++;
            }
        }

        while (i < a.length) {
            arr.add(a[i]);
            int val = a[i];
            while (i < a.length && a[i] == val)
                i++;
        }
        while (j < b.length) {
            arr.add(b[j]);
            int val = b[j];
            while (j < b.length && b[j] == val)
                j++;
        }
        return arr.size();
    }

    public static int usingHashMap(int[] a, int[] b) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for (int n : a) {
            if (hmap.containsKey(n)) {
                hmap.put(n, hmap.get(n) + 1);
            } else {
                hmap.put(n, 1);
            }
        }
        for (int n : b) {
            if (hmap.containsKey(n)) {
                hmap.put(n, hmap.get(n) + 1);
            } else {
                hmap.put(n, 1);
            }
        }

        return hmap.size();
    }
}
