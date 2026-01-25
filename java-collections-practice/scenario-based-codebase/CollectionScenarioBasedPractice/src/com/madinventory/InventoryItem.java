package com.madinventory;

public class InventoryItem<T> {

	private String itemId;
	private String itemName;
	private int quantity;
	private String expiryDate;
	private T category;

	public InventoryItem(String itemId, String itemName, int quantity, String expiryDate, T category) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.expiryDate = expiryDate;
		this.category = category;
	}

	public String getItemId() {
		return itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public T getCategory() {
		return category;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof InventoryItem))
			return false;
		InventoryItem<?> item = (InventoryItem<?>) o;
		return itemId.equals(item.itemId);
	}

	@Override
	public int hashCode() {
		return itemId.hashCode();
	}
}
