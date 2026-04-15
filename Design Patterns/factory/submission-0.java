interface Vehicle {
    String getType();
}

class Car implements Vehicle {
    @Override
    public String getType() {
        return "Car";
    }
}

class Bike implements Vehicle {
    @Override
    public String getType() {
        return "Bike";
    }
}

class Truck implements Vehicle {
    @Override
    public String getType() {
        return "Truck";
    }
}

abstract class VehicleFactory {
    abstract Vehicle createVehicle();
}

class CarFactory extends VehicleFactory {
    public Vehicle createVehicle(){
        Vehicle obj = new Car();
        return obj;

    }
}

class BikeFactory extends VehicleFactory {
    public Vehicle createVehicle(){
        Vehicle obj = new Bike();
        return obj;

    }
}

class TruckFactory extends VehicleFactory {
    public Vehicle createVehicle(){
        Vehicle obj = new Truck();
        return obj;

    }
}
