/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple1_creacioframe;

import javax.swing.JFrame;

/**
 *
 * @author nuriatorquetluna
 */
public class Exemple1_CreacioFrame {

    JFrame frame;
    
    public Exemple1_CreacioFrame(){
    frame = new JFrame();
    frame.setSize(400, 400);
    frame.setTitle("Hola, primera prova");
    frame.setVisible(true);
}
    public static void main(String[] args) {
        Exemple1_CreacioFrame ex1 = new Exemple1_CreacioFrame();
    }
    
}
