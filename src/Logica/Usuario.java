/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author user
 */
public class Usuario {
    
    private String nombre;
    private String edad;
    private String dni;
    private String telefono;
    private String direccion;
    private String grado;
    private String puesto;
    private int añosExp;
    public double sueldo;

    public Usuario() {
    }
    
    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Usuario(String nombre, String edad, String dni, String telefono, 
            String direccion, String grado, String puesto, int añosExp) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.grado = grado;
        this.puesto = puesto;
        this.añosExp = añosExp;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getGrado() {
        return grado;
    }

    public String getPuesto() {
        return puesto;
    }

    public int getAñosExp() {
        return añosExp;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setAñosExp(int añosExp) {
        this.añosExp = añosExp;
    }
    
    public boolean esUsuario (String name, String pass) {
        boolean res = false;
        if(name.equals(nombre) && pass.equals(dni)){
            res=true;
        }
        return res;
    }
    
    public void calcularSueldo(){
        if(!puesto.equals("")) {
            switch(puesto) {
                case "Decano":
                    sueldo = 6000;
                    break;
                case "Vicedecano":
                    sueldo = 4000;
                    break;
                case "Director académico":
                    sueldo = 3000;
                    break;
                case "Profesor":
                    sueldo = 1000;
                    break;
                case "Tutor":
                    sueldo = 800;
                    break;
            }
        }
        
        if(!grado.equals("")) {
            switch(grado) {
                case "Doctorado":
                    sueldo += 1500;
                    break;
                case "Magister":
                    sueldo += 800;
                    break;
                case "Titulado":
                    sueldo += 500;
                    break;
                case "Bachiller":
                    sueldo += 400;
                    break;
            }
        }
        int aux=0;
        for(int i=1;i<=30;i++) {
            aux=aux+50;
            if(i==añosExp) {
                sueldo += aux;
            }
        }
        //sueldo=100;
    }
}
