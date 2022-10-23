package br.com.hotel.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsavel pelos itens do frigobar
 *
 */
public class FridgeItem {
	
	private Integer id;
	private String name;
	private Integer quantity;
	private String description;
	private List<FridgeItem> listFridgeItem = new ArrayList<>();
	
	public FridgeItem() {
	}
	
	public FridgeItem(Integer id, String name, Integer quantity, String description) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.description = description;
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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Adiciona Intens na lista
	 *
	 */
	public void addList(FridgeItem fridgeItem) {
		listFridgeItem.add(fridgeItem);
	}
	
	/**
	 * Realiza a baixa no estoque
	 *
	 */
	public void withdraw(FridgeItem fridgeItem, Integer decrease) {
		fridgeItem.setQuantity(fridgeItem.getQuantity() - decrease); 
	}

	public List<FridgeItem> getListFridgeItem() {
		return listFridgeItem;
	}

	@Override
	public String toString() {
		return name;
	}
	
}
