package com.excilys.persistance.dao;

import com.excilys.model.Personne;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@SuppressWarnings("unchecked")
public class PersonneDAO implements IPersonneDAO {
    private static final String COUNT_ALL_COMPUTERS = "SELECT COUNT(*) FROM Personne";

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Long count() {
        return (Long) sessionFactory.getCurrentSession()
                .createQuery(COUNT_ALL_COMPUTERS).uniqueResult();
    }

    public void create(Personne entity) {
        sessionFactory.getCurrentSession().save(entity);
    }
}
