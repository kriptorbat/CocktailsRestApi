package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Cocktail {
    private String name;
    private String imgUrl;
    private List<Ingredient> ingredients;
    private List<String> steps;
    private List<String> tags;
    private List<Tool> tools;
}
