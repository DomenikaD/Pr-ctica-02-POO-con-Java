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
public class Empleado extends Persona {
    
    //Atributos de la clase Hija Empleado
    private int codigo;
    private String cargo;
    private double salario;
    private Date horario;
    
    //Constructor Vacio
    public Empleado() {
    }
    
    //Constructor con atibutos propios (Clase Empleado)
    public Empleado(int codigo, String cargo, double salario, Date horario) {
        this.codigo = codigo;
        this.cargo = cargo;
        this.salario = salario;
        this.horario = horario;
    }
    
    //Constructor con los Atributos de la clase Padre (Persona) mas atributos propios (Clase Empleado)
    public Empleado(int codigo, String cargo, double salario, Date horario, String cedula, String nombre, String apellido, int edad, String nombredueno, String nombreEmpresa, String telefonoEmpresa, Date fechaDeApertura) {
        super(cedula, nombre, apellido, edad, nombredueno, nombreEmpresa, telefonoEmpresa, fechaDeApertura);
        this.codigo = codigo;
        this.cargo = cargo;
        this.salario = salario;
        this.horario = horario;
    }
    
    
}
