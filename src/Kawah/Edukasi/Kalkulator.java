package Kawah.Edukasi;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;


public class Kalkulator {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("\n===== Pilih program =====");
            System.out.println("\n1.Tambah\n2.Pengurangan\n3.Perkalian\n4.Pembagian\n5.Sisa bagi");

            System.out.println("Masukan pilihan : ");
            int input = Integer.parseInt(scan.nextLine());
            if (input == 1){
                tambah();
            } else if (input == 2){
                kurang();
            } else if (input == 3){
                perkalian();
            } else if (input == 4){
                pembagian();
            } else if (input == 5){
                sisaBagi();
            } else {
                break;
            }
        }
    }

    private static void tambah() throws IOException {

        Scanner scan = new Scanner(System.in);
        FileWriter myWriter = new FileWriter("result.txt");
        double hasil;
        System.out.println("Masukkan angka pertama = ");
        int angka1 = scan.nextInt();
        System.out.println("Masukkan angka kedua = ");
        int angka2 = scan.nextInt();
        hasil = angka1 + angka2;
        myWriter.write(String.valueOf(hasil));
        myWriter.close();
        System.out.println("Hasil = " + hasil);

    }

    private static void kurang() throws IOException {

        Scanner scan = new Scanner(System.in);
        FileWriter myWriter = new FileWriter("result.txt");

        double hasil;
        System.out.println("Masukkan angka pertama = ");
        int angka1 = scan.nextInt();
        System.out.println("Masukkan angka kedua = ");
        int angka2 = scan.nextInt();
        hasil = angka1 - angka2;
        myWriter.write(String.valueOf(hasil));
        myWriter.close();
        System.out.println("Hasil = " + hasil);

    }

    private static void perkalian() throws IOException {

        Scanner scan = new Scanner(System.in);
        FileWriter myWriter = new FileWriter("result.txt");


        double hasil;
        System.out.println("Masukkan angka pertama = ");
        int angka1 = scan.nextInt();
        System.out.println("Masukkan angka kedua = ");
        int angka2 = scan.nextInt();
        hasil = angka1 * angka2;
        myWriter.write(String.valueOf(hasil));
        myWriter.close();
        System.out.println("Hasil = " + hasil);

    }

    private static void pembagian() throws IOException {

        Scanner scan = new Scanner(System.in);
        FileWriter myWriter = new FileWriter("result.txt");


        double hasil;
        System.out.println("Masukkan angka pertama = ");
        int angka1 = scan.nextInt();
        System.out.println("Masukkan angka kedua = ");
        int angka2 = scan.nextInt();
        if (angka1 == 0 || angka2 == 0) {
            System.out.println(0);
        } else {
            hasil = angka1 / angka2;
            myWriter.write(String.valueOf(hasil));
            myWriter.close();
            System.out.println("Hasil = " + hasil);

        }
    }

    private static void sisaBagi() throws IOException {

        Scanner scan = new Scanner(System.in);
        FileWriter myWriter = new FileWriter("result.txt");

        System.out.println("Masukkan angka pertama = ");
        int angka1 = scan.nextInt();
        System.out.println("Masukkan angka kedua = ");
        int angka2 = scan.nextInt();
        int hasil;
        hasil = angka1 % angka2;
        myWriter.write(String.valueOf(hasil));
        myWriter.close();
        System.out.println("Hasil = " + hasil);

    }

}
