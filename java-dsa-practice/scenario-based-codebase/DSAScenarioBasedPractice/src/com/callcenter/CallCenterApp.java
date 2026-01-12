package com.callcenter;
public class CallCenterApp {
    public static void main(String[] args) {

        CallCenterManager manager = new CallCenterManager();

        Customer c1 = new Customer("Cust101", false);
        Customer c2 = new Customer("Cust102", true);
        Customer c3 = new Customer("Cust103", false);
        Customer c4 = new Customer("Cust104", true);

        manager.receiveCall(c1);
        manager.receiveCall(c2);
        manager.receiveCall(c3);
        manager.receiveCall(c4);

        manager.handleNextCall();
        manager.handleNextCall();
        manager.handleNextCall();
        manager.handleNextCall();
        manager.handleNextCall();

        manager.displayCallCounts();
    }
}
