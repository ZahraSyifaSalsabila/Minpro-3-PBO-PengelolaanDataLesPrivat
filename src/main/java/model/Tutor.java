package model;

public class Tutor extends Pengguna {
    private String keahlian;
    private String noTelepon;

    public Tutor(final int id, final String nama, final String keahlian, final String noTelepon) {
        super(id, nama);
        setKeahlian(keahlian);
        setNoTelepon(noTelepon);
    }

    public String getKeahlian() {
        return keahlian;
    }

    public final void setKeahlian(final String keahlian) {
        if (keahlian == null || keahlian.trim().isEmpty()) {
            System.out.println("Keahlian tidak boleh kosong!");
            return;
        }
        this.keahlian = keahlian.trim();
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public final void setNoTelepon(final String noTelepon) {
        if (noTelepon == null || noTelepon.trim().isEmpty()) {
            System.out.println("No. Telepon tidak boleh kosong!");
            return;
        }
        this.noTelepon = noTelepon.trim();
    }

    @Override
    public String getPeran() {
        return "Tutor";
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("ID          : " + getId());
        System.out.println("Nama        : " + getNama());
        System.out.println("Keahlian    : " + keahlian);
        System.out.println("No. Telepon : " + noTelepon);
    }
}