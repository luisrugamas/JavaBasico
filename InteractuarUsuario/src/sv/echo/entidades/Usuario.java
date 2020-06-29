/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.echo.entidades;

/**
 *
 * @author rgluis
 */
public class Usuario {
    private String nombre;
    private int edad;
    private String ocupacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    
    public String getCaracteristicaBasadaEnEdad(){
        if(this.edad > 0 && this.edad <=15){
            return "Niño";
        }else if(this.edad > 15 && this.edad <=20){
            return "Joven";
        }else if(this.edad > 20 && this.edad <=30){
            return "Adulto Joven";
        }else if(this.edad > 30 && this.edad <=50){
            return "Adulto";
        }else{
            return "Adulto Mayor";
        }
    }
    
    
    
}
