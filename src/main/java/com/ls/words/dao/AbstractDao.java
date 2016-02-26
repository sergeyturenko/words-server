package com.ls.words.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Sergey_PC on 25.02.2016.
 */
@Transactional
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
