package com.som.bookservice.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookResponse {

    private Long id;

    private String title;

    private String author;

    private Double price;

    private Integer stock;
}