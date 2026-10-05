package model;

public class Siswa extends Pengguna {
    private String jenjang;
    private String mataPelajaran;

    public Siswa(final int id, final String nama, final String jenjang, final String mataPelajaran) {
        super(id, nama);
        setJenjang(jenjang);
        setMataPelajaran(mataPelajaran);
    }

    public String getJenjang() {
        return jenjang;
    }

    public final void setJenjang(final String jenjang) {
        if (jenjang == null || jenjang.trim().isEmpty()) {
            System.out.println("[Peringatan] Jenjang tidak boleh kosong!");
            return;
        }
        this.jenjang = jenjang.trim();
    }

    public String getMataPelajaran() {
        return mataPelajaran;
    }

    public final void setMataPelajaran(final String mataPelajaran) {
        if (mataPelajaran == null || mataPelajaran.trim().isEmpty()) {
            System.out.println("[Peringatan] Mata pelajaran tidak boleh kosong!");
            return;
        }
        this.mataPelajaran = mataPelajaran.trim();
    }

    @Override
    public String getPeran() {
        return "Siswa";
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("ID             : " + getId());
        System.out.println("Nama           : " + getNama());
        System.out.println("Jenjang        : " + jenjang);
        System.out.println("Mata Pelajaran : " + mataPelajaran);
    }
}