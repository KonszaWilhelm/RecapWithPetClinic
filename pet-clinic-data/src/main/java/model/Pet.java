package model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@RequiredArgsConstructor
@Getter
public class Pet {

    private LocalDate birthDate;

    private PetType petType;

    private Owner owner;


}
