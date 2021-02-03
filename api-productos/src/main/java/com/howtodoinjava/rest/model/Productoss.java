package com.howtodoinjava.rest.model;

import java.util.ArrayList;
import java.util.List;

public class Productoss 
{
    private List<Productos> ProductosList;
    
    public List<Productos> getProductosList() {
        if(ProductosList == null) {
            ProductosList = new ArrayList<>();
        }
        return ProductosList;
    }
 
    public void setProductosList(List<Productos> ProductosList) {
        this.ProductosList = ProductosList;
    }
}
