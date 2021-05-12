/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Sergio Olmedo
 */
public class Detectar_look extends JFrame {

    public Detectar_look() {
        UIManager.LookAndFeelInfo[] laf = UIManager.getInstalledLookAndFeels();
        for (int i = 0; i < laf.length; i++) {
            System.out.println("Nombre: " + laf[i].getName());
            System.out.println("Clase: " + laf[i].getClassName());
        }
    }

    public static void main(String[] args) {
        Detectar_look app = new Detectar_look();
    }
    
}
