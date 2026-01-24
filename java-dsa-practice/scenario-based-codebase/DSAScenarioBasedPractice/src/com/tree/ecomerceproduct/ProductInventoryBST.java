package com.tree.ecomerceproduct;

public class ProductInventoryBST {

	ProductNode root;

	// 🔹 Insert Product
	ProductNode insert(ProductNode root, int sku, String name, double price) {
		if (root == null) {
			return new ProductNode(sku, name, price);
		}

		if (sku < root.sku) {
			root.left = insert(root.left, sku, name, price);
		} else if (sku > root.sku) {
			root.right = insert(root.right, sku, name, price);
		}
		return root;
	}

	// 🔹 Lookup Product by SKU
	ProductNode search(ProductNode root, int sku) {
		if (root == null || root.sku == sku)
			return root;

		if (sku < root.sku)
			return search(root.left, sku);

		return search(root.right, sku);
	}

	// 🔹 Update Product Price
	void updatePrice(int sku, double newPrice) {
		ProductNode product = search(root, sku);
		if (product != null) {
			product.price = newPrice;
			System.out.println("Price updated successfully!");
		} else {
			System.out.println("Product not found!");
		}
	}

	// 🔹 Display Products in Sorted SKU Order
	void displaySorted(ProductNode root) {
		if (root != null) {
			displaySorted(root.left);
			System.out.println("SKU: " + root.sku + ", Name: " + root.name + ", Price: ₹" + root.price);
			displaySorted(root.right);
		}
	}

	// 🔹 Main Method (Demo)
	public static void main(String[] args) {

		ProductInventoryBST inventory = new ProductInventoryBST();

		// Insert Products
		inventory.root = inventory.insert(inventory.root, 105, "Laptop", 55000);
		inventory.root = inventory.insert(inventory.root, 102, "Mouse", 800);
		inventory.root = inventory.insert(inventory.root, 108, "Keyboard", 1500);
		inventory.root = inventory.insert(inventory.root, 101, "Monitor", 12000);

		// Lookup
		System.out.println("Searching SKU 102:");
		ProductNode p = inventory.search(inventory.root, 102);
		if (p != null) {
			System.out.println("Found: " + p.name + " - ₹" + p.price);
		}

		// Update Price
		inventory.updatePrice(108, 1800);

		// Display Sorted Products
		System.out.println("\nProducts in Sorted SKU Order:");
		inventory.displaySorted(inventory.root);
	}
}
