
package proj2.lightout;

import java.awt.Color;
import static java.awt.Color.BLACK;
import static java.awt.Color.WHITE;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;


/**
 *
 * @author emerson / paulo / jessica / carol
 */

public class Funcao{
    
    
    public void trocarCor(JButton b){
        b.setBackground(b.getBackground() == Color.BLACK ? Color.WHITE : Color.BLACK);
    // por causa da condição acima as imagens estão invertidas na etapa abaixo. 
     if(b.getBackground()== BLACK){
  b.setIcon(new javax.swing.ImageIcon(getClass().getResource("Sprite\\Blig.jpg")));
  }
  else if (b.getBackground()== WHITE){
      b.setIcon(new javax.swing.ImageIcon(getClass().getResource("Sprite\\Bdes.jpg")));
  }
    }
   
}
