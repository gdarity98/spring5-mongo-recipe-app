package guru.springframework.spring5recipeapp.domain;

import lombok.*;

import java.util.Set;

/**
 * Created by gd on 9/6/2023
 */

@Getter
@Setter
public class Category {
    private String Id;
    private String description;
    private Set<Recipe> recipes;
}
