package br.com.hotel.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.hotel.entity.FridgeItem;
import br.com.hotel.entity.Guest;
import br.com.hotel.entity.enums.TypeOfHosting;

public class HotelCheckOut {
	
	public static final double VALUE_DAILY_INDIVIDUAL_ACCOMMODATION = 30.00;
	public static final double VALUE_DAILY_ACCOMMODATION_WITH_A_COMPANION = 50.00;
	public static final double VALUE_DAILY_ACCOMMODATION_WITH_CHILD = 80.00;
	
	public static final double WATER_PRICE = 3.00;
	public static final double SODA_PRICE = 4.00;
	public static final double BEER_PRICE = 5.00;
	
	private static Double getBill(LocalDate entryDate, LocalDate exitDate, TypeOfHosting typeOfHosting, FridgeItem fridgeItem, Integer quantity) {
		long days = entryDate.until(exitDate, ChronoUnit.DAYS);
		Double bill = 0.00;
		
		if (typeOfHosting == TypeOfHosting.INDIVIDUAL_HOSTING && fridgeItem == null) {
			bill = days * VALUE_DAILY_INDIVIDUAL_ACCOMMODATION;
		} else if (typeOfHosting == TypeOfHosting.INDIVIDUAL_HOSTING && fridgeItem != null) {
			if (fridgeItem.getName().contains("Agua")) {
				bill = (days * VALUE_DAILY_INDIVIDUAL_ACCOMMODATION) + (quantity * WATER_PRICE); 
			}
			
			if (fridgeItem.getName().contains("Refrigerante")) {
				bill = (days * VALUE_DAILY_INDIVIDUAL_ACCOMMODATION) + (quantity * SODA_PRICE); 
			}
			
			if (fridgeItem.getName().contains("Cerveja")) {
				bill = (days * VALUE_DAILY_INDIVIDUAL_ACCOMMODATION) + (quantity * BEER_PRICE); 
			}
		}
		
		if (typeOfHosting == TypeOfHosting.ACCOMMODATION_WITH_A_COMPANION && fridgeItem == null) {
			bill = days * VALUE_DAILY_ACCOMMODATION_WITH_A_COMPANION;
		} else if (typeOfHosting == TypeOfHosting.ACCOMMODATION_WITH_A_COMPANION && fridgeItem != null) {
			if (fridgeItem.getName().contains("Agua")) {
				bill = (days * VALUE_DAILY_ACCOMMODATION_WITH_A_COMPANION) + (quantity * WATER_PRICE); 
			}
			
			if (fridgeItem.getName().contains("Refrigerante")) {
				bill = (days * VALUE_DAILY_ACCOMMODATION_WITH_A_COMPANION) + (quantity * SODA_PRICE); 
			}
			
			if (fridgeItem.getName().contains("Cerveja")) {
				bill = (days * VALUE_DAILY_ACCOMMODATION_WITH_A_COMPANION) + (quantity * BEER_PRICE); 
			}
		}
		
		if (typeOfHosting == TypeOfHosting.ACCOMMODATION_WITH_CHILD && fridgeItem == null) {
			bill = days * VALUE_DAILY_ACCOMMODATION_WITH_CHILD;
		} else if (typeOfHosting == TypeOfHosting.ACCOMMODATION_WITH_CHILD && fridgeItem != null) {
			if (fridgeItem.getName().contains("Agua")) {
				bill = (days * VALUE_DAILY_ACCOMMODATION_WITH_CHILD) + (quantity * WATER_PRICE); 
			}
			
			if (fridgeItem.getName().contains("Refrigerante")) {
				bill = (days * VALUE_DAILY_ACCOMMODATION_WITH_CHILD) + (quantity * SODA_PRICE); 
			}
			
			if (fridgeItem.getName().contains("Cerveja")) {
				bill = (days * VALUE_DAILY_ACCOMMODATION_WITH_CHILD) + (quantity * BEER_PRICE); 
			}
		}
		return bill;
	}
	
	/**
	 * Chama o metodo que realiza o calculo da conta do hospede
	 *
	 */
	public static Double getBill(Guest guest) {
        return getBill(guest.getEntryDate(), guest.getExitDate(), guest.getTypeOfHosting(), guest.getFridgeItem(), guest.getQuantityItems());
    }
	
}
