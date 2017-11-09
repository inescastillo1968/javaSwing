/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;
import JavaSwing1. Escritorio;
import javax.swing.JFrame;
/**
 *
 * @author LAB10
 */
public class JavaSwing 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
     Escritorio Linus = new Escritorio();//creo un objeto tipo
        Linus.setVisible(true);
        Linus.setBounds(0, 0, 600, 800);
        //la siguiente inst. le pone el titulo a la ventana
        Linus.setTitle("mi primera interfaz grafica");
        //la siguiente sentencia es para finalizar el proyecto al cerrar la ventana
        Linus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // TODO code application logic here
    }
    
}
