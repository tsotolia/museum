package edu.nwu.museum.common.exception;

public class UnauthorizedException extends RuntimeException {
  public UnauthorizedException(String msg) {
    super(msg);
  }

  public UnauthorizedException() {
    super();
  }
}