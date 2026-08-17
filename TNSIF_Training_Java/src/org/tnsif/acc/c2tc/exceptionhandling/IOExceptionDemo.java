package org.tnsif.acc.c2tc.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionDemo {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
            new FileReader("C:\\Users\\misba\\OneDrive\\Documents\\count.txt")
        );

        String data = "";

        while ((data = br.readLine()) != null) {
            System.out.println(data);
        }

        br.close();
    }
}