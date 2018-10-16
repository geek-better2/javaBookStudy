package com.refactor.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @description: 影片实体类 包括影片标题和价格
 * @author hai
 */
public class Movie {
    public static final int CHILDDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    @Getter@Setter
    private String title;
    @Getter@Setter
    private int priceCode;


    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

}