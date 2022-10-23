package br.com.hotel.entity;

import java.time.LocalDate;

import br.com.hotel.entity.enums.TypeOfHosting;

/**
 * Classe responsavel pelo controle de hospedes
 *
 */
public class Guest {
	
	private Integer id;
	private String name;
	private Bedroom bedroom;
	private Integer typeOfHosting;
	private LocalDate entryDate;
	private LocalDate exitDate;
	private FridgeItem fridgeItem;
	private Integer quantityItems;
	private Double bill;
	
	public Guest() {
	}
	
	public Guest(Integer id, String name, Bedroom bedroom, TypeOfHosting typeOfHosting, LocalDate entryDate,
			LocalDate exitDate) {
		super();
		this.id = id;
		this.name = name;
		this.bedroom = bedroom;
		setTypeOfHosting(typeOfHosting);
		this.entryDate = entryDate;
		this.exitDate = exitDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bedroom getBedroom() {
		return bedroom;
	}

	public TypeOfHosting getTypeOfHosting() {
		return TypeOfHosting.valueOf(typeOfHosting);
	}

	public void setTypeOfHosting(TypeOfHosting typeOfHosting) {
		if (typeOfHosting != null) {
			this.typeOfHosting = typeOfHosting.getCode();
		}
	}

	public LocalDate getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(LocalDate entryDate) {
		this.entryDate = entryDate;
	}

	public LocalDate getExitDate() {
		return exitDate;
	}

	public void setExitDate(LocalDate exitDate) {
		this.exitDate = exitDate;
	}

	public FridgeItem getFridgeItem() {
		return fridgeItem;
	}

	public void setFridgeItem(FridgeItem fridgeItem) {
		this.fridgeItem = fridgeItem;
	}

	public Integer getQuantityItems() {
		return quantityItems;
	}

	public void setQuantityItems(Integer quantityItems) {
		this.quantityItems = quantityItems;
	}

	public Double getBill() {
		return bill;
	}

	public void setBill(Double bill) {
		this.bill = bill;
	}
	
	/**
	 * Imprime o voucher de check-in
	 *
	 */
	public void printCheckInVoucher() {
		System.out.println("|| " + Hotel.HOTEL_NAME + " ||");
		System.out.println("CheckIn " + "Voucher");
		System.out.println("Número do Quarto: " + getBedroom().getRoomNumber() + "\nNome do Responsável: "
				+ getName() + "\nPeriodo desejado: " + getEntryDate() + " a " + getExitDate());
	}
	
	/**
	 * Imprime o voucher de check-out
	 *
	 */
	public void printCheckOutVoucher() {
		System.out.println();
		System.out.println("|| " + Hotel.HOTEL_NAME + " ||");
		System.out.println("CheckOut " + "Voucher");
		if (getFridgeItem() == null) {
			System.out.println("Número do Quarto: " + getBedroom().getRoomNumber() + "\nNome do Responsável: "
					+ getName() + "\nPeriodo da hospedagem: " + getEntryDate() + " a " + getExitDate()
					+ "\nItens Consumidos: Nenhum item consumido" + "\nValor Total: " + getBill());
		} else {
			System.out.println("Número do Quarto: " + getBedroom().getRoomNumber() + "\nNome do Responsável: "
					+ getName() + "\nPeriodo da hospedagem: " + getEntryDate() + " a " + getExitDate()
					+ "\nItens Consumidos: " + getFridgeItem().getName() + "\nValor Total: " + getBill());
		}
	}
}
