package com.banco.troyka.aplication;

import com.banco.troyka.interfaz.AperturaCuenta;
import com.banco.troyka.interfaz.Ventana;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //INTERFAZ GRAFICA
        Ventana ventana= new Ventana();
        AperturaCuenta datosCuenta= new AperturaCuenta();
        datosCuenta.setBounds(50,50,ventana.getWidth(),ventana.getHeight());
        ventana.add(datosCuenta);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AperturaCuenta.panel.setVisible(false);

            }
}
