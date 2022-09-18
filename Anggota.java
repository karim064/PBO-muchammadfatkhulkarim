package KoperasiGetterSetter;

public class Anggota {
    private String nama;
    private String ktp;
    private int limitPinjaman;
    private int jumlahPinjaman;

    Anggota ( String ktp, String nama, int limitPinjaman){
        this.ktp = ktp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }
    public String getNama(){
        return nama;
    }
    public int getLimitPinjaman(){
        return limitPinjaman;
    }
    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }
    public void angsur(int uang){
        float minAngsur =  jumlahPinjaman*10/100;
        if (uang >= minAngsur){
            jumlahPinjaman -= uang;
        } else {
            System.out.println("Maaf, angsuran harus 10% atau lebih dari jumlah pinjaman");
        }
    }
    public void pinjam(int uang){
        if (uang > limitPinjaman){
            System.out.println("Maaf, Jumlah Pinjaman melebihi limit");
        } else {
            jumlahPinjaman = uang;
        }
    }
}
