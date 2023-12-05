package com.menesince.oopwithnlayeredapp;

import com.menesince.oopwithnlayeredapp.business.ProductManager;
import com.menesince.oopwithnlayeredapp.core.logging.DatabaseLogger;
import com.menesince.oopwithnlayeredapp.core.logging.FileLogger;
import com.menesince.oopwithnlayeredapp.core.logging.Logger;
import com.menesince.oopwithnlayeredapp.core.logging.MailLogger;
import com.menesince.oopwithnlayeredapp.dataAccess.HibernateProductDao;
import com.menesince.oopwithnlayeredapp.dataAccess.JdbsProductDao;
import com.menesince.oopwithnlayeredapp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {

        Product product1 = new Product(1,"iphone 11",10000);

        Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};

        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);

    }
}
