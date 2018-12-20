package com.slk.training.entity;

public class InvalidPriceException extends RuntimeException {


	private static final long serialVersionUID = 1L;

	public InvalidPriceException() {
	}

	public InvalidPriceException(String message) {
		super(message);
	}

	public InvalidPriceException(Throwable cause) {
		super(cause);
	}

	public InvalidPriceException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidPriceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
