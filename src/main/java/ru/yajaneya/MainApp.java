package ru.yajaneya;

import ru.yajaneya.dao.ProductDao;
import ru.yajaneya.dao.ProductDaoImpl;
import ru.yajaneya.entities.Product;
import ru.yajaneya.utils.SessionFactoryUtils;

public class MainApp {
    public static void main(String[] args) {

        SessionFactoryUtils factory = new SessionFactoryUtils();

        factory.init();

        ProductDao productDao = new ProductDaoImpl(factory);

        printList(productDao);
        productDao.deleteById(3L);
        printList(productDao);
        Product product = productDao.findById(2L);
        product.setTitle("Potato");
        product.setPrice(60);
        productDao.saveOrUpdate(product);
        printList(productDao);

        factory.shutdown();

    }

    private static void printList(ProductDao productDao) {
        productDao.findAll().forEach(product -> System.out.println(product));
    }
}
