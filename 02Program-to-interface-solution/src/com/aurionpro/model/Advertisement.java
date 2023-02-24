package com.aurionpro.model;

public class Advertisement {
	private Idisplayable display;
	private String message;

	public Advertisement(Idisplayable display, String message) {
		super();
		this.display = display;
		this.message = message;
	}

	public Idisplayable getDisplay() {
		return display;
	}

	public void setDisplay(Idisplayable display) {
		this.display = display;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void showAdvertisement() {
		display.display(message);
	}

}
