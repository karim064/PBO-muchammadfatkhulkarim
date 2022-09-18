package KoperasiGetterSetter;

import java.util.*;

public class TestKoperasi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        do{
            System.out.print("Masukkan Jumlah Yang Mau diPinjam : ");
            int jumlahPinjaman=sc.nextInt();
            donny.pinjam(jumlahPinjaman);
            System.out.println("Meminjam Uang Sebesar : " + jumlahPinjaman);
            System.out.println("Jumlah pinjaman saat ini Sebesar : " + donny.getJumlahPinjaman());
        } while (donny.getJumlahPinjaman()==0);

        do{
            System.out.print("Masukkan Jumlah Angsuran Yang Mau diBayar : ");
            int angsur = sc.nextInt();
            System.out.println("Membayar Angsuran Sebesar : " + angsur);
            donny.angsur(angsur);
            System.out.println("Jumlah pinjaman saat ini Sebesar : " + donny.getJumlahPinjaman());
            if(donny.getJumlahPinjaman() != 0){
                System.out.println("Pinjaman belum lunas");
            } else {
                System.out.println("Pinjaman lunas");
            }
        } while(donny.getJumlahPinjaman() == 1);
    }
}