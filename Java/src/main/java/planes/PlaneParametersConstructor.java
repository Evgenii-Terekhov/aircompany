package planes;

import java.util.Objects;

public class ConstructorParametersPlane {

    String model;
    private final int maxSpeed;
    private final int maxFlightDistance;
    private final int maxLoadCapacity;

    public PlaneNameConstructor(String model, int maxSpeed, int maxFlightDistance,
                                int maxLoadCapacity) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxFlightDistance() {
        return maxFlightDistance;
    }

    public int getManLoadCapacity() {
        return this.maxLoadCapacity;
    }

    @Override
    public String toString() {
        return ("planes.PlaneNameConstructor {model='" + model + "', maxSpeed=" + maxSpeed
                + ", maxFlightDistance=" + maxFlightDistance
                + ", maxLoadCapacity=" + maxLoadCapacity + '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PlaneNameConstructor)) {
            return false;
        }
        PlaneNameConstructor planeNameConstructor = (PlaneNameConstructor) o;
        return (maxSpeed == planeNameConstructor.maxSpeed &&
                maxFlightDistance == planeNameConstructor.maxFlightDistance &&
                maxLoadCapacity == planeNameConstructor.maxLoadCapacity &&
                Objects.equals(model, planeNameConstructor.model));
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
    }
}
