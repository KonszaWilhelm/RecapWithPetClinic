package model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;

@Entity
@RequiredArgsConstructor
@Getter
public class PetType {

    private String name;
}
