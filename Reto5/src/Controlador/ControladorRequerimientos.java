package Controlador;
import java.sql.SQLException;
import java.util.ArrayList;

import Modelo.Requerimiento_1;
import Modelo.Requerimiento_1Dao;
import Modelo.Requerimiento_2;
import Modelo.Requerimiento_2Dao;
import Modelo.Requerimiento_3;
import Modelo.Requerimiento_3Dao;

public class ControladorRequerimientos {
	private final Requerimiento_1Dao requerimiento_1Dao;
	private final Requerimiento_2Dao requerimiento_2Dao;
    private final Requerimiento_3Dao requerimiento_3Dao;

    public ControladorRequerimientos() {
        this.requerimiento_1Dao = new Requerimiento_1Dao();
        this.requerimiento_2Dao = new Requerimiento_2Dao();
        this.requerimiento_3Dao = new Requerimiento_3Dao();
    }

    public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
        
        return requerimiento_1Dao.requerimiento1();

    }

     public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
   
    	 return requerimiento_2Dao.requerimiento2();
    }
 
    public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
  
    	return requerimiento_3Dao.requerimiento3();

    }
 
}
