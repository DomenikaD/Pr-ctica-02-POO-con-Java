/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 *
 * @author Domenika Delgado
 */
public class Edificio extends Empresa {
    
    //Atributos de la clase Padre Edificio
    private int numeroEdificio;
    private int numeroPiso;
    private String personaEncargada;
    private String direccion;
    
    //Constructor Vacio
    public Edificio() {
    }
    
    
    //Constructor con todos los atributos propios (Clase Edificio)
    public Edificio(int numeroEdificio, int numeroPiso, String personaEncargada, String direccion) {
        this.numeroEdificio = numeroEdificio;
        this.numeroPiso = numeroPiso;
        this.personaEncargada = personaEncargada;
        this.direccion = direccion;
    }
    
    //Constructor con los atributos de la clase Abuelo (Empresa) mas atributos propios (Clase Edificio)
    public Edificio(int numeroEdificio, int numeroPiso, String personaEncargada, String direccion, String nombredueno, String nombreEmpresa, String telefonoEmpresa, Date fechaDeApertura) {
        super(nombredueno, nombreEmpresa, telefonoEmpresa, fechaDeApertura);
        this.numeroEdificio = numeroEdificio;
        this.numeroPiso = numeroPiso;
        this.personaEncargada = personaEncargada;
        this.direccion = direccion;
    }
    
    
    




}
