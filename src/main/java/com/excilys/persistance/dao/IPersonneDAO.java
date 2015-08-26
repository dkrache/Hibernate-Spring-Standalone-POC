package com.excilys.persistance.dao;

import com.excilys.model.Personne;

public interface IPersonneDAO{
    Long count();

    public void create(Personne entity);
}
