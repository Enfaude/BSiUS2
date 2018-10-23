package com.company;

import java.util.*;


public class Main {
    private static char[] basicEncode(char[] text, int key)
    {
        for (int i = 0; i < text.length; i++)
        {
            text[i] = (char)(text[i] + key);
            text[i] = (char)(255 - (int)text[i]);
        }
        System.out.println("Tekst zaszyfrowany: ");
        for (char letter : text) {
            System.out.print(letter);
        }
        System.out.println(" ");
        return text;
    }

    private static char[] basicDecode(char[] text, int key)
    {
        for (int i = 0; i < text.length; i++)
        {
            text[i] = (char)(255 - text[i]);
            text[i] = (char)((int)text[i] - key);
        }
        System.out.println("Tekst zdeszyfrowany: ");
        for (char letter : text) {
            System.out.print(letter);
        }
        System.out.println(" ");
        return text;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź tekst do zaszyfrowania");
        char[] tekst = sc.nextLine().toCharArray();
        System.out.println("Wprowadź klucz szyfrowania");
        int klucz = sc.nextInt();

        char[] encoded = basicEncode(tekst, klucz);
        char[] decoded = basicDecode(encoded, klucz);
    }
}
