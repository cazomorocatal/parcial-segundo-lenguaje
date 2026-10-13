/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainn;

/**
 *
 * @author 0xx0k
 */
public class Profesor extends Persona {
    private String area;
    private double salarioBase;
    private int horasCatedra;

    public Profesor(String nombre, int edad, String documento, String area, double salarioBase, int horasCatedra) {
        super(nombre, edad, documento);
        this.area = area;
        this.salarioBase = salarioBase;
        this.horasCatedra = horasCatedra;
    }

    public double calcularSalario() {
        return salarioBase + (horasCatedra * 50000); // Cálculo estándar aplicado a las horas cátedra
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Área: " + area);
        System.out.println("Salario Base: " + salarioBase);
        System.out.println("Horas Cátedra: " + horasCatedra);
        System.out.println("Salario Total: " + calcularSalario());
    }

    @Override
    public String getRol() {
        return "Profesor";
    }
}
