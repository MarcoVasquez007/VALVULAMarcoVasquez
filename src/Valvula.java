public class Valvula {

    private String codigo;
    private int apertura;
    private double presion;
    private boolean activa;

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setApertura(int apertura){
        if(apertura >= 0 && apertura <= 100){
            this.apertura = apertura;
        }
    }
    public void setPresion(double presion){
        this.presion = presion;
    }
    public void  setActiva(boolean activa){
        this.activa = activa;
    }

    public String getCodigo(){
        return codigo;
    }
    public  int getApertura(){
        return apertura;
    }
    public double getPresion(){
        return presion;
    }
    public boolean getActiva(){
        return activa;
    }


}
