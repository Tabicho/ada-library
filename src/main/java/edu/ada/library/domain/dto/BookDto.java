package edu.ada.library.domain.dto;

public record BookDto(
 Long id,
 String title,
 String author,
 String isbn,
 int availableCopies) {

}
