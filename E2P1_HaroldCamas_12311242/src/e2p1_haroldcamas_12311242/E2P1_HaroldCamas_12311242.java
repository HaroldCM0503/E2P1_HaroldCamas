package e2p1_haroldcamas_12311242;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import java.util.Scanner;

public class E2P1_HaroldCamas_12311242 {
    
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setSize(500, 500);
        menu.setResizable(true);
        menu.setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }
    
}
