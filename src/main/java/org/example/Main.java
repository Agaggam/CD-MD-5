package org.example;

import java.util.ArrayList;
import java.util.Scanner;

class InputMahasiswa {
    public static void main(String[] args) {
        ArrayList<String> namaMahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        while (true) {
            System.out.print("Input nama mahasiswa ke-" + i + ": ");
            String nama = scanner.nextLine();

            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }

            try {
                if (nama.isEmpty()) {
                    throw new IllegalArgumentException("Nama tidak boleh kosong");
                }
                namaMahasiswa.add(nama);
                i++;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Nama-nama mahasiswa yang telah diinput:");
        for (String nama : namaMahasiswa) {
            System.out.println(nama);
        }
    }
}