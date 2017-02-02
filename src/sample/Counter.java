package sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by aidas on 31/01/2017.
 */
public class Counter extends Thread {
    public int count(File file) {
        int count = 0;
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            count = 0;
            while (line != null) {
                String[] parts = line.split(" ");
                for (String w : parts) {
                    count++;
                }
                line = br.readLine();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return count;
    }
}
