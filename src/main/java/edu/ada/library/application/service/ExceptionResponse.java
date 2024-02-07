package edu.ada.library.application.service;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;

@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public record ExceptionResponse(
  String message
) {
}
