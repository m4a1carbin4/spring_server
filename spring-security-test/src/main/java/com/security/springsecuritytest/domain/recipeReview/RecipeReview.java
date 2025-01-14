package com.security.springsecuritytest.domain.recipeReview;

import com.security.springsecuritytest.domain.recipeList.RecipeList;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "userReview")
public class RecipeReview {

    @Id
    @Column
    private String UID;

    @ManyToOne(targetEntity = RecipeList.class)
    @JoinColumn(name="total_list_ID")
    private RecipeList recipeList;

    @Column
    private int reviewPoint;

    @Builder
    public RecipeReview(String UID,RecipeList recipeList, int reviewPoint){
        this.UID = UID;
        this.recipeList = recipeList;
        this.reviewPoint = reviewPoint;
    }

}
