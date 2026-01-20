package com.queueinterface;
class CircularBuffer {

    private int[] buffer;
    private int size;
    private int front;
    private int rear;
    private int count;

    CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
        front = 0;
        rear = 0;
        count = 0;
    }

    // Insert element (overwrite if full)
    public void insert(int data) {

        // If buffer is full, overwrite oldest
        if (count == size) {
            front = (front + 1) % size;
        } else {
            count++;
        }

        buffer[rear] = data;
        rear = (rear + 1) % size;
    }

    // Display buffer content in logical order
    public void display() {

        if (count == 0) {
            System.out.println("Buffer is empty");
            return;
        }

        System.out.print("Buffer: [");
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(front + i) % size]);
            if (i < count - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display();

        cb.insert(4);   // overwrites 1
        cb.display();
    }
}
