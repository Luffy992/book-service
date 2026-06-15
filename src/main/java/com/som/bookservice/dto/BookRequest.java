package com.som.bookservice.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookRequest {

    @NotBlank
    private String title;

    @NotBlank
    private String author;

    @Positive
    private Double price;

    @PositiveOrZero
    private Integer stock;
}