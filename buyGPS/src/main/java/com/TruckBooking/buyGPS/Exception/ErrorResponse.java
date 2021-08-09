package com.TruckBooking.buyGPS.Exception;

public class ErrorResponse 
{

	private String errorMessage;
	private int errorCode;
	
	public ErrorResponse()
	{
		
	}

	public ErrorResponse(String errorMessage, int errorCode) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
}
