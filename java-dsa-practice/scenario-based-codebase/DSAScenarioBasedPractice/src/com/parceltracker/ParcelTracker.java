package com.parceltracker;
class ParcelTracker {

    private Stage head;

    public ParcelTracker() {
        // Default delivery stages
        head = new Stage("Packed");
        head.next = new Stage("Shipped");
        head.next.next = new Stage("In Transit");
        head.next.next.next = new Stage("Delivered");
    }

    // Forward tracking
    public void trackParcel() {
        if (head == null) {
            System.out.println("Parcel missing or lost!");
            return;
        }

        Stage temp = head;
        System.out.print("Parcel Status: ");
        while (temp != null) {
            System.out.print(temp.name + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Add custom checkpoint
    public void addCheckpoint(String after, String newStage) {
        Stage temp = head;

        while (temp != null && !temp.name.equalsIgnoreCase(after)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Stage not found!");
            return;
        }

        Stage node = new Stage(newStage);
        node.next = temp.next;
        temp.next = node;

        System.out.println("Checkpoint added successfully.");
    }

    // Simulate lost parcel
    public void markParcelLost() {
        head = null;
        System.out.println("Parcel marked as lost!");
    }
}
