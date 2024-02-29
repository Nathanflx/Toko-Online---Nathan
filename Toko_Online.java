package toko_online;
import java.util.Scanner;

public class Toko_Online {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
       
        Laporan report = new Laporan();
        Karyawan employee = new Karyawan();
        Barang item = new Barang();
        Transaksi transaction = new Transaksi();
        Member member = new Member();
       
        report.laporan(item);
        report.laporan(member);
        report.laporan(transaction, item);
    }
    
}
