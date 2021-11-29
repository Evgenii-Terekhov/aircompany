package planes;

import java.util.Objects;

public class PassengerPlaneNameConstructor extends PlaneNameConstructor {

    private int passengersCapacity;

    public PassengerPlaneNameConstructor(String model, int maxSpeed, int maxFlightDistance,
                                         int maxLoadCapacity, int passengersCapacity) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.passengersCapacity = passengersCapacity;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    @Override
    public String toString() {
        return (super.toString().replace("}", ", passengersCapacity="
                + passengersCapacity + "}\n"));
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (!(o instanceof PassengerPlaneNameConstructor)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        PassengerPlaneNameConstructor plane = (PassengerPlaneNameConstructor) o;
        return passengersCapacity == plane.passengersCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengersCapacity);
    }
}
