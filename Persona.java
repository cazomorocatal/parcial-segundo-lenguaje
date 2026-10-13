/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainn;
import java.util.Scanner;
/**
 *
 * @author 0xx0k
 */
public class Persona {
    protected String nombre;
    protected int edad;
    protected String documento;

    public Persona(String nombre, int edad, String documento) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Documento: " + documento);
    }

    public String getRol() {
        return "Persona";
    }
}