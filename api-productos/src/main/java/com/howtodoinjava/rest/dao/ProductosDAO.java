package com.howtodoinjava.rest.dao;

import org.springframework.stereotype.Repository;

import com.howtodoinjava.rest.model.Productos;
import com.howtodoinjava.rest.model.Productoss;

@Repository
public class ProductosDAO 
{
    private static Productoss list = new Productoss();
    
    static 
    {
        list.getProductosList().add(new Productos(1, "Lata de refresco", "1.20 €"));
        list.getProductosList().add(new Productos(2,"Zumos", "1.20 €"));
        list.getProductosList().add(new Productos(3,"Botellín de agua", "1.20 €"));
        list.getProductosList().add(new Productos(4,"Café solo", "1.00 €"));
        list.getProductosList().add(new Productos(5,"Café cortado", "1.00 €"));
        list.getProductosList().add(new Productos(6,"Cubata", "5.00 €"));
        list.getProductosList().add(new Productos(7,"Caña", "2.00 €"));
        list.getProductosList().add(new Productos(8,"Tortilla patatas", "1.20 €"));
        list.getProductosList().add(new Productos(9,"Tortilla de chorizo", "1.20 €"));
        list.getProductosList().add(new Productos(10,"Tortilla de jamón", "1.40 €"));
        list.getProductosList().add(new Productos(11,"Tortilla de York", "1.20 €"));
        list.getProductosList().add(new Productos(12,"Montadito de bacón", "1.00 €"));
        list.getProductosList().add(new Productos(13,"Montadito de lomo", "1.00 €"));
        
    }
    
    public Productoss getAllProductoss() 
    {
        return list;
    }
    
    public void addProductos(Productos Productos) {
        list.getProductosList().add(Productos);
    }
}
