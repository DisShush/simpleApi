package ru.mtuci.simpleapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.mtuci.simpleapi.dao.FormulaRepository;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

    private final FormulaRepository formulaRepository;

    @Autowired
    public CommandLineAppStartupRunner(FormulaRepository formulaRepository) {
        this.formulaRepository = formulaRepository;
    }

    @Override
    public void run(String...args) throws Exception {
        System.out.println(formulaRepository.findById(2L).get());

    }
}