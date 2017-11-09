/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSwing1;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author LAB10
 */
public class Escritorio extends JFrame
{
    JPanel panel;
   JLabel  label;
   JTextField text;
   JButton boton; 
JCheckBox verificacion;
JRadioButton presione;
public Escritorio()
{
  panel = new JPanel ();
     label = new JLabel();
     text = new JTextField(20);
     boton = new JButton();
     verificacion = new JCheckBox();
     presione = new JRadioButton();
     
     this.add(panel);//recomendable agregar el JPanel al JFrame
    panel.add(label);//agrego los elementos al JPanel
    panel.add(text);
    panel.add(boton);
}




}
