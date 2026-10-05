package model;

public class Jadwal implements CetakInfo {
    private final int idJadwal;
    private int idSiswa;
    private int idTutor;
    private String hari;
    private String jam;

    public Jadwal(final int idJadwal, final int idSiswa, final int idTutor, final String hari, final String jam) {
        if (idJadwal <= 0) {
            throw new IllegalArgumentException("ID Jadwal harus lebih dari 0.");
        }
        this.idJadwal = idJadwal;
        setIdSiswa(idSiswa);
        setIdTutor(idTutor);
        setHari(hari);
        setJam(jam);
    }

    public int getIdJadwal() {
        return idJadwal;
    }

    public int getIdSiswa() {
        return idSiswa;
    }

    public final void setIdSiswa(final int idSiswa) {
        if (idSiswa <= 0) {
            System.out.println("[Peringatan] ID Siswa harus lebih besar dari 0!");
            return;
        }
        this.idSiswa = idSiswa;
    }

    public int getIdTutor() {
        return idTutor;
    }

    public final void setIdTutor(final int idTutor) {
        if (idTutor <= 0) {
            System.out.println("[Peringatan] ID Tutor harus lebih besar dari 0!");
            return;
        }
        this.idTutor = idTutor;
    }

    public String getHari() {
        return hari;
    }

    public final void setHari(final String hari) {
        if (hari == null || hari.trim().isEmpty()) {
            System.out.println("[Peringatan] Hari tidak boleh kosong!");
            return;
        }
        this.hari = hari.trim();
    }

    public String getJam() {
        return jam;
    }

    public final void setJam(final String jam) {
        if (jam == null || jam.trim().isEmpty()) {
            System.out.println("[Peringatan] Jam tidak boleh kosong!");
            return;
        }
        this.jam = jam.trim();
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("ID Jadwal : " + idJadwal);
        System.out.println("ID Siswa  : " + idSiswa);
        System.out.println("ID Tutor  : " + idTutor);
        System.out.println("Hari      : " + hari);
        System.out.println("Jam       : " + jam);
    }

    public void tampilkanInfo(final String namaSiswa, final String namaTutor) {
        System.out.println("ID Jadwal : " + idJadwal);
        System.out.println("Siswa     : " + namaSiswa);
        System.out.println("Tutor     : " + namaTutor);
        System.out.println("Hari      : " + hari);
        System.out.println("Jam       : " + jam);
    }
}