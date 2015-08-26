package com.excilys.service;

import com.excilys.model.Personne;
import com.excilys.persistance.dao.IPersonneDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonneService implements IPersonneService {
    @Autowired
    private IPersonneDAO personneDAO;

    @Override
    @Transactional(readOnly = true)
    public Long count() {
        return personneDAO.count();
    }

    @Override
    public void create(Personne personne) {
        personneDAO.create(personne);
    }
}
