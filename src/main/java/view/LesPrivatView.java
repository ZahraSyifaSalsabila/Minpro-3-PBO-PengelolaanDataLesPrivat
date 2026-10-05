package view;

import java.util.Scanner;

public class LesPrivatView {
    private final Scanner scanner;

    public LesPrivatView(final Scanner scanner) {
        this.scanner = scanner;
    }

    public void tampilkanMenuUtama() {
        System.out.println("\n=== SISTEM PENGELOLAAN DATA LES PRIVAT ===");
        System.out.println("1. Tambah Data");
        System.out.println("2. Tampilkan Data");
        System.out.println("3. Update Data");
        System.out.println("4. Hapus Data");
        System.out.println("5. Keluar");
    }

    public void tampilkanSubMenu(final String judul) {
        System.out.println("\n=== " + judul + " ===");
        System.out.println("1. Siswa");
        System.out.println("2. Tutor");
        System.out.println("3. Jadwal");
    }

    public String inputTeksWajib(final String label) {
        while (true) {
            System.out.print(label);
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Input tidak boleh kosong!");
        }
    }

    public String inputTeksOpsional(final String label, final String nilaiLama) {
        System.out.print(label + " [" + nilaiLama + "] (Tekan Enter jika tidak ingin mengubah): ");
        String input = scanner.nextLine().trim();
        if (input.isEmpty()) {
            return nilaiLama;
        }
        return input;
    }

    public int inputAngkaWajib(final String label) {
        while (true) {
            System.out.print(label);
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("[Peringatan] Input tidak boleh kosong!");
                continue;
            }
            try {
                int angka = Integer.parseInt(input);
                if (angka <= 0) {
                    System.out.println("[Peringatan] Angka harus lebih besar dari 0!");
                    continue;
                }
                return angka;
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
            }
        }
    }

    public int inputAngkaWajib(final String label, final int min, final int max) {
        while (true) {
            System.out.print(label);
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Input tidak boleh kosong!");
                continue;
            }
            try {
                int angka = Integer.parseInt(input);
                if (angka < min || angka > max) {
                    System.out.println("Pilihan harus antara " + min + " - " + max + "!");
                    continue;
                }
                return angka;
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
            }
        }
    }

    public int inputAngkaOpsional(final String label, final int nilaiLama) {
        while (true) {
            System.out.print(label + " [" + nilaiLama + "] (Tekan Enter jika tidak ingin mengubah): ");
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                return nilaiLama;
            }
            try {
                int angka = Integer.parseInt(input);
                if (angka <= 0) {
                    System.out.println("Angka harus lebih besar dari 0!");
                    continue;
                }
                return angka;
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
            }
        }
    }

    public void tampilkanPesan(final String pesan) {
        System.out.println(pesan);
    }
}