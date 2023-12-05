package com.menesince.oopwithnlayeredapp.business;


import com.menesince.oopwithnlayeredapp.core.logging.Logger;
import com.menesince.oopwithnlayeredapp.dataAccess.HibernateProductDao;
import com.menesince.oopwithnlayeredapp.dataAccess.JdbsProductDao;
import com.menesince.oopwithnlayeredapp.dataAccess.ProductDao;
import com.menesince.oopwithnlayeredapp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao,Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {

        if (product.getUnitPrice() < 10) {
            throw new Exception("Unit Price cannot be less than ten");
        }

        productDao.add(product);

        for (Logger logger: loggers) {
            logger.log(product.getName());
            
        }

    }











}
