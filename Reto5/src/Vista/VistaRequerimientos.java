package Vista;
import java.util.ArrayList;

import Controlador.ControladorRequerimientos;
import Modelo.Requerimiento_1;
import Modelo.Requerimiento_2;
import Modelo.Requerimiento_3;

public class VistaRequerimientos {
	
	public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1() {

        System.out.println("25 Proyectos Clasificados por Casa");
        System.out.println("Clasificación por Casa");
        try {
            ArrayList<Requerimiento_1> requerimiento1= controlador.consultarRequerimiento1();
          
            for(Requerimiento_1 req1: requerimiento1){
                System.out.printf("%s %s %s %s %s %s %n",
                req1.getFecha_Inicio(),
                req1.getConstructora(),
                req1.getCiudad(),
                req1.getAcabados(),
                req1.getBanco_Vinculado(),
                req1.getSerial());
            }

        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public static void requerimiento2() {
        System.out.println("INNER JOIN");
        System.out.println("Concatenacion");
        
        try {
            ArrayList<Requerimiento_2> requerimiento2= controlador.consultarRequerimiento2();
           
            for(Requerimiento_2 req2: requerimiento2){
                System.out.printf("%s %s %f %s %n",
                req2.getConstructora(),
                req2.getCiudad(),
                req2.getPorcentaje_Cuota_Inicial(),
                req2.getTipo());
                      }
           
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public static void requerimiento3() {
        System.out.println("-----Ranking Materiales-------"); 
        System.out.println("Materiales");
        try {
           
            ArrayList<Requerimiento_3> requerimiento3= controlador.consultarRequerimiento3();
            for(Requerimiento_3 req3: requerimiento3){
                System.out.printf("%s %d %n",
                req3.getNombre_Material(),
                req3.getMax_precio_unidad());
               
                      }
           
      
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

}
