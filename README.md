# Pr-ctica-02-POO-con-Java
Desarrollo de un programa con los temas de Clases, Relaciones, Navegabilidad, Instancia de Objetos, Constructores, Sobrecarga de métodos, Herencia, Interfaces, Polimorfismo, Clases Abstractas, Clases Finales, Clases Anónimas, entre otras.


 	PRÁCTICA DE LABORATORIO 

CARRERA: Computación	ASIGNATURA: Programación Aplicada
NRO. PRÁCTICA:	2	TÍTULO PRÁCTICA: Relaciones Entre Clases
OBJETIVO ALCANZADO: Entender el funcionamiento de las clases Abstractas con sus métodos, la clase anónima, el downcasting, la clase interfaz y el uso del software mediante diagramas de clase con sus respectivas herencias.
ACTIVIDADES DESARROLLADAS
1.	Creacion de un repositorio en GitHub:
                        Usuario: DomenikaD
                        Link: https://github.com/DomenikaD/Pr-ctica-02-POO-con-Java
 







2.	Commits:

 
  
 
3.	Paquetes de clases, interfaz y main:
 
4.	Jerarquía de clases:

Clase Abuelo:
 
Clases Padres:
  
Clases Hijas:

Hijas (Habitación & Restaurante) de Padre (Edificio)
  

Hijas (Cliente & Empleado) de Padre (Persona)
  

