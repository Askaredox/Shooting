package shooting;
/*
 * @author ASKAR
 */
public class Destruir extends Thread{
    Circulo c;
    Ventana v;
    public Destruir(Circulo c,Ventana v) {
        this.c = c;
        this.v = v;
    }

    @Override
    public void run() {
        try {
                Thread.sleep(c.numRandom(1000, 2000));                            //espera de 3 a 5 segundos para colocar el siguiente
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        c.setVisible(false);                                 //se coloca invisible el botón cuando se presione
                v.remove(c);                                        //se remueve completamente de la ventana

    }
    
}
