package Model;
import Database.KoneksiDB;

import java.sql.Connection;

public abstract class ModelAbstract {
    public Connection conn = KoneksiDB.getconection();

}
