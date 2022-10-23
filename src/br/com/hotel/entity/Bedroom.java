package br.com.hotel.entity;

/**
 * Classe que define os atributos do quarto
 *
 */
public class Bedroom {
	
	private Integer id;
	private String roomNumber;
	private String floor;
	private Guest guest;
	private Boolean availability;
	
	public Bedroom() {
	}
	
	public Bedroom(Integer id, String roomNumber, String floor, Boolean availability) {
		super();
		this.id = id;
		this.roomNumber = roomNumber;
		this.floor = floor;
		this.availability = availability;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	public Boolean getAvailability() {
		return availability;
	}

	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "Bedroom [id=" + id + ", roomNumber=" + roomNumber + ", floor=" + floor + "]";
	}
	
}
