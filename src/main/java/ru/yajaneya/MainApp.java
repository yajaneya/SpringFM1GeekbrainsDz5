package ru.yajaneya;

import ru.yajaneya.utils.SessionFactoryUtils;

public class MainApp {
    public static void main(String[] args) {

        SessionFactoryUtils factory = new SessionFactoryUtils();

        factory.init();

        factory.getSession().beginTransaction();

        factory.getSession()
                .createQuery("from Product")
                .getResultList()
                .forEach(p -> System.out.println(p));

        factory.getSession().getTransaction().commit();


        factory.shutdown();

    }
}
