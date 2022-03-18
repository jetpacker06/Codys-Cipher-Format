package com.jetpacker06;

import com.jetpacker06.codyscipherformat.Cipher;
import com.jetpacker06.codyscipherformat.Decipher;
import com.jetpacker06.codyscipherformat.convenience.Conv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean shouldContinue = true;
        Scanner scanner = new Scanner(System.in);
        Conv.p("1. Decipher a CCF\n2.Cipher any file into a CCF\n3. Quit");
        do {
            switch (scanner.nextLine()) {
                case "1":
                    Decipher.decipher();
                    break;
                case "2":
                    Cipher.cipher();
                    break;
                case "3":
                    shouldContinue = false;
            }
            Conv.p("\n\n\n\n\n1. Decipher a CCF\n2. Cipher any file into a CCF\n3. Quit");
        } while (shouldContinue);
    }
}