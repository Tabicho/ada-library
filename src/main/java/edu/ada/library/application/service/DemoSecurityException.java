package edu.ada.library.application.service;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import edu.ada.library.application.lasting.EMessage;

@Getter
public class DemoSecurityException extends Exception{

  private final HttpStatus status;
  private final String message;

  public DemoSecurityException(EMessage eMessage){
    this.status = eMessage.getStatus();
    this.message = eMessage.getMessage();
  }

}
