import java.util.Arrays;
import java.util.Date;

public class Mahasiswa1 {

    private String nama;
    private String nim;
    private String jurusan;
    private int umur;
    private Date tglLahir;
    private String[] skills;


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("Nama tidak boleh kosong!");
        } else if (!nama.matches("[a-zA-Z\\s]+")) {
            System.out.println("Nama hanya boleh berisi huruf dan spasi!");
        } else {
            this.nama = nama;
        }
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        if (nim == null || nim.trim().isEmpty()) {
            System.out.println("NIM tidak boleh kosong!");
        } else {
            this.nim = nim;
        }
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        if (jurusan == null || jurusan.trim().isEmpty()) {
            System.out.println("Jurusan tidak boleh kosong!");
        } else if (jurusan.length() < 3) {
            System.out.println("Jurusan harus memiliki minimal 3 karakter!");
        } else {
            this.jurusan = jurusan;
        }
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        if (umur > 0) {
            this.umur = umur;
        } else {
            System.out.println("Umur harus lebih dari 0!");
        }
    }

    public Date getTglLahir() {
        return (tglLahir != null) ? new Date(tglLahir.getTime()) : null;
    }

    public void setTglLahir(Date tglLahir) {
        if (tglLahir != null) {
            this.tglLahir = new Date(tglLahir.getTime());
        } else {
            System.out.println("Tanggal lahir tidak boleh null!");
        }
    }

    public String[] getSkills() {
        return (skills != null) ? Arrays.copyOf(skills, skills.length) : null;
    }

    public void setSkills(String[] skills) {
        if (skills != null) {
            this.skills = Arrays.copyOf(skills, skills.length);
        } else {
            System.out.println("Skills tidak boleh null!");
        }
    }

    public void tampilkanInfo() {
        System.out.println("Nama      : " + nama);
        System.out.println("NIM       : " + nim);
        System.out.println("Jurusan   : " + jurusan);
        System.out.println("Umur      : " + umur);
        System.out.println("Tgl Lahir : " + tglLahir);
        System.out.println("Skills    : " + Arrays.toString(skills));
    }
}

class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa1 mhs = new Mahasiswa1();

        mhs.setNama("Ali");
        mhs.setNim("123456789");
        mhs.setJurusan("Informatika");
        mhs.setUmur(21);
        mhs.setTglLahir(new Date());
        mhs.setSkills(new String[]{"Java", "SQL", "React"});

        System.out.println("=== Data Mahasiswa ===");
        mhs.tampilkanInfo();

        System.out.println("\n=== Uji Data Tidak Valid ===");
        mhs.setNama("Ali123");
        mhs.setJurusan("IT");
        mhs.setUmur(-5);

        System.out.println("\n=== Uji Defensive Copy ===");
        String[] eksternalSkills = mhs.getSkills();
        eksternalSkills[0] = "Hacked!";

        System.out.println("Data internal setelah modifikasi eksternal:");
        mhs.tampilkanInfo();
    }
}
