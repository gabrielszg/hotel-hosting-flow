package br.com.hotel.application;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import br.com.hotel.entity.Bedroom;
import br.com.hotel.entity.FridgeItem;
import br.com.hotel.entity.Guest;
import br.com.hotel.entity.enums.TypeOfHosting;
import br.com.hotel.service.HotelCheckOut;

public class Program {

	public static void main(String[] args) {

		Bedroom bedroom1 = new Bedroom(1, "1001", "1", true);
		Bedroom bedroom2 = new Bedroom(2, "1002", "1", true);
		Bedroom bedroom3 = new Bedroom(3, "1003", "1", true);
		Bedroom bedroom4 = new Bedroom(4, "1004", "1", true);
		Bedroom bedroom5 = new Bedroom(5, "1005", "1", true);
		Bedroom bedroom6 = new Bedroom(6, "1006", "1", true);
		Bedroom bedroom7 = new Bedroom(7, "1007", "1", true);
		Bedroom bedroom8 = new Bedroom(8, "1008", "1", true);
		Bedroom bedroom9 = new Bedroom(9, "1009", "1", true);
		Bedroom bedroom10 = new Bedroom(10, "1010", "1", true);
		Bedroom bedroom11 = new Bedroom(11, "2001", "2", true);
		Bedroom bedroom12 = new Bedroom(12, "2002", "2", true);
		Bedroom bedroom13 = new Bedroom(13, "2003", "2", true);
		Bedroom bedroom14 = new Bedroom(14, "2004", "2", true);
		Bedroom bedroom15 = new Bedroom(15, "2005", "2", true);
		Bedroom bedroom16 = new Bedroom(16, "2006", "2", true);
		Bedroom bedroom17 = new Bedroom(17, "2007", "2", true);
		Bedroom bedroom18 = new Bedroom(18, "2008", "2", true);
		Bedroom bedroom19 = new Bedroom(19, "2009", "2", true);
		Bedroom bedroom20 = new Bedroom(20, "2010", "2", true);

		FridgeItem water = new FridgeItem(1, "Agua", 100, "drink");
		FridgeItem soda = new FridgeItem(2, "Refrigerante", 100, "drink");
		FridgeItem beer = new FridgeItem(3, "Cerveja", 100, "drink");
		FridgeItem fridgeItem = new FridgeItem();
		fridgeItem.addList(water);
		fridgeItem.addList(soda);
		fridgeItem.addList(beer);

		System.out.println("====Hospedagem individual====");
		Guest guest1 = null;

		// Verifica a disponibilidade quarto. true = disponivel, false = indisponivel
		if (bedroom2.getAvailability()) {
			guest1 = new Guest(1, "Roberto Torres", bedroom2, TypeOfHosting.INDIVIDUAL_HOSTING,
					LocalDate.now(), LocalDate.of(2022, 10, 25));

			guest1.printCheckInVoucher();
			bedroom2.setAvailability(false);
		} else {
			System.out.println("Quarto indisponivel!");
		}

		guest1.setFridgeItem(water);
		int amountConsumed = 2;
		guest1.setQuantityItems(amountConsumed);
		fridgeItem.withdraw(water, amountConsumed);

		guest1.setBill(HotelCheckOut.getBill(guest1));
		guest1.printCheckOutVoucher();
		
		System.out.println();
		System.out.println("====Hospedagem com acompanhante====");
		Guest guest2 = null;

		if (bedroom11.getAvailability()) {
			guest2 = new Guest(2, "Carla Silva", bedroom11, TypeOfHosting.ACCOMMODATION_WITH_A_COMPANION,
					LocalDate.now(), LocalDate.of(2022, 10, 27));

			guest2.printCheckInVoucher();
			bedroom11.setAvailability(false);
		} else {
			System.out.println("Quarto indisponivel!");
		}

		guest2.setFridgeItem(beer);
		int amountConsumed1 = 2;
		guest2.setQuantityItems(amountConsumed1);
		fridgeItem.withdraw(guest2.getFridgeItem(), amountConsumed1);

		guest2.setBill(HotelCheckOut.getBill(guest2));
		guest2.printCheckOutVoucher();
		
		System.out.println();
		System.out.println("====Hospedagem com crianca====");
		Guest guest3 = null;

		if (bedroom5.getAvailability()) {
			guest3 = new Guest(3, "Pedro Campos", bedroom5, TypeOfHosting.ACCOMMODATION_WITH_CHILD,
					LocalDate.now(), LocalDate.of(2022, 10, 27));

			guest3.printCheckInVoucher();
			bedroom5.setAvailability(false);
		} else {
			System.out.println("Quarto indisponivel!");
		}

		guest3.setFridgeItem(soda);
		int amountConsumed3 = 4;
		guest3.setQuantityItems(amountConsumed3);
		fridgeItem.withdraw(guest3.getFridgeItem(), amountConsumed3);

		guest3.setBill(HotelCheckOut.getBill(guest3));
		guest3.printCheckOutVoucher();
	}

}
