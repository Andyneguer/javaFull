/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author CET
 */
public class C_alumno {
    
    private int codigoest;
    private String nombre;
    private String dir;
    private String tel;

    public C_alumno(int codigoest, String nombre, String dir, String tel) {
        this.codigoest = codigoest;
        this.nombre = nombre;
        this.dir = dir;
        this.tel = tel;
    }

    public int getCodigoest() {
        return codigoest;
    }

    public void setCodigoest(int codigoest) {
        this.codigoest = codigoest;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }    
}
