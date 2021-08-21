package Modelo;

public class Requerimiento_1 {
	
	private String Fecha_Inicio;
    private String Constructora;
    private String Ciudad;
    private String Acabados;
    private String Banco_Vinculado;
    private String Serial;
    
    public Requerimiento_1() {   
    }

    public Requerimiento_1(String fecha_Inicio, String constructora, String ciudad, String acabados,
            String banco_Vinculado, String serial) {
        this.Fecha_Inicio = fecha_Inicio;
        this.Constructora = constructora;
        this.Ciudad = ciudad;
        this.Acabados = acabados;
        this.Banco_Vinculado = banco_Vinculado;
        this.Serial = serial;
    }

    public String getFecha_Inicio() {
        return Fecha_Inicio;
    }

    public void setFecha_Inicio(String fecha_Inicio) {
        this.Fecha_Inicio = fecha_Inicio;
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

    public String getAcabados() {
        return Acabados;
    }

    public void setAcabados(String acabados) {
        this.Acabados = acabados;
    }

    public String getBanco_Vinculado() {
        return Banco_Vinculado;
    }

    public void setBanco_Vinculado(String banco_Vinculado) {
        this.Banco_Vinculado = banco_Vinculado;
    }

    public String getSerial() {
        return Serial;
    }
    public void setSerial(String serial) {
        this.Serial = serial;
    }

}
