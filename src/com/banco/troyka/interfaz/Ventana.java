package com.banco.troyka.interfaz;

import javax.swing.*;
import java.awt.*;


public class Ventana extends JFrame {

    private int width;
    private int heigth;
    public Ventana(){
        setLayout(null);
        Toolkit miPantalla= Toolkit.getDefaultToolkit();
        Dimension dimPan= miPantalla.getScreenSize();
        width= dimPan.width;
        heigth= dimPan.height;
        setBounds(width/4,50,width/2,500);
        setTitle("Bienvenidos a su Banco Amigo ** Banco Troyka");
        BarraMenus barraMenus= new BarraMenus();
        barraMenus.setBounds(0,0,width,50);
        add(barraMenus);

        //----------------------------------Datos cuenta-----

        //


    }
}
