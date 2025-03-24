import java.util.ArrayList;

class BukuBaru {  // bagian ini berisi atribut Buku
    String judul;
    String penulis;
    String kategori;
    int tahun;
    String sinopsis;

    public BukuBaru(String judul, String penulis, String kategori, int tahun, String sinopsis) { // bagian ini berisi constructor untuk menginisialisasi object Buku
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
        this.tahun = tahun;
        this.sinopsis = sinopsis;
    }
    void tampilkanInfo() { // ini merupakan method yang digunakan untuk menampilkan informasi buku
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Kategori: " + kategori);
        System.out.println("Tahun: " + tahun);
        System.out.println("Sinopsis: " + sinopsis);
        System.out.println("Jumlah Kata Sinopsis: " + hitungJumlahKata());
        System.out.println("-------------------------");
    }
    int hitungJumlahKata() { // ini merupakan method untuk menghitung jumlah kata dalam sinopsis
        if (sinopsis == null || sinopsis.isEmpty()) {
            return 0;  // kalau sinopsis kosong, maka akan mengembalikan 0
        }
        String[] kata = sinopsis.split(" "); // regex yang dipakai untuk memisahkan sinopsis menjadi array kata
        return kata.length; // return jumlah kata
    }
    double cekKesamaan(BukuBaru bukuLain) { // ini merupakan method untuk menghitung kesamaan antar dua buku
        int kesamaan = 0;
          // pakai equals untuk membandingkan bukunya
        if (this.judul.equals(bukuLain.judul)) kesamaan++;
        if (this.penulis.equals(bukuLain.penulis)) kesamaan++;
        if (this.kategori.equals(bukuLain.kategori)) kesamaan++;
        if (this.tahun == bukuLain.tahun) kesamaan++;
        if (this.sinopsis.equals(bukuLain.sinopsis)) kesamaan++;
        
        return (kesamaan / 5.0) * 100; // return persentase kesamaan
    }
    BukuBaru salin() { // ini merupakan method untuk membuat salinan buku
        return new BukuBaru(this.judul, this.penulis, this.kategori, this.tahun, this.sinopsis);
    }
    double hitungRoyalti(double hargaBuku, double persenRoyalti) {  // method baru dengan dua parameter
        return (persenRoyalti / 100) * hargaBuku; // menghitung sesuai persen yang diberikan
    }
}
public class Perpustakaan3 {
    public static void main(String[] args) {
        ArrayList<BukuBaru> daftarBuku = new ArrayList<>(); // simpan daftar buku menggunakan Arraylist

        daftarBuku.add(new BukuBaru("Tech 1", "Saya sendiri", "Teknologi", 2021, "Buku ini membahas tentang perkembangan teknologi terbaru di dunia."));
        daftarBuku.add(new BukuBaru("Tech 2", "Teman sekelas 1", "Teknologi", 2020, "Panduan lengkap untuk memahami dasar-dasar pemrograman."));
        daftarBuku.add(new BukuBaru("Tech 3", "Teman sekelas 2", "Teknologi", 2019, "Membahas tentang keamanan siber dan cara melindungi data pribadi."));
        daftarBuku.add(new BukuBaru("Tech 4", "Teman sekelas 3", "Teknologi", 2022, "Inovasi terbaru dalam bidang kecerdasan buatan dan machine learning."));
        daftarBuku.add(new BukuBaru("Tech 5", "Teman sekelas 4", "Teknologi", 2018, "Pengenalan tentang Internet of Things (IoT) dan aplikasinya."));
        daftarBuku.add(new BukuBaru("Phil 1", "Prof. 1", "Filsafat", 2018, "Membahas tentang filsafat barat dan perkembangannya dari zaman kuno hingga modern."));
        daftarBuku.add(new BukuBaru("Phil 2", "Prof. 2", "Filsafat", 2017, "Pengantar filsafat timur dan pemikiran para filsuf terkenal."));
        daftarBuku.add(new BukuBaru("Phil 3", "Prof. 3", "Filsafat", 2020, "Diskusi tentang etika dan moral dalam kehidupan sehari-hari."));
        daftarBuku.add(new BukuBaru("Phil 4", "Prof. 4", "Filsafat", 2019, "Pemikiran kontemporer tentang eksistensialisme dan humanisme."));
        daftarBuku.add(new BukuBaru("Phil 5", "Prof. 5", "Filsafat", 2021, "Filsafat politik dan hubungannya dengan kekuasaan dan masyarakat."));
        daftarBuku.add(new BukuBaru("History 1", "Si 1", "Sejarah", 2019, "Sejarah dunia dari zaman kuno hingga modern."));
        daftarBuku.add(new BukuBaru("History 2", "Si 2", "Sejarah", 2016, "Sejarah peradaban manusia dan perkembangannya."));
        daftarBuku.add(new BukuBaru("History 3", "Si 3", "Sejarah", 2020, "Sejarah perang dunia dan dampaknya terhadap dunia modern."));
        daftarBuku.add(new BukuBaru("History 4", "Si 4", "Sejarah", 2018, "Sejarah ekonomi global dan perkembangannya."));
        daftarBuku.add(new BukuBaru("History 5", "Si 5", "Sejarah", 2021, "Sejarah teknologi dan pengaruhnya terhadap masyarakat."));
        daftarBuku.add(new BukuBaru("Religi 1", "Ustad 1", "Agama", 2021, "Panduan lengkap tentang ajaran agama dan praktiknya."));
        daftarBuku.add(new BukuBaru("Religi 2", "Ustad 2", "Agama", 2018, "Kajian mendalam tentang kitab suci dan tafsirnya."));
        daftarBuku.add(new BukuBaru("Religi 3", "Ustad 3", "Agama", 2019, "Pemahaman tentang spiritualitas dan kehidupan beragama."));
        daftarBuku.add(new BukuBaru("Religi 4", "Ustad 4", "Agama", 2020, "Peran agama dalam membentuk masyarakat modern."));
        daftarBuku.add(new BukuBaru("Religi 5", "Ustad 5", "Agama", 2017, "Ajaran moral dan etika dalam agama."));
        daftarBuku.add(new BukuBaru("Psych 1", "Dr. 1", "Psikologi", 2020, "Pengantar psikologi dan teori-teori dasar."));
        daftarBuku.add(new BukuBaru("Psych 2", "Dr. 2", "Psikologi", 2018, "Psikologi perkembangan dan tahap-tahapnya."));
        daftarBuku.add(new BukuBaru("Psych 3", "Dr. 3", "Psikologi", 2016, "Psikologi sosial dan dinamika kelompok."));
        daftarBuku.add(new BukuBaru("Psych 4", "Dr. 4", "Psikologi", 2021, "Psikologi klinis dan penanganan gangguan mental."));
        daftarBuku.add(new BukuBaru("Psych 5", "Dr. 5", "Psikologi", 2006, "Psikologi pendidikan dan aplikasinya dalam pembelajaran."));
        daftarBuku.add(new BukuBaru("Politic 1", "Pak 1", "Politik", 2022, "Pengantar ilmu politik dan sistem pemerintahan."));
        daftarBuku.add(new BukuBaru("Politic 2", "Bu 2", "Politik", 2019, "Politik internasional dan hubungan antarnegara."));
        daftarBuku.add(new BukuBaru("Politic 3", "Pak 3", "Politik", 2015, "Sejarah politik dan perkembangannya."));
        daftarBuku.add(new BukuBaru("Politic 4", "Bu 4", "Politik", 2020, "Kebijakan publik dan dampaknya terhadap masyarakat."));
        daftarBuku.add(new BukuBaru("Politic 5", "Pak 5", "Politik", 2018, "Demokrasi dan tantangannya di era modern."));
        daftarBuku.add(new BukuBaru("Fict 1", "Kak 1", "Fiksi", 2023, "Cerita fiksi tentang petualangan di dunia fantasi."));
        daftarBuku.add(new BukuBaru("Fict 2", "Kak 2", "Fiksi", 2015, "Kisah cinta dan drama dalam kehidupan nyata."));
        daftarBuku.add(new BukuBaru("Fict 3", "Kak 3", "Fiksi", 2017, "Cerita misteri dan teka-teki yang menegangkan."));
        daftarBuku.add(new BukuBaru("Fict 4", "Kak 4", "Fiksi", 2019, "Fiksi ilmiah tentang masa depan manusia."));
        daftarBuku.add(new BukuBaru("Fict 5", "Kak 5", "Fiksi", 2021, "Kumpulan cerita pendek dengan berbagai tema."));

        System.out.println("Daftar Buku:"); // menampilkan daftar buku
        for (BukuBaru buku : daftarBuku) {
            buku.tampilkanInfo();  // memanggil method tampilkanInfo untuk setiap buku
        }
        BukuBaru buku1 = daftarBuku.get(0);
        double hargaBuku = 230000;
        double persenRoyalti = 15.0;
        double royalti = buku1.hitungRoyalti(hargaBuku, persenRoyalti);
        System.out.println("\nRoyalti untuk buku '" + buku1.judul + "' dengan harga Rp" + hargaBuku + " dan persentase royalti " + persenRoyalti + "% adalah: Rp" + royalti);
    }
}

