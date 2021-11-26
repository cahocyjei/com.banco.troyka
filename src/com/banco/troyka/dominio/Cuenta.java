package com.banco.troyka.dominio;

import java.util.Date;

public class Cuenta {
    public enum TipoCuenta{
        CUENTADEAHORROS,CUENTAINVERSION;
    }
    public enum RolEmpleado{
        CAJERO,ADMINISTRADOR,GERENTE,SECRETARIO;
    }
    private int id;
    private static int idCuenta= 1001;
    private Date fecha;
    private Persona titular;
    private double saldo;
    private TipoCuenta tipoCuenta;
    private RolEmpleado rolEmpleado;

    public Cuenta() {
        this.id= idCuenta;
        idCuenta++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Persona getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static int getIdCuenta() {
        return idCuenta;
    }

    public static void setIdCuenta(int idCuenta) {
        Cuenta.idCuenta = idCuenta;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public RolEmpleado getRolEmpleado() {
        return rolEmpleado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setRolEmpleado(RolEmpleado rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }
    public static int cuentaAhorros(Cuenta cuenta){
            System.out.println("CUENTA ABIERTA");
            double salInicial= cuenta.getSaldo();
            if (salInicial> 50000){
                System.out.println(" " +
                        "\n Tipo de Cuenta: " + cuenta.tipoCuenta +
                        "\n Titular: " + cuenta.getTitular().getNombre() +
                        "\n N° Cuenta: " + cuenta.getId() + "\n Saldo: " + cuenta.getSaldo());
            }else{
                System.out.println("La cuenta solo puede ser abierta con un saldo superior a 50000");
            }
        return cuenta.getId();
    }
}
