package com.ls.words.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Sergey_PC on 25.02.2016.
 */
public abstract class AbstractDao {
    @Autowired
    private SessionFactory sessionFactory;

    protected final Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
