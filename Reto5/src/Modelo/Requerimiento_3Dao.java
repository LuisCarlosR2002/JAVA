package Modelo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        ArrayList<Requerimiento_3> respuesta= new ArrayList<Requerimiento_3>();
        Connection conexion = JDBCUtilities.getConnection();
        try{
            String consulta ="SELECT Nombre_Material ,MAX(Precio_Unidad) from MaterialConstruccion group by Nombre_Material having MAX(Precio_Unidad)>1500; ";
            Statement statement=conexion.createStatement();
            ResultSet resultSet=statement.executeQuery(consulta);
            while(resultSet.next()){
                Requerimiento_3 requerimiento3 =new Requerimiento_3();
                requerimiento3.setNombre_Material(resultSet.getString("Nombre_Material"));
                requerimiento3.setMax_precio_unidad(resultSet.getInt("MAX(Precio_Unidad)"));
                respuesta.add(requerimiento3);
            }  
            resultSet.close();
            statement.close(); 
        }catch(SQLException e){
            System.err.println("Error consultando Inner Join y Concatenacion:"+ e);
        }
        return respuesta;             
        
    }
}
