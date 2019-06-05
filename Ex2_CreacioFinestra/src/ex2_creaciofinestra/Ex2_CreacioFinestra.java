/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2_creaciofinestra;

import javax.swing.*;

/**
 *
 * @author nuriatorquetluna
 */
public class Ex2_CreacioFinestra extends JFrame{
   
    public static void main(String[] args) {
        //creem la finestra
        Ex2_CreacioFinestra ex2 = new Ex2_CreacioFinestra();
        ex2.setSize(400, 400);
        ex2.setTitle("Exemple segona finestra");
       
        
        //afegim ub btn
        JButton btn = new JButton("Primer botó");
        ex2.getContentPane().add( btn);
        
         ex2.setVisible(true);
    }
    
}
