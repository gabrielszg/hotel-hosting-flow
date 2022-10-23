package br.com.hotel.entity.enums;

/**
 * Tipo de hospedagem
 *
 */
public enum TypeOfHosting {

	INDIVIDUAL_HOSTING(1),
	ACCOMMODATION_WITH_A_COMPANION(2),
	ACCOMMODATION_WITH_CHILD(3);
	
	private int code;
	
	private TypeOfHosting(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
	
	public static TypeOfHosting valueOf(int code) {
		for (TypeOfHosting value : TypeOfHosting.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid TypeOfHosting code");
	}
}
