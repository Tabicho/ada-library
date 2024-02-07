package edu.ada.library.domain.dto;



import com.fasterxml.jackson.annotation.JsonInclude;

import edu.ada.library.application.lasting.ERole;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record UserDto(
  Long id,
  String name,
  String lastName,
  String email,
  String password,
  Boolean enable,
  ERole role
) {
}