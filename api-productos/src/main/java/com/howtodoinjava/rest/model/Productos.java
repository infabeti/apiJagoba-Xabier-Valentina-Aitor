package com.howtodoinjava.rest.model;

public class Productos {

    public Productos() {

    }

    public Productos(Integer id, String Nombre, String Precio) {
        super();
        this.id = id;
        this.Nombre = Nombre;
        this.Precio = Precio;

    }
 
    private Integer id;
    private String Nombre;
    private String Precio;
  
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }



    @Override
    public String toString() {
        return "Productos [id=" + id + ", Nombre=" + Nombre + ", Precio=" + Precio + "]";
    }
}
