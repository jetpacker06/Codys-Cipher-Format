package com.jetpacker06.codyscipherformat.convenience;

public class Conv {
    public static void p(String input){System.out.println(input);}
    public static void p(float input){System.out.println(input);}
    public static void p(int input){System.out.println(input);}
    public static boolean isThingInList(String thing, String[] list) {
        boolean b = false;
        for(int i = 0; i < list.length; i++) {
            if (list[i].toLowerCase().startsWith(thing.toLowerCase())) {b = true;break;}
        }
        return b;
    }
}