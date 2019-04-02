package shooting;
/*
 * @author ASKAR
 */
import java.util.Random;
public class Crear extends Thread{                                              //se obtiene todos los metodos, variables y cosas para heredar de la clase hilo
    Ventana ventana;                                                            //ventana para acceder a metodos y variables
    
    public Crear(Ventana ventana) {
        this.ventana = ventana;                                                 //constructor para tener acceso a la ventana
    }

    @Override
    public void run() {                                                         //metodo para empezar a correr el hilo
        Integer i=0;                                                            //id del blanco a crear
        while(true){                                                            //que se corra siempre
            System.out.println("Blanco "+(++i));                                //impresion en consola que blanco se creó
            Circulo b= new Circulo(i.toString(),ventana,numRandom(25, 200));  //creacion del blanco
            b.setBounds(numRandom(100, 800), numRandom(100, 400), 100, 100);      //random(100,800)->posX, random(100,800)->posY,tamaño 50x50
            ventana.add(b);                                                     //Se añade a la ventana
            ventana.repaint();                                                  //se actualiza para que se logre ver en pantalla
            try {
                Thread.sleep(numRandom(500, 1000));                            //espera de 3 a 5 segundos para colocar el siguiente
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public int numRandom(int min, int max){
        Random rand=new Random();                                               //utilizacion de la clase random
        return rand.nextInt((max-min)+1)+min;                                   //formula para la creacion de un numero aleatorio
        
    }
}
