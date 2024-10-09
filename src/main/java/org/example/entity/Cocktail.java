package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cocktail {
    private String name;
    private String image;
    private List<Ingredient> ingredients;
    private List<String> steps;
    private List<String> tags;
    private List<Tool> tools;
}
