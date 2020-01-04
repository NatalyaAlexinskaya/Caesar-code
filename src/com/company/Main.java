package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Alphabet alphabet = new Alphabet();

        for (int i = 1; i < 33; i++) {
            System.out.println(alphabet.decryption(string, i));
        }
    }
}
