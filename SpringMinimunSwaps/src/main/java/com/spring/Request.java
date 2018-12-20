package com.spring;

public class Request {
    
    private int nuCantidad;
    private String sbCadena;

    public Request(int nuCantidad, String sbCadena) {
        this.nuCantidad = nuCantidad;
        this.sbCadena = sbCadena;
    }

    public Request() {
    }

    public int getNuCantidad() {
        return nuCantidad;
    }

    public void setNuCantidad(int nuCantidad) {
        this.nuCantidad = nuCantidad;
    }

    public String getSbCadena() {
        return sbCadena;
    }

    public void setSbCadena(String sbCadena) {
        this.sbCadena = sbCadena;
    }

    
}
