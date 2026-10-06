import java.util.Scanner;

public class StudiKasus205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenisKegiatan;
        int jumlahDokumen;
        int peringkatJuara;
        int statusPendanaan;

        System.out.print("Nama Mahasiswa: ");
        nama = sc.nextLine();

        System.out.print("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKegiatan = sc.nextLine().toUpperCase();

        if (jenisKegiatan.equalsIgnoreCase("belmawa")
                || jenisKegiatan.equalsIgnoreCase("bakorma")
                || jenisKegiatan.equalsIgnoreCase("mandiri")) {

            System.out.print("Jumlah Dokumen: ");
            jumlahDokumen = sc.nextInt();

            System.out.print("Peringkat Juara (1, 2, 3, atau 0): ");
            peringkatJuara = sc.nextInt();

            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                if (jumlahDokumen >= 4) {
                    System.out.println("Status: Dana penghargaan diberikan");
                } else {
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan");
                }

            } else {
                System.out.println("Status: Bukan juara 1, 2, atau 3. "
                        + "Dana penghargaan tidak diberikan");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("pkm")) {
            System.out.print("Status Pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            statusPendanaan = sc.nextInt();

            if (statusPendanaan == 1) {

                System.out.print("Jumlah Dokumen: ");
                jumlahDokumen = sc.nextInt();

                if (jumlahDokumen >= 4) {
                    System.out.println("Status: Dana penghargaan diberikan");
                } else {
                    System.out.println("Status: Dokumen tidak lengkap (kurang "
                            + (4 - jumlahDokumen)
                            + " dokumen). Dana penghargaan tidak diberikan");
                }

            } else {
                System.out.println("Status: Tidak lolos pendanaan PKM. "
                        + "Dana penghargaan tidak diberikan");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("lainnya")){
            System.out.println("Status: Kegiatan lainnya. " + "Dana penghargaan tidak diberikan");
        } else {
            System.out.println("Status: Jenis kegiatan tidak valid");
        }

        sc.close();
    }
}
