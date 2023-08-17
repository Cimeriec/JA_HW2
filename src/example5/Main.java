package example5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while (true) {
            System.out.print("Enter line: ");
            s = in.readLine();
            if (s.equals("end")) {
                break;
            } else {
                list.add(s);
            }
        }
        for (String temp: list) {
            System.out.println(temp);
        }
    }
}
