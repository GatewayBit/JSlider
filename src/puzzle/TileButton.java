/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzle;


import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author joomlah
 */
public class TileButton extends JButton {
    
    private boolean isLastButton;
    
    public TileButton() {
        
        super();
        initUI();
    }
    
    public TileButton(Image image) {
        
        super (new ImageIcon(image));
        initUI();
    }
    
    private void initUI() {
        
        isLastButton = false;
//        BorderFactory.createLineBorder(Color.GRAY);
        
        addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.ORANGE));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.GRAY));
            }
        });
    }
    
    public void setLastButton() {
        isLastButton = true;
    }
    
    public boolean isLastButton() {
        return isLastButton;
    }
}
