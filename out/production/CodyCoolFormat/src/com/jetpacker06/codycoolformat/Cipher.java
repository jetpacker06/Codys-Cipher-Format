package com.jetpacker06.codycoolformat;

import com.jetpacker06.codycoolformat.convenience.Conv;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cipher {
    public static void cipher() {
        try {

            Scanner mainScanner = new Scanner(System.in);
            Conv.p("Enter the name of your desired file, including extension.");
            String inputFileName = mainScanner.nextLine();
            File myFile = new File(inputFileName);
            Scanner fileScanner = new Scanner(myFile);
            FileWriter myWriter = new FileWriter(inputFileName + ".ccf");
            String originalText = "";
            while (fileScanner.hasNextLine()) {
                originalText = originalText + fileScanner.nextLine() + "ඞ";
            }
            String[] splitText = originalText.split("");
            String translatedText = "";
            for (int i = 0; i < splitText.length; i++) {
                switch (splitText[i]) {
                    case "a": translatedText = translatedText + "x";break;
                    case "b": translatedText = translatedText + "0";break;
                    case "c": translatedText = translatedText + "b";break;
                    case "d": translatedText = translatedText + "w";break;
                    case "e": translatedText = translatedText + "y";break;
                    case "f": translatedText = translatedText + "v";break;
                    case "g": translatedText = translatedText + "g";break;
                    case "h": translatedText = translatedText + "q";break;
                    case "i": translatedText = translatedText + "h";break;
                    case "j": translatedText = translatedText + "t";break;
                    case "k": translatedText = translatedText + "z";break;
                    case "l": translatedText = translatedText + "5";break;
                    case "m": translatedText = translatedText + "1";break;
                    case "n": translatedText = translatedText + "s";break;
                    case "o": translatedText = translatedText + "4";break;
                    case "p": translatedText = translatedText + "7";break;
                    case "q": translatedText = translatedText + "j";break;
                    case "r": translatedText = translatedText + "n";break;
                    case "s": translatedText = translatedText + "p";break;
                    case "t": translatedText = translatedText + "3";break;
                    case "u": translatedText = translatedText + "k";break;
                    case "v": translatedText = translatedText + "9";break;
                    case "w": translatedText = translatedText + "f";break;
                    case "x": translatedText = translatedText + "i";break;
                    case "y": translatedText = translatedText + "d";break;
                    case "z": translatedText = translatedText + "c";break;
                    case "0": translatedText = translatedText + "2";break;
                    case "1": translatedText = translatedText + "u";break;
                    case "2": translatedText = translatedText + "o";break;
                    case "3": translatedText = translatedText + "e";break;
                    case "4": translatedText = translatedText + "6";break;
                    case "5": translatedText = translatedText + "8";break;
                    case "6": translatedText = translatedText + "l";break;
                    case "7": translatedText = translatedText + "m";break;
                    case "8": translatedText = translatedText + "a";break;
                    case "9": translatedText = translatedText + "r";break;
                    case "ඞ": translatedText = translatedText + "ඞ";break;
                    case " ": translatedText = translatedText + "-";break;
                    case "-": translatedText = translatedText + "+";break;
                    case "+": translatedText = translatedText + "=";break;
                    case "=": translatedText = translatedText + " ";break;
                    default: translatedText = translatedText + splitText[i];
                }
            }

            myWriter.write(translatedText);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
