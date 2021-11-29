package planes;

import models.MilitaryType;

import java.util.Objects;

public class MilitaryPlaneNameConstructor extends PlaneNameConstructor {

    private MilitaryType typeOfPlane;

    public MilitaryPlaneNameConstructor(String model, int maxSpeed, int maxFlightDistance,
                                        int maxLoadCapacity, MilitaryType typeOfPlane) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.typeOfPlane = typeOfPlane;
    }

    public MilitaryType getType() {
        return typeOfPlane;
    }

    @Override
    public String toString() {
        return (super.toString().replace("}", ", typeOfPlane=" + typeOfPlane + "}\n"));
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (!(o instanceof MilitaryPlaneNameConstructor)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        MilitaryPlaneNameConstructor that = (MilitaryPlaneNameConstructor) o;
        return typeOfPlane == that.typeOfPlane;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfPlane);
    }
}
