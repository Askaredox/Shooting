package shooting;
/*
 * @author ASKAR
 */
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Crear extends Thread{
    JFrame ventana;

    public Crear(JFrame ventana) {
        this.ventana = ventana;
    }

    @Override
    public void run() {
        Integer i=0;
        while(true){
            System.out.println("Blanco "+(++i));
            Circulo b= new Circulo(i.toString());
            b.setBounds(numRandom(100, 800), numRandom(100, 400), 50, 50);
            ventana.add(b);
            ventana.repaint();
            try {
                Thread.sleep(numRandom(2000, 2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private int numRandom(int min, int max){
        Random rand=new Random();
        return rand.nextInt((max-min)+1)+min;
        
    }
}
