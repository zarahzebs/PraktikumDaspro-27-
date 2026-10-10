import java.util.Scanner;

public class StudiKasus2_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenisKegiatan;
        int jumlahDokumen, peringkat, statusPKM, kurang;
        boolean syaratLomba = false;

        System.out.print("Nama mahasiswa : ");
        nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = sc.nextLine();

        System.out.print("Jumlah dokumen : ");
        jumlahDokumen = sc.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
            jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Peringkat juara : ");
            peringkat = sc.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                syaratLomba = true;
            }

            if (syaratLomba) {
                if (jumlahDokumen == 4) {
                    System.out.println(
                        "Status: Berhak memperoleh dana penghargaan."
                    );
                } else {
                    kurang = 4 - jumlahDokumen;
                    System.out.println(
                        "Status: Dokumen tidak lengkap (kurang "
                        + kurang
                        + " dokumen). Dana penghargaan tidak diberikan."
                    );
                }
            } else {
                System.out.println(
                    "Status: Tidak memperoleh dana penghargaan "
                    + "(hanya untuk juara 1/2/3)."
                );
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak): ");
            statusPKM = sc.nextInt();

            if (statusPKM == 1) {
                if (jumlahDokumen == 4) {
                    System.out.println(
                        "Status: Berhak memperoleh dana penghargaan."
                    );
                } else {
                    kurang = 4 - jumlahDokumen;
                    System.out.println(
                        "Status: Dokumen tidak lengkap (kurang "
                        + kurang
                        + " dokumen). Dana penghargaan tidak diberikan."
                    );
                }
            } else {
                System.out.println(
                    "Status: Tidak memperoleh dana penghargaan "
                    + "(PKM tidak lolos pendanaan)."
                );
            }

        } else {
            System.out.println("Jenis kegiatan tidak memenuhi syarat.");
        }

        sc.close();
    }
}