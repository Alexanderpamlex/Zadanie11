package com.lau;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int f = 0;
        File file = new File("C:\\Users\\Alex1\\IdeaProjects\\Pvv\\src\\com\\lau\\mass.txt");
        char[] arr = new char[210];
        String str = "";
        int[] da = new int[42];
        FileReader fileReader = new FileReader(file);
        fileReader.read(arr);

        for (int i = 0; i < 210; i++) {
            if (arr[i] == 0) break;
            if (arr[i] == '\r') continue;
            if (arr[i] == '\n') {
                while (f < 42) {
                    da[f] = Integer.parseInt(str);
                    //System.out.println(da[f]);
                    str = "";
                    f++;
                    break;
                }
                continue;
            }
            str += arr[i];
        }

        for (int i = 0; i < 42;i++) {
            for(int u = 0; u < 41; u++) {
                if (da[u] > da[i]) {
                    int a = da[i];
                    da[i] = da[u];
                    da[u] = a;
                }
            }
        }
        for(int u = 0; u < 42; u++) {
            System.out.println(da[u]);
            }
        fileReader.close();
    }
}

