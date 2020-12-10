
package naughtsandcrossesgui;

import java.awt.Toolkit;

public class NaughtsAndCrossesGUI {

    public static void main(String[] args) {
        
        Game game = new Game();
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = (int)tk.getScreenSize().getWidth();
        int ySize = (int)tk.getScreenSize().getHeight();
        game.setSize(xSize,ySize);
        game.setVisible(true); 
       
    }
}
