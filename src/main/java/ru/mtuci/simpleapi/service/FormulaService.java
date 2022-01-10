package ru.mtuci.simpleapi.service;

import ru.mtuci.simpleapi.model.Formula_1;

import java.util.List;

public interface FormulaService {
    Formula_1 get(Long id);

    List<Formula_1> getAll();

    Formula_1 save(Formula_1 product);

    void delete(Long id);
}
