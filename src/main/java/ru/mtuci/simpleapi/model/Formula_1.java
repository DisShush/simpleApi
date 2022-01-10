package ru.mtuci.simpleapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Formula_1 extends AbstractBaseEntity {
    @NotBlank
    private String rider_name;
    @NotBlank
    private String car_brand;
    @NotNull
    private Integer points;
    @NotNull
    private Integer place;

    private Long id;
}
