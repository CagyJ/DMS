package com.system.dms.exception;

public class DbRequestException extends RuntimeException{

  private String code;

  private String message;

  public DbRequestException(String code, String message) {
    super(code + ":" + message);
    this.code = code;
    this.message = message;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
