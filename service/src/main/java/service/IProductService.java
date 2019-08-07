package service;


import model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll() throws Exception;
}