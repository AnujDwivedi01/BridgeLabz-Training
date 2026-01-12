package com.ambulanceroute;

class AmbulanceRoute {
	private HospitalUnit head = null;

	// Add unit to circular list
	public void addUnit(String name, boolean available) {
		HospitalUnit newUnit = new HospitalUnit(name, available);

		if (head == null) {
			head = newUnit;
			newUnit.next = head;
		} else {
			HospitalUnit temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			temp.next = newUnit;
			newUnit.next = head;
		}
	}

	// Find nearest available unit
	public void findAvailableUnit() {
		if (head == null) {
			System.out.println("No hospital units available.");
			return;
		}

		HospitalUnit temp = head;
		do {
			System.out.println("Checking unit: " + temp.name);
			if (temp.available) {
				System.out.println("✅ Patient redirected to: " + temp.name);
				return;
			}
			temp = temp.next;
		} while (temp != head);

		System.out.println("❌ No available units found.");
	}

	// Remove unit under maintenance
	public void removeUnit(String unitName) {
		if (head == null)
			return;

		HospitalUnit curr = head;
		HospitalUnit prev = null;

		do {
			if (curr.name.equals(unitName)) {
				// Only one node
				if (curr == head && curr.next == head) {
					head = null;
				}
				// Removing head
				else if (curr == head) {
					HospitalUnit last = head;
					while (last.next != head) {
						last = last.next;
					}
					head = head.next;
					last.next = head;
				}
				// Removing middle/last node
				else {
					prev.next = curr.next;
				}
				System.out.println("🛠 Unit removed (Maintenance): " + unitName);
				return;
			}
			prev = curr;
			curr = curr.next;
		} while (curr != head);

		System.out.println("Unit not found: " + unitName);
	}

	// Display hospital route
	public void displayUnits() {
		if (head == null) {
			System.out.println("No units in route.");
			return;
		}

		HospitalUnit temp = head;
		System.out.print("Hospital Route: ");
		do {
			System.out.print(temp.name + " → ");
			temp = temp.next;
		} while (temp != head);
		System.out.println("(Back to Emergency)");
	}
}