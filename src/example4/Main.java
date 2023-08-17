package example4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put("Москва","Іванови");
        map.put("Київ","Петрови");
        map.put("Лондон","Абрамовичі");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter city: ");
        String city = in.readLine();
        in.close();
        System.out.println("Nanme: " + map.get(city));
    }
}
