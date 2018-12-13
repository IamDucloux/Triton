/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triton;

/**
 *
 * @author USUARIO
 */
public class Usuario {
    
    private String nombre;
    private String apellido;
    private short edad;
    private String estado;
    private String pais;
    private String municipio;
    private String fbname;

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", estado=" + estado + ", pais=" + pais + ", municipio=" + municipio + ", fbname=" + fbname + '}';
    }
    
    public Usuario(){
        
    }
    
    public Usuario(String nombre){
        this.nombre=nombre;
    }

    public Usuario(String nombre, String apellido, short edad, String estado, String pais, String municipio, String fbname) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estado = estado;
        this.pais = pais;
        this.municipio = municipio;
        this.fbname = fbname;
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

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getFbname() {
        return fbname;
    }

    public void setFbname(String fbname) {
        this.fbname = fbname;
    }
    
    
}
