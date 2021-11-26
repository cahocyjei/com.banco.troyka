package com.banco.troyka.interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AperturaCuenta extends JPanel {
    public static JTextField opcion1;
    public static JTextField opcion2;
    public static JTextField nucT;
    public  static JMenuBar panel;
    private JButton crearC;
    public AperturaCuenta(){
        setLayout(null);
        panel= new JMenuBar();
        panel.setLayout(null);
        Font fuente= new Font("Arial",Font.ITALIC,20);
        JLabel label0= new JLabel("Formulario para Apertura de Cuentas",JLabel.CENTER);
        label0.setBounds(5,10,400,20);
        label0.setFont(fuente);
        label0.setForeground(Color.blue);
        panel.add(label0);
        panel.setBounds(0,20,500,300);

        //OPCIONES
        JLabel label= new JLabel("Tipo de Cuenta",JLabel.CENTER);
        label.setBounds(5,40,130,15);
        panel.add(label);

        JCheckBox checkBox1= new JCheckBox();
        checkBox1.setBounds(5,65,20,20);
        panel.add(checkBox1);

        opcion1= new JTextField();
        opcion1.setBounds(35,65,150,20);
        opcion1.setEnabled(false);
        panel.add(opcion1);

        JCheckBox checkBox2= new JCheckBox();
        checkBox2.setBounds(5,95,20,20);
        panel.add(checkBox2);

        opcion2= new JTextField();
        opcion2.setBounds(35,95,150,20);
        opcion2.setEnabled(false);
        panel.add(opcion2);

        // NUMERO CUENTA
        JLabel nuC= new JLabel("Número Cuenta: ",JLabel.CENTER);
        nuC.setBounds(250,50,150,20);
        panel.add(nuC);
        nucT= new JTextField();
        nucT.setBounds(395,50,100,20);
        nucT.setEnabled(false);
        panel.add(nucT);

        //DATOS PERSONALES
        JLabel datos= new JLabel("Datos Personales",JLabel.CENTER);
        datos.setBounds(5,130,130,20);
        panel.add(datos);

        JLabel nombreL= new JLabel("Nombre");
        nombreL.setBounds(5,155,50,20);
        panel.add(nombreL);
        JTextField nombreT= new JTextField();
        nombreT.setBounds(60,155,150,20);
        panel.add(nombreT);

        crearC= new JButton("Crear Cuenta");
        crearC.addActionListener(new CrearCuenta());
        crearC.setBounds(300,270,150,20);
        panel.add(crearC);
        add(panel);

    }
    private class CrearCuenta implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object cC= e.getSource();
            if (cC==crearC){
                AperturaCuenta.panel.setVisible(false);
            }
        }
    }
}
