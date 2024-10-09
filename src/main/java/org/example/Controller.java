package org.example;

import org.example.entity.Cocktail;
import org.example.entity.Ingredient;
import org.example.entity.Tool;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    private final String sharedKey = "SHARED_KEY";

    private static final String SUCCESS_STATUS = "success";
    private static final String ERROR_STATUS = "error";
    private static final int CODE_SUCCESS = 100;
    private static final int AUTH_FAILURE = 102;

    @GetMapping
    public String showPayment() {
        return "Приветсутвую";
    }
    @GetMapping("/cocktails")
    public List<Cocktail> getCocktails() {
        // Создание тестовых данных
        List<Cocktail> cocktails = new ArrayList<>();

        // Пример коктейля
        Cocktail cocktail1 = new Cocktail(
                "Mojito",
                "https://example.com/mojito.jpg",
                Arrays.asList(new Ingredient(50, "White Rum", "ml"),
                        new Ingredient(30, "Fresh Lime Juice", "ml"),
                        new Ingredient(6, "Mint Leaves", "leaves")),
                Arrays.asList("Muddle mint leaves with sugar and lime juice.",
                        "Add rum and top with soda water.",
                        "Garnish with mint sprig."),
                Arrays.asList("refreshing", "summer", "cocktail"),
                Arrays.asList(new Tool(1, "Muddler", "unit"),
                        new Tool(1, "Glass", "unit"))
        );
        Cocktail cocktail2 = new Cocktail(
                "Turbovodka",
                "https://example.com/turbovodka.jpg",
                Arrays.asList(new Ingredient(50, "White Rum", "ml"),
                        new Ingredient(30, "Fresh Lime Juice", "ml"),
                        new Ingredient(6, "Mint Leaves", "leaves")),
                Arrays.asList("русский язык йпта.",
                        "Add rum and top with soda water.",
                        "Garnish with mint sprig."),
                Arrays.asList("refreshing", "summer", "cocktail"),
                Arrays.asList(new Tool(1, "Muddler", "unit"),
                        new Tool(1, "Glass", "unit"))
        );

        cocktails.add(cocktail1);
        cocktails.add(cocktail2);

        return cocktails;
    }
}