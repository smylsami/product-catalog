package com.nisum.productcatalog.controller;

import com.nisum.productcatalog.data.Product;
import com.nisum.productcatalog.exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    ResponseEntity<List<Product>> getProducts() throws CustomException {

         //throw new CustomException ("Error MSg");//new ResponseEntity<>(HttpStatus.OK);
        List<Product> list =  new ArrayList<>();
        list.add(new Product(UUID.randomUUID(), "Prod1"));
        list.add(new Product(UUID.randomUUID(), "Prod2"));

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
