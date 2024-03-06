import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Data Mahasiswa:");
        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("NIM: ");
        String nim = scanner.nextLine();

        System.out.print("Jurusan: ");
        String jurusan = scanner.nextLine();

        System.out.print("Fakultas: ");
        String fakultas = scanner.nextLine();

        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan, fakultas);

        System.out.println("\nData Mahasiswa:");
        mahasiswa.tampilData();

        Mahasiswa.tampilUniversitas();
    }
}

class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private String fakultas;

    public Mahasiswa(String nama, String nim, String jurusan, String fakultas) {
        this.nama = nama;
        if (nim.length() == 15) {
            this.nim = nim;
        } else {
            System.out.println("Panjang NIM harus 15 karakter!");
            System.exit(0);
        }
        this.jurusan = jurusan;
        this.fakultas = fakultas;
    }

    public void tampilData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Fakultas: " + fakultas);
    }

    public static void tampilUniversitas() {
        System.out.println("\nUniversitas XYZ");
        System.out.println("Jl. Contoh No. 123");
        System.out.println("Telp. (012) 345-6789");
    }
}
