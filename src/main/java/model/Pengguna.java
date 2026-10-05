package model;

public abstract class Pengguna implements CetakInfo {
    private final int id;
    private String nama;

    public Pengguna(final int id, final String nama) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID harus lebih besar dari 0.");
        }
        this.id = id;
        setNama(nama);
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public final void setNama(final String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("[Peringatan] Nama tidak boleh kosong!");
            return;
        }
        this.nama = nama.trim();
    }

    public abstract String getPeran();

    @Override
    public abstract void tampilkanInfo();
}