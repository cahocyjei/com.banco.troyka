package com.banco.troyka.interfaz;

import com.banco.troyka.dominio.Cuenta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BarraMenus extends JPanel{
    private JMenuItem itemA;
    private JLabel label;
    private JMenuBar barraM;
    private JLabel nombreB;

    public BarraMenus(){
        setLayout(new FlowLayout(FlowLayout.LEFT));
        //BARRA DE MENUS
            //Menú Clientes
        barraM= new JMenuBar();
        barraM.setLayout(new FlowLayout(FlowLayout.LEFT));
        JMenu fileM= new JMenu("Clientes");
        itemA= new JMenuItem("Abrir Cuenta");
        JMenuItem itemD= new JMenuItem("Deposito");
        JMenuItem itemR= new JMenuItem("Retiro");
        barraM.add(fileM);
        fileM.add(itemA);
        fileM.add(itemD);
        fileM.add(itemR);
            //Eventos
        itemA.addActionListener(new AbrirCuenta());
            //Menú Empleados
        JMenu fileE= new JMenu("Empleados");
        barraM.add(fileE);
        JMenuItem itemH= new JMenuItem("Historial");
        JMenuItem itemeV= new JMenuItem("Vacaciones");
        fileE.add(itemH);
        fileE.add(itemeV);

        //NOMBRE BANCO
        Font fuente= new Font("Bauhus 93",Font.ITALIC,8);
        nombreB= new JLabel("                     Banco * Troyka  💰💰💰💰                                        ");
        nombreB.setFont(fuente);
        barraM.add(nombreB);
        barraM.setBounds(0,0,Ventana.WIDTH,Ventana.HEIGHT);
        add(barraM);

    }

    private class AbrirCuenta implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            Object item= e.getSource();
            if (item==itemA){
                AperturaCuenta.opcion1.setText(String.valueOf(Cuenta.TipoCuenta.CUENTADEAHORROS));
                AperturaCuenta.opcion2.setText(String.valueOf(Cuenta.TipoCuenta.CUENTAINVERSION));
                AperturaCuenta.nucT.setText(String.valueOf(Cuenta.getIdCuenta()));
                AperturaCuenta.panel.setVisible(true);
            }

        }
    }
    }
