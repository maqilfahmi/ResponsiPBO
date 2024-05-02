package week4;

import java.util.Scanner;

public class student extends person {
    private String nim;

    public student() {
        super(); // untuk memamnggil superclass
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        nim = input.nextLine();
    }

    public void calculatePayment() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan biaya SPP: ");
        double spp = input.nextDouble();
        System.out.print("Masukkan biaya SKS: ");
        double sks = input.nextDouble();
        System.out.print("Masukkan biaya Modul: ");
        double modul = input.nextDouble();

        double totalPayment = spp + sks + modul / 3;// jumlah pembayaran
        System.out.println("Tagihan pembayaran: " + totalPayment);
    }

}
