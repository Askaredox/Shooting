package shooting;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * @author ASKAR
 */
public class Circulo extends JButton{
    String id;                                                                  //id de la instancia del circulo
    Ventana v;                                                                  //acceso a ventana
    int tiempo;
    public Circulo(String id,Ventana vs,int tiempo) {                           //obtención del id y de la ventana
        this.id = id;
        v=vs;
        this.tiempo=tiempo;
        this.setIcon(getImage("src/Imagenes/diana.png"));                       //direccion de la imagen y utilizacion de metodo para cambiar tamaño
        this.setOpaque(true);                                                   //sin fondo el boton
        this.setBorder(null);                                                   //sin bordes
        this.addActionListener(new ActionListener(){                            //accion a la instancia del botón
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("boton "+id+" presionado");                  //impresion en pantalla de que botón se presionó
                Circulo.this.setVisible(false);                                 //se coloca invisible el botón cuando se presione
                vs.remove(Circulo.this);                                        //se remueve completamente de la ventana
                vs.setPunteo(10);                                               //se manda a ventana el punteo que se le añadirá
            }
        });
    }
    private ImageIcon getImage(String dir){
        ImageIcon im=new ImageIcon(dir);                                        //transformación de ruta a icono
        Image i=im.getImage();                                                  //transformacion de icono a imagen
        Image ni=i.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);      //se minimiza la imagen para que quepa en el botón
        return new ImageIcon(ni);                                               //se retorna como icono nuevamente
    }
}
