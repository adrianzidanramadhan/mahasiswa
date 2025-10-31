public class Mahasiswa1 {

    private String nama;
    private String nim;
    private String jurusan;
    private int umur;

    public String getNama() {
        return this.nama;
    }

    public String getNim() {
        return this.nim;
    }

    public String getJurusan() {
        return this.jurusan;
    }

    public int getUmur() {
        return this.umur;
    }

    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("Error: Nama tidak boleh kosong!");
        } else {
            this.nama = nama;
        }
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setJurusan(String jurusan) {
        if (jurusan == null || jurusan.trim().isEmpty()) {
            System.out.println("Error: Jurusan tidak boleh kosong!");
        } else {
            this.jurusan = jurusan;
        }
    }

    public void setUmur(int umur) {
        if (umur <= 0) {
            System.out.println("Error: Umur harus lebih dari 0!");
        } else {
            this.umur = umur;
        }
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + (this.nama != null ? this.nama : "-"));
        System.out.println("NIM: " + (this.nim != null ? this.nim : "-"));
        System.out.println("Jurusan: " + (this.jurusan != null ? this.jurusan : "-"));
        System.out.println("Umur: " + (this.umur > 0 ? this.umur : "-"));
    }
}

class mainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa1 mhs1 = new Mahasiswa1();

        mhs1.setNama("Ali");
        mhs1.setNim("123456789");
        mhs1.setJurusan("Informatika");
        mhs1.setUmur(20);
        mhs1.tampilkanInfo();

        System.out.println("\n--- Contoh validasi gagal ---");
        mhs1.setNama("");
        mhs1.setJurusan(" ");
        mhs1.setUmur(0);
        mhs1.tampilkanInfo();
    }
}
