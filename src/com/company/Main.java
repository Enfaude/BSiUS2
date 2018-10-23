package com.company;

import java.util.*;


public class Main {
    static char[] basicEncode(char[] text, int key)
    {
        char[] tempEncode = text;
        System.out.println("Kody ASCII kodowania:");
        for (int i = 0; i < tempEncode.length; i++)
        {
            tempEncode[i] = (char)(tempEncode[i] + key);
//            System.out.println((int)tempEncode[i]);
            tempEncode[i] = (char)(255 - (int)tempEncode[i]);
//            System.out.println("po inwersji bitów: " + tempEncode[i]);

        }
        System.out.println("Tekst zaszyfrowany: "+ tempEncode);
        return tempEncode;
    }

    static char[] basicDecode(char[] text, int key)
    {
        char[] tempDecode = text;
        System.out.println("Kody ASCII dekodowania:");
        for (int i = 0; i < tempDecode.length; i++)
        {
            tempDecode[i] = (char)(255 - tempDecode[i]);
//            System.out.println("po inwersji wtórnej: " + (int)tempDecode[i]);
            tempDecode[i] = (char)((int)tempDecode[i] - key);
//            System.out.println((int)tempDecode[i]);
        }
        System.out.println("Tekst odszyfrowany: "+ tempDecode);
        return tempDecode;
    }



    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź tekst do zaszyfrowania");
        String tekst = sc.nextLine();
        System.out.println("Wprowadź klucz szyfrowania");

        int klucz = sc.nextInt();


        char[] encoded = basicEncode(tekst.toCharArray(), klucz);
        char[] decoded = basicDecode(encoded, klucz);

        System.out.println(encoded);
        System.out.println(decoded);
    }
}
