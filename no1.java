public class no1 {
    public static void main(String[] args) {
        int kecRafaela = 10;
        int kecNana = 13;
        int selisihWaktu = 3600;

//        Selisih waktu 1 jam/3600 detik(dijadikan detik karena ket meter/detik)
//        cari jarak
//        jarak = kec * waktu

        int jarak;
        jarak = kecRafaela * selisihWaktu;
        System.out.println("Selisih jarak "+jarak + " m");

        int waktuSusul;
        waktuSusul = jarak/(kecNana-kecRafaela);
        System.out.println("Waktu susul " + waktuSusul + " detik");

        double hours = waktuSusul /3600;
        double minutes = (waktuSusul%3600)/60;

        System.out.println("Waktu susul dalam jam ");
        System.out.println("");
        System.out.println((int)hours + " jam " + (int)minutes + " menit");
        System.out.println("Nana dan Rafaela bertemu pukul 18.20 ");
    }
}
