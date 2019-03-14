package shooting;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * @author ASKAR
 */
public class Circulo extends JButton{
    String nombre;

    public Circulo(String nombre) {
        this.nombre = nombre;
        this.setIcon(getImage("src/Imagenes/diana.png"));
        this.setOpaque(true);
        this.setBorder(null);
        this.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("boton "+nombre+" presionado");
                
            }
        });
    }
    private ImageIcon getImage(String dir){
        ImageIcon im=new ImageIcon(dir);
        Image i=im.getImage();
        Image ni=i.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(ni);
    }
}
