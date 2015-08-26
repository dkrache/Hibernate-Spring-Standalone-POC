package com.excilys.service;

import com.excilys.model.Personne;

public interface IPersonneService {

    Long count();

    void create(Personne personne);
}
