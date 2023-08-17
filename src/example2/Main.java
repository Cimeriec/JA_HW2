package example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            try {
                System.out.print("Enter " + (i + 1) + " word: ");
                String s = in.readLine();
                list.add(s);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        in.close();
        doubleValues(list);
        for (String s : list) {
            System.out.println((String) s);
        }
    }

    public static void doubleValues(List list) {

        for (int i = 0; i < list.size(); i++) {
            String s = (String) list.get(i);
            String temp = "";
            for (int j = 0; j < s.length(); j++) {
                temp += s.charAt(j);
                temp += s.charAt(j);
            }
            list.set(i, temp);
        }
    }
}
