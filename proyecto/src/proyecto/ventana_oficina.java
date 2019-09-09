/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ALUMNO - FIIS
 */
public class ventana_oficina extends JFrame implements ActionListener{
        JPanel panel;
        JLabel lblnombre,lblide;
        JTextField txtnombre,txtide;
        JButton boton;
    public ventana_oficina (){
        this.setSize(400, 400);
        this.setTitle("ventana oficina");
        this.setLocationRelativeTo(this);
        panel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    void panel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        label();
        texto();
        boton();
                
    }
    void label(){
        lblnombre=new JLabel("Nombre");
        lblnombre.setBounds(20, 20, 50, 20);
        panel.add(lblnombre);
        
        lblide=new JLabel("Ide");
        lblide.setBounds(20, 50, 50, 20);
        panel.add(lblide);
    }
    void texto(){
        txtnombre=new JTextField();
        txtnombre.setBounds(80, 20, 80, 20);
        panel.add(txtnombre);
        
        txtide=new JTextField();
        txtide.setBounds(80, 50, 80, 20);
        panel.add(txtide);
    }
    void boton(){
        boton = new JButton("Siguiente");
        boton.setBounds(30, 100, 100, 30);
        panel.add(boton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
