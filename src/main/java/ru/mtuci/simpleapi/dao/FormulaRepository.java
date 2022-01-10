package ru.mtuci.simpleapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.mtuci.simpleapi.model.Formula_1;

@Transactional(readOnly = true)
public interface FormulaRepository extends JpaRepository<Formula_1,Long> {
    @Transactional
    @Modifying
    @Query("DELETE from Formula_1 p WHERE p.id=:id")
    int delete(@Param("id") Long id);
}
