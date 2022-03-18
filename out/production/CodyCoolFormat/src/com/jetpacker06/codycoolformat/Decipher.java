package com.jetpacker06.codycoolformat;

import com.jetpacker06.codycoolformat.convenience.Conv;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Decipher {
    public static void decipher() {
        try {
            Scanner mainScanner = new Scanner(System.in);
            Conv.p("Enter the name of the file you wish to decipher, including extension and .ccf");
            String fileNameToDecipher = mainScanner.nextLine();
            File myFile = new File(fileNameToDecipher);
            Scanner fileReader = new Scanner(myFile);
            String decipheredText = "";
            String[] splitCipheredText = fileReader.nextLine().split("");
            for (int i = 0;i < splitCipheredText.length;i++) {
                switch (splitCipheredText[i]) {
                    case "x":
                        decipheredText = decipheredText + "a";
                        break;
                    case "0":
                        decipheredText = decipheredText + "b";
                        break;
                    case "b":
                        decipheredText = decipheredText + "c";
                        break;
                    case "w":
                        decipheredText = decipheredText + "d";
                        break;
                    case "y":
                        decipheredText = decipheredText + "e";
                        break;
                    case "v":
                        decipheredText = decipheredText + "f";
                        break;
                    case "g":
                        decipheredText = decipheredText + "g";
                        break;
                    case "q":
                        decipheredText = decipheredText + "h";
                        break;
                    case "h":
                        decipheredText = decipheredText + "i";
                        break;
                    case "t":
                        decipheredText = decipheredText + "j";
                        break;
                    case "z":
                        decipheredText = decipheredText + "k";
                        break;
                    case "5":
                        decipheredText = decipheredText + "l";
                        break;
                    case "1":
                        decipheredText = decipheredText + "m";
                        break;
                    case "s":
                        decipheredText = decipheredText + "n";
                        break;
                    case "4":
                        decipheredText = decipheredText + "o";
                        break;
                    case "7":
                        decipheredText = decipheredText + "p";
                        break;
                    case "j":
                        decipheredText = decipheredText + "q";
                        break;
                    case "n":
                        decipheredText = decipheredText + "r";
                        break;
                    case "p":
                        decipheredText = decipheredText + "s";
                        break;
                    case "3":
                        decipheredText = decipheredText + "t";
                        break;
                    case "k":
                        decipheredText = decipheredText + "u";
                        break;
                    case "9":
                        decipheredText = decipheredText + "v";
                        break;
                    case "f":
                        decipheredText = decipheredText + "w";
                        break;
                    case "i":
                        decipheredText = decipheredText + "x";
                        break;
                    case "d":
                        decipheredText = decipheredText + "y";
                        break;
                    case "c":
                        decipheredText = decipheredText + "z";
                        break;
                    case "2":
                        decipheredText = decipheredText + "0";
                        break;
                    case "u":
                        decipheredText = decipheredText + "1";
                        break;
                    case "o":
                        decipheredText = decipheredText + "2";
                        break;
                    case "e":
                        decipheredText = decipheredText + "3";
                        break;
                    case "6":
                        decipheredText = decipheredText + "4";
                        break;
                    case "8":
                        decipheredText = decipheredText + "5";
                        break;
                    case "l":
                        decipheredText = decipheredText + "6";
                        break;
                    case "m":
                        decipheredText = decipheredText + "7";
                        break;
                    case "a":
                        decipheredText = decipheredText + "8";
                        break;
                    case "r":
                        decipheredText = decipheredText + "9";
                        break;
                    case "ඞ":
                        decipheredText = decipheredText + "\n";
                        break;
                    case "-":
                        decipheredText = decipheredText + " ";
                        break;
                    case "=":
                        decipheredText = decipheredText + "+";
                        break;
                    case "+":
                        decipheredText = decipheredText + "-";
                        break;
                    case " ":
                        decipheredText = decipheredText + "=";
                        break;
                }
            }
            //determine output file name
            String[] fileNameNoCCF = fileNameToDecipher.split(".ccf");
            Conv.p(fileNameNoCCF[0]);
            Conv.p(decipheredText);

            FileWriter myWriter = new FileWriter(fileNameNoCCF[0]);
            myWriter.write(decipheredText);
            myWriter.close();
        } catch(IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            System.out.println();
        }
    }
}
