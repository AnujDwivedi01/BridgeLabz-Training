package com.inheritance.hybridinheritance.problem1;

class Chef extends Person implements Worker {

    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " is preparing delicious dishes.");
    }
}
