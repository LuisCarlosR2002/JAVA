package Modelo;

public class Requerimiento_2 {
	
	private String Constructora;
    private String Ciudad;
    private Double porcentaje_Cuota_Inicial;
    private int Area_Max;
    private int Estrato;
    private String Tipo= String.valueOf(Area_Max)+" "+String.valueOf(Estrato);

    public Requerimiento_2(){

    }
    public Requerimiento_2(String constructora, String ciudad, Double porcentaje_cuota_inicial, int area_Max, int estrato){
        this.Ciudad=ciudad;
        this.Constructora=constructora;
        this.porcentaje_Cuota_Inicial=porcentaje_cuota_inicial;
        this.Area_Max=area_Max;
        this.Estrato=estrato;
    }
    public String getConstructora() {
        return Constructora;
    }
    public void setConstructora(String constructora) {
        this.Constructora = constructora;
    }
    public String getCiudad() {
        return Ciudad;
    }
    public void setCiudad(String ciudad) {
        this.Ciudad = ciudad;
    }
    public Double getPorcentaje_Cuota_Inicial() {
        return porcentaje_Cuota_Inicial;
    }
    public void setPorcentaje_Cuota_Inicial(Double porcentaje_Cuota_Inicial) {
        this.porcentaje_Cuota_Inicial = porcentaje_Cuota_Inicial;
    }
    public int getArea_Max() {
        return Area_Max;
    }
    public void setArea_Max(int area_Max) {
        this.Area_Max = area_Max;
    }
    public int getEstrato() {
        return Estrato;
    }
    public void setEstrato(int estrato) {
        this.Estrato = estrato;
    }
    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String tipo) {

        this.Tipo = tipo;
    }
}
