package Controller;

import Entity.JajanEntity;
import Model.JajanModel;

import java.util.ArrayList;

public class JajanController {
    public void insertJajan(int id_jenis_jajan, String nama_jajan, float harga_jajan, int stok_jajan) {
        JajanModel jajanModel = new JajanModel();
        //JajanEntity jajanEntity = new JajanEntity(0, id_jenis_jajan, nama_jajan, harga_jajan, stok_jajan);
        JajanEntity jajanEntity = new JajanEntity (0, id_jenis_jajan, nama_jajan, harga_jajan, stok_jajan);
        jajanModel.insertJajan(jajanEntity);
    }
    public void updateJajan(int id_jajan,int id_jenis_jajan,String nama_jajan,float harga_jajan,int stok_jajan){
        JajanModel jajanModel = new JajanModel();
        jajanModel.updateJajan(id_jajan,id_jenis_jajan,nama_jajan,harga_jajan,stok_jajan);
    }

    public void deleteJajan(int currentId) {
        JajanModel jajanModel = new JajanModel();
        jajanModel.deleteJajan(currentId);
    }
    public ArrayList<JajanEntity> getDataJajan(){
        return new JajanModel().getJajan();
    }
}