5.	Atributos, metodos, Getters & Setters y toString:
Clase Empresa
    
    //Atributos de la clase Abuelo Empresa
    private String nombredueno;
    private String nombreEmpresa;
    private String telefonoEmpresa;
    private Date fechaDeApertura;

    //Constructor Vacio es para instanciar 
    public Empresa() {
    }
    
    //Constructor con atributos propios menos FechaApertura (Clase Empresa)
    public Empresa(String nombredueno, String nombreEmpresa, String telefonoEmpresa) {    
        this.nombredueno = nombredueno;
        this.nombreEmpresa = nombreEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
    }

    //Constructor con todo los atributos propios (Clase Empresa)
    public Empresa(String nombredueno, String nombreEmpresa, String telefonoEmpresa, Date fechaDeApertura) {
        this.nombredueno = nombredueno;
        this.nombreEmpresa = nombreEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.fechaDeApertura = fechaDeApertura;
    }
    
    //Getters & Setters
    public String getNombredueno() {
        return nombredueno;
    }

    public void setNombredueno(String nombredueno) {
        this.nombredueno = nombredueno;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public Date getFechaDeApertura() {
        return fechaDeApertura;
    }


    public void setFechaDeApertura(Date fechaDeApertura) {
        this.fechaDeApertura = fechaDeApertura;
    }
    
    
    //toString
    @Override
    public String toString() {
        return "Empresa{" + "nombredueno=" + nombredueno + ", nombreEmpresa=" + nombreEmpresa + ", telefonoEmpresa=" + telefonoEmpresa + ", fechaDeApertura=" + fechaDeApertura + '}';
    }
    
    
    //Metodo de agregar una Empresa
    public boolean agregarEmpresa(String nombreDueno, String nombreEmpresa, String telefonoEmpresa, Date fechaApertua){
        return false;
    }
    
    //Metodo para modificar nombre de la Empresa
    public void modificarNombreEmpresa(String nombreDueno, String nombreEmpresa){
        
    }
    
    //Metodo para eliminar empresa
    public void eliminarEmpresa(String nombreDueno, String nombreEmpresa){
        
    }
}
Clase Edificio
    
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
    

    //Getters & Setters
    public int getNumeroEdificio() {
        return numeroEdificio;
    }

    public void setNumeroEdificio(int numeroEdificio) {
        this.numeroEdificio = numeroEdificio;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public String getPersonaEncargada() {
        return personaEncargada;
    }

    public void setPersonaEncargada(String personaEncargada) {
        this.personaEncargada = personaEncargada;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    //toString
    @Override
    public String toString() {
        return "Edificio{" + "numeroEdificio=" + numeroEdificio + ", numeroPiso=" + numeroPiso + ", personaEncargada=" + personaEncargada + ", direccion=" + direccion + '}';
    }
    
    
    //Metodo para asignar a una persona su cargo
    public void asignarPersona( String personaEncargada, int numeroEdificio){
        
    }
    
    
    //Metodo para agregar un Edificio
    public boolean agregarEdificio(int numeroEdificio, int numeroPiso){
        return false;
    }
  
    //Metoso para eliminar un Edificio
    public void eliminarEdificio(int numeroEdificio){
        
    }
    
    //Metodo Abstracto
    public abstract boolean verificarEdificio();

}

Clase Persona   
 
    //Atributos de la clase Padre Persona
    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    
    //Constuctor Vacio
    public Persona() {
    }
    
    //Constructor con atributos propios (Clase Persona)
    public Persona(String cedula, String nombre, String apellido, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    //Constructor con los Atributos de la clase Abuelo (Empresa) mas atributos propios (Clase Persona)
    public Persona(String cedula, String nombre, String apellido, int edad, String nombredueno, String nombreEmpresa, String telefonoEmpresa, Date fechaDeApertura) {
        super(nombredueno, nombreEmpresa, telefonoEmpresa, fechaDeApertura);
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    //Getters & Setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //toString
    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    
    
    //Metodo para crear a la persona
    public boolean crearPersona(String cedula, String nombre, String apellido, int edad){
        return false;
    }
    
    
    //Metodo para modificar datos de la Persona
    public boolean modificarPersona(String cedula, String nombre, String apellido, int edad){
        return false;
    }
    
    //Metodo para eliminar persona
    public boolean eliminarPersona(String cedula){
        return false;
    }
}
    
    
Clase Habitación    

   //Atributos de la clase Hija Habitacion
    private int numeroCuarto;
    private int numeroPersonas;
    private Date fechaIngreso;
    private Date fechaSalida;
    

    //Constructor Vacio
    public Habitacion() {
    }
    
    
    //Constructor con atributos propios (Clase Habitacion)
    public Habitacion(int numeroCuarto, int numeroPersonas, Date fechaIngreso, Date fechaSalida) {
        this.numeroCuarto = numeroCuarto;
        this.numeroPersonas = numeroPersonas;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }
    
     
    //Constructor con los Atributos de la clase Padre (Edificio) mas atributos propios (Clase Habitacion)
    public Habitacion(int numeroCuarto, int numeroPersonas, Date fechaIngreso, Date fechaSalida, int numeroEdificio, int numeroPiso, String personaEncargada, String direccion, String nombredueno, String nombreEmpresa, String telefonoEmpresa, Date fechaDeApertura) {
        super(numeroEdificio, numeroPiso, personaEncargada, direccion, nombredueno, nombreEmpresa, telefonoEmpresa, fechaDeApertura);
        this.numeroCuarto = numeroCuarto;
        this.numeroPersonas = numeroPersonas;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }
    
    
    //Getters & Setters
    public int getNumeroCuarto() {
        return numeroCuarto;
    }

    public void setNumeroCuarto(int numeroCuarto) {
        this.numeroCuarto = numeroCuarto;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
     
    //toString
    @Override
    public String toString() {
        return "Habitacion{" + "numeroCuarto=" + numeroCuarto + ", numeroPersonas=" + numeroPersonas + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + '}';
    }
    

    
    //Metodo para reservar habitacion
    public boolean reservarHabitacion(int numeroCuarto, int numeroPersonas, Date fechaIngreso, Date fechaSalida){
        return false;
    }
    
    
    //Metodo para cancelar la habitacion
    public boolean cancelarHabitacion(int numeroCuarto){
        return false;
    }
    
    //Metodo para el costo de la habitacion
    public double costo(Date fechaIngreso, Date fechaSalida){
        return 0;
        
    }
  
}

Clase Restaurante

//Atributos de la clase Hija Restaurante
    private int numeroMesa;
    private int cantidadPersona;
    private String descripcion;
    private int calificacion;
    
    //Constrcutor Vacio

    public Restaurante() {
    }
    
    //Constructor con atributos propios (Clase Restaurante)
    public Restaurante(int numeroMesa, int cantidadPersona, String descripcion, int calificacion) {
        this.numeroMesa = numeroMesa;
        this.cantidadPersona = cantidadPersona;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
    }
    
    //Constructor con los Atributos de la clase Padre (Edificio) mas atributos propios (Clase Restaurante)
    public Restaurante(int numeroMesa, int cantidadPersona, String descripcion, int calificacion, int numeroEdificio, int numeroPiso, String personaEncargada, String direccion, String nombredueno, String nombreEmpresa, String telefonoEmpresa, Date fechaDeApertura) {
        super(numeroEdificio, numeroPiso, personaEncargada, direccion, nombredueno, nombreEmpresa, telefonoEmpresa, fechaDeApertura);
        this.numeroMesa = numeroMesa;
        this.cantidadPersona = cantidadPersona;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
    }
    
    //Getters & Setters
    public int getNumeroMesa() {
        return numeroMesa;
    }


    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getCantidadPersona() {
        return cantidadPersona;
    }

    public void setCantidadPersona(int cantidadPersona) {
        this.cantidadPersona = cantidadPersona;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    
    //toString
    @Override
    public String toString() {
        return "Restaurante{" + "numeroMesa=" + numeroMesa + ", cantidadPersona=" + cantidadPersona + ", descripcion=" + descripcion + ", calificacion=" + calificacion + '}';
    }
    
    //Metodo para agregar la calificacion del restuaurante
    public boolean agregarCalificacion(int numeroMesa, int cantidadPersona, String descripcion, int calificacion){
        return false;
    }
    
    
    //Metodo para modificar la calficacion ya ingresada del restaurante
    public boolean modificarCalificacion(int numeroMesa, int cantidadPersona, String descripcion, int calificacion){
        return false;
    }
    
    
    //Metodo para ingresar una mesa
    public void ingresarMesa(int numeroMesa, int cantidadPersona){
        
    }
}





Clase Cliente

//Atributos de la clase Hija Cliente
    private int codigoCliente;
    private String direccion;
    private String correo;
    private String telefono;
    
    
    //Constructor Vacio
    public Cliente() {
    }
    
    
    //Constructor con atributos propios (Clase Cliente)
    public Cliente(int codigoCliente, String direccion, String correo, String telefono) {
        this.codigoCliente = codigoCliente;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    //Constructor con los Atributos de la clase Padre (Persona) mas atributos propios (Clase Cliente)
    public Cliente(int codigoCliente, String direccion, String correo, String telefono, String cedula, String nombre, String apellido, int edad, String nombredueno, String nombreEmpresa, String telefonoEmpresa, Date fechaDeApertura) {
        super(cedula, nombre, apellido, edad, nombredueno, nombreEmpresa, telefonoEmpresa, fechaDeApertura);
        this.codigoCliente = codigoCliente;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    
    //Getters & Setters
    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    //toString
    @Override
    public String toString() {
        return "Cliente{" + "codigoCliente=" + codigoCliente + ", direccion=" + direccion + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
    
    //Metodo para agregar un cliente
    public boolean agregarCliente(int codigoCliente, String direccion, String correo, String telefono){
        return false;
    }
    
    
    //Metodo para modificar datos del cliente
    public boolean modificarCliente(int codigoCliente, String direccion, String correo, String telefono){
        return false;
    }
    
    //Metodo para eliminar cliente
    public boolean eliminarCliente(int codigoCliente){
        return false;
    }
}

Clase Empleado
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
   
    //Getters & Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }
    
    //toString
    @Override
    public String toString() {
        return "Empleado{" + "codigo=" + codigo + ", cargo=" + cargo + ", salario=" + salario + ", horario=" + horario + '}';
    }
  
    //Metodo para crear al empleado
    public boolean crearEmpleado(int codigo, String cargo, double salario, Date horario){
        return false;
    }
    
    //Metodo para modificar datos de un empleado
    public boolean modificarEmpleado(int codigo, String cargo, double salario, Date horario){
        return false;
    }
    
    //Metodo para eliminar un empleado
    public boolean emliminarEmpleado(int codigo){
        return false;
    }
}
6.	Clases Padres y sus métodos abstractos:
Clase Padre(Edificio)
//Metodo Abstracto
    public abstract boolean verificarEdificio();
Clase Padre(Persona)
//Metodo Abstracto
    public abstract boolean VerificarPersona(); 
7.	Implementacion de los metodos abstractos en las clases hijas:
Clase Habitación:
//Implementacion del Metodo Abstracto de la clase Padre(Edifico) 
    @Override
    public boolean verificarEdificio() {
        return false;
    }

Clase Restaurante:
 //Implementacion del Metodo Abstracto de la clase Padre(Edifico) 
    @Override
    public boolean verificarEdificio() {
        return false; 
    }

Clase Cliente:
//Implementacion del Metodo Abstracto de la clase Padre(Persona)  
    @Override
    public boolean VerificarPersona() {
        return false;
    }

Clase Empleado:
//Implementacion del Metodo Abstracto de la clase Padre(Persona)
    @Override  
    public boolean VerificarPersona() {
        return false;
    }
8.	Clases hijas son clases finales:
Clase Habitación
 
Clase Restaurante
 
Clase Cliente
 
Clase Empleado
 
9.	Creación de interfaz e implementación de los métodos en las clases hijas
 


 

Clase Habitación

 

Clase Restaurante

 

Clase Cliente

 

Clase Empleado

 
10.	Creación de la Clase Main, demostración del downCasting e clases anónimas: 
Clase Main
 




package ec.edu.ups.main;

import ec.edu.ups.clases.Cliente;
import ec.edu.ups.clases.Empleado;
import ec.edu.ups.clases.Empresa;
import ec.edu.ups.clases.Habitacion;
import ec.edu.ups.clases.Persona;
import ec.edu.ups.clases.Restaurante;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Domenika Delgado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    
        //Fechas
        GregorianCalendar fechaJuanLopez = new GregorianCalendar(2018, 06, 29);
        GregorianCalendar fechaApertuC = new GregorianCalendar(2005, 10, 25);
        GregorianCalendar fechaDeApe = new GregorianCalendar(1997, 10, 11);
        GregorianCalendar fechaIngreso = new GregorianCalendar(2019, 04, 6);
        GregorianCalendar fechaSalida = new GregorianCalendar(2019, 04, 16);
        
        
        //Implementacion
        Empleado JuanLopez = new Empleado(43, "Vendedor", 367.9, fechaJuanLopez.getTime(), "0105295789", "Juan", "Lopez", 35, "Luiz", "Coral", "0995783648", fechaApertuC.getTime());
        System.out.println(JuanLopez.toString());
        System.out.println(JuanLopez.informacion());
        System.out.println(JuanLopez.ubicacion());
        System.out.println("");
        System.out.println("*****************************************************************");
        System.out.println("");
        
        Cliente LuisTobar = new Cliente(474, "General Torres", "tobar@gmail.com", "0997563821", "0107567832", "Luis", "Tobar", 38, "Valdez", "SuperMaxi", "2957863", fechaDeApe.getTime());
        System.out.println(LuisTobar.toString());
        System.out.println(LuisTobar.informacion());
        System.out.println(LuisTobar.ubicacion());
        System.out.println("");
        System.out.println("*****************************************************************");
        System.out.println("");
        
        Habitacion hab1 = new Habitacion(54, 4, fechaIngreso.getTime(), fechaSalida.getTime(), 2, 5, "Luis Calle", "Manuel Tenorio", "Juan Perez", "Coral", "09967846372", fechaApertuC.getTime());
        System.out.println(hab1.toString());
        System.out.println(hab1.informacion());
        System.out.println(hab1.ubicacion());
        System.out.println("");
        System.out.println("*****************************************************************");
        System.out.println("");

        Restaurante res1= new Restaurante(20, 100, "Alitas a Domicilio y para servirce", 5, 54, 5, "Juan Cardenas", "Paseo de los Canaris", "Manuel Lopez", "SuperMaxi", "2984021", fechaApertuC.getTime());
        System.out.println(res1.toString());  
        System.out.println(res1.informacion());
        System.out.println(res1.ubicacion());
        System.out.println("");
        System.out.println("*****************************************************************");
        System.out.println("");
        
        //DownCasting
        List <Empresa> lista = new ArrayList<>();
        lista.add(JuanLopez);
        lista.add(LuisTobar);
        lista.add(hab1);
        lista.add(res1);
        
        for(Empresa emp : lista){
            if(emp instanceof Cliente){
                Cliente temp = (Cliente) emp;
                System.out.println(temp);
            }
            else if(emp instanceof Empleado){
                Empleado temp = (Empleado) emp;
                System.out.println(temp);
            }
            else if(emp instanceof Habitacion){
                Habitacion temp = (Habitacion) emp;
                System.out.println(temp);
            }
            else if(emp instanceof Restaurante){
                Restaurante temp = (Restaurante) emp;
                System.out.println(temp);
            }
        }
        
        System.out.println("");
        System.out.println("*****************************************************************");
        System.out.println("");
        
        
        //Clase Anonima
        Persona empleadoAnonimo = new Persona("010746371", "Juana", "Maldonado", 21) {
            @Override
            public boolean VerificarPersona() {
                System.out.println("Datos correctos" + getNombre());
                return true;
            }
        };

        System.out.println(empleadoAnonimo);
    }
    
}


downCasting

 

Clase Anónima 

 
RESULTADO(S) OBTENIDO(S):
 
11.	Diagrama de Clases 
CONCLUSIONES: En esta práctica podemos concluir que tenemos los conocimientos más claros sobre la interfaz y sobre los métodos abstractos y como función un downCasting con si implementación de instanceof.
RECOMENDACIONES: Lo que puedo recomendar en esta práctica es de tener muy en cuenta de las heredaciones ya que hay algunas variables que se puede duplicar en diferentes clases pero ya están heredadas desde otras.



