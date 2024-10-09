package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Ingredient {
    private int amount;
    private String name;
    private String unit;
}
