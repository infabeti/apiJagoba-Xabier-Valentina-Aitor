package com.howtodoinjava.rest.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.howtodoinjava.rest.dao.ProductosDAO;
import com.howtodoinjava.rest.model.Productos;
import com.howtodoinjava.rest.model.Productoss;

@RestController
@RequestMapping(path = "/Productoss")
@CrossOrigin(origins= "http://localhost:3000")
public class ProductosController 
{
    @Autowired
    private ProductosDAO ProductosDao;
    
    @GetMapping(path="/", produces = "application/json")
    public Productoss getProductoss() 
    {
        return ProductosDao.getAllProductoss();
    }
    
    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addProductos(
                        @RequestHeader(name = "X-COM-PERSIST", required = true) String headerPersist,
                        @RequestHeader(name = "X-COM-LOCATION", required = false, defaultValue = "ASIA") String headerLocation,
                        @RequestBody Productos Productos) 
                 throws Exception 
    {       
        //Generate resource id
        Integer id = ProductosDao.getAllProductoss().getProductosList().size() + 1;
        Productos.setId(id);
        
        //add resource
        ProductosDao.addProductos(Productos);
        
        //Create resource location
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                                    .path("/{id}")
                                    .buildAndExpand(Productos.getId())
                                    .toUri();
        
        //Send location in response
        return ResponseEntity.created(location).build();
    }
}
