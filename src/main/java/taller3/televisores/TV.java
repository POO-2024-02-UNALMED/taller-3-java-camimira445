package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;
    private static int numTV= 0;
    



    public TV(Marca marca,boolean estado){
        this.marca=marca;
        this.estado=estado;
        canal=1;
        volumen=1;
        precio=500;
        TV.numTV ++;
    }
    public static int getNumTV(){
        return TV.numTV;
    }
    public static void setNumTV(int numTV){
        TV.numTV=numTV;

    }
    public void turnOn(){
        estado=true;
    
    }
    public void turnOff(){
        estado=false;
    }
    public void canalUp(){
      
         this.setCanal(canal ++);
    }
    public void canalDown(){
       this.setCanal(canal --);
    }
    public void volumenUp(){
        this.setVolumen(volumen ++);
    }
    public void volumenDown(){
        this.setVolumen(volumen --);
    }

    public Marca getMarca(){
        return this.marca;
    }
    public int getCanal(){
        return this.canal;
    }
    public int getPrecio(){
        return this.precio;
    }
    public int getVolumen(){
        return this.volumen;
    }
    public Control getControl(){
        return control;
    }
     public boolean getEstado(){
        return estado;
    }

    public void setMarca(Marca marca){
        this.marca=marca;
    }

    public void setCanal(int canal){
        if(this.estado && canal >=1 && canal<=120)
        this.canal=canal;
    }
    public void setPrecio(int precio){
        this.precio=precio;
    }
    public void setVolumen(int volumen){
        if(this.estado && canal>=0 && canal<=7)
        this.volumen=volumen;
    }
    
    
    public void setControl(Control control){
        this.control=control;
        
    }
 }

    

