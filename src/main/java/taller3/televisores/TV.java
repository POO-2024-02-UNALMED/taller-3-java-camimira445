package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;
    private static int numTv;

    public TV(String marca,boolean estado){
        canal=1;
        volumen=1;
        precio=500;

    }

    public void setMarca(){
        return;
    }

    public Marca getMarca(){
        return marca;
    }

    public void setCanal(){
        return;
    }
    public int getCanal(){
        return canal;
    }
    public void setPrecio(){
        return;
    }
    public int getPrecio(){
        return precio;
    }
    public void setVolumen(){
        return;
    }
    public int getVolumen(){
        return volumen;

    }
    public void setControl(){
        return;
    }
    public Control getControl(){
        return control;
    }
    public static int getnumTV(){
        return numTv;
    }
    public void turnOn(){
        if (!estado){
            estado=true;
        }
    }
    public void turnOff(){
        if(estado){
            estado=false;
        }

    }
    public boolean getEstado(){
        return estado;
    }
    public int canalUp(){
        if (estado=true &&  canal < 120){
        canal ++;
        }
        return canal;

    }
    public int canalDown(){
        if (estado==false && canal > 1){
        canal--;
        }
        return canal;
    }
    public int volumenUp(){
        if(estado==true && volumen < 7){
        volumen ++;
        }
        return volumen;

    }
    public int volumenDown(){
        if(estado==false && volumen > 0){
        volumen--;
        }
        return volumen;
    }

    

 }

    

