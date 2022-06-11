package Entity;

public class MengelolaEntity {
    private int id_jajan, id_transaksi, jumlah_jajan;
    private float jumlah_harga_jajan;
    //public static JajanEntity jajanEntity = new JajanEntity();
    //public static TransaksiEntity transaksiEntity = new TransaksiEntity();


    public  MengelolaEntity() {
    }

    public MengelolaEntity(int id_jajan, int id_transaksi,int jumlah_jajan, float jumlah_harga_jajan) {
        this.id_jajan = id_jajan;
        this.id_transaksi = id_transaksi;
        this.jumlah_jajan = jumlah_jajan;
        this.jumlah_harga_jajan = jumlah_harga_jajan;
    }

    public int getId_jajan() {
        return id_jajan;
    }
    public void setId_jajan(int id_jajan) {
        this.id_jajan = id_jajan;
    }

    public int getId_transaksi() {
        return id_transaksi;
    }
    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public int getJumlah_jajan() {
        return jumlah_jajan;
    }
    public void setJumlah_jajan(int jumlah_jajan) {
        this.jumlah_jajan = jumlah_jajan;
    }


    public float getJumlah_harga_jajan() {
        return jumlah_harga_jajan;
    }
    public void setJumlah_harga_jajan(float jumlah_harga_jajan) {
        this.jumlah_harga_jajan = jumlah_harga_jajan;
    }
}
