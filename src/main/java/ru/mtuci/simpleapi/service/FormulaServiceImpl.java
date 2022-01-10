package ru.mtuci.simpleapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mtuci.simpleapi.dao.FormulaRepository;
import ru.mtuci.simpleapi.model.Formula_1;

import java.util.List;

@Service
public class FormulaServiceImpl implements FormulaService {

    private final FormulaRepository formulaRepository;

    @Autowired
    public FormulaServiceImpl(FormulaRepository formulaRepository) {
        this.formulaRepository = formulaRepository;
    }

    @Override
    public Formula_1 get(Long id) {
        return formulaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Formula_1> getAll() {
        return formulaRepository.findAll();
    }

    @Override
    public Formula_1 save(Formula_1 formula1) {
        return formulaRepository.save(formula1);
    }

    @Override
    public void delete(Long id) {
        formulaRepository.delete(id);
    }
}
