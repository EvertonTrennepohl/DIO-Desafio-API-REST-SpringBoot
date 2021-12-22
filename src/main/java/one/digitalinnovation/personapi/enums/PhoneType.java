package one.digitalinnovation.personapi.enums;

public enum PhoneType {
	
	HOME("Home"),
	MOBILE("Mobile"),
	COMMERCIAL("Commercial");
	
	private final String description;
	
	PhoneType(String d) {
		this.description = d;
	}

	public String getDescription() {
		return description;
	}

}
