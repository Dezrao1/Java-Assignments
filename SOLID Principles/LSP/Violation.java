class Vehicle {
    public void startEngine() {
        System.out.println("Engine started");
    }
}

class Bicycle extends Vehicle {
    @Override
    public void startEngine() {
        throw new UnsupportedOperationException("Bicycles don't have engines!"); // ❌ Violation
    }
}
