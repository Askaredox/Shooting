package shooting;
/*
 * @author ASKAR
 */
public class Destruir extends Thread{
    Ventana v;
    
    public Destruir(Ventana v) {
        this.v = v;
    }

    @Override
    public void run() {
        while(true){
            if(!v.blancos.isEmpty())
                for(Circulo c:v.blancos){

                    if(c.tiempo<0){
                        System.out.println("boton "+c.id+"|"+c.tiempo);                  //impresion en pantalla de que botón se presionó
                        c.setVisible(false);                                        //se coloca invisible el botón cuando se presione
                        v.remove(c);                                                //se remueve completamente de la ventana
                        v.setPunteo(10);                                            //se manda a ventana el punteo que se le añadirá
                        v.blancos.remove(c);
                    }
                    else{
                        c.tiempo--;
                    }

                }
        }
    }
    
}
