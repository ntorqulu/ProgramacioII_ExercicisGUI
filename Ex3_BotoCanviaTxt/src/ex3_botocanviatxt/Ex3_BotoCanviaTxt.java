/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_botocanviatxt;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author nuriatorquetluna
 */
public class Ex3_BotoCanviaTxt extends JFrame{
    //atribut de la classe
    JButton btn;
    
    public void go(){
        
        btn = new JButton("Text per defecte");
        //Afegim el primer listener, que canvia el txt al ser clicat
        //classe interna anònima
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn.setText("Canvi del text");
            }
            
        });
        //definim nova classe interna amb nom
        class Listene implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                btn.setText("Segon canvi de text");//podem accedir als atributs de fora la classe
            }
            
            
        }
        btn.addActionListener(new Listene());//Afegim instància de la classe amb nom
        //nova classe interna amb nom per tancar finestra
        class TancarFinestra extends WindowAdapter{
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        }
        
        this.addWindowListener(new TancarFinestra());
        this.setSize(400, 400);
        this.setTitle("Finestra amb el btn");
        this.getContentPane().add(BorderLayout.CENTER, btn);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        Ex3_BotoCanviaTxt ex3 = new Ex3_BotoCanviaTxt();
        ex3.go();
    }

    
}
