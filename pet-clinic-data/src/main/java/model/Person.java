package model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;

@Entity
@RequiredArgsConstructor
@Getter
public class Person {

    private String firstName;
    private String lastName;


}
