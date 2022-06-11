package Controller;

import Entity.MengelolaEntity;
import Model.MengelolaModel;

import java.util.ArrayList;
import java.util.Date;

public class MengelolaController {
    public ArrayList<MengelolaEntity> insertMengelola(int id_produk, int id_transaksi, int jumlah_jajan, float jumlah_harga_jajan){
        MengelolaModel mengelolaModel = new MengelolaModel();
        //JajanEntity jajanEntity = new JajanEntity(0, id_jenis_jajan, nama_jajan, harga_jajan, stok_jajan);
        MengelolaEntity mengelolaEntity = new MengelolaEntity (id_produk, id_transaksi, jumlah_jajan, jumlah_harga_jajan);
        mengelolaModel.insertMengelola(mengelolaEntity);
        return new MengelolaModel().insertMengelola(mengelolaEntity);
    }
    public ArrayList<MengelolaEntity> getMengelola(){
        return new MengelolaModel().getMengelola();
    }
}
