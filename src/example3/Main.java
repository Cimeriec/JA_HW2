package example3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = in.nextInt();
        in.close();
        LinkedList<Integer> list = getIntegerList(n);
        for (Integer temp : list) {
            System.out.print(temp + " ");
        }
        System.out.println();
        System.out.println("Minimum value: " + getMinimum(list));
    }

    public static LinkedList<Integer> getIntegerList(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add((int) (Math.random() * 100));
        }
        return list;
    }

    public static int getMinimum(List<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }
        return min;
    }
}
