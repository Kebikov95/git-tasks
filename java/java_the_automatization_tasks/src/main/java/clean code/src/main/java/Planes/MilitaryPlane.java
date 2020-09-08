package Planes;

import models.MilitaryType;

import java.util.List;
import java.util.Objects;

public class MilitaryPlane extends Plane {
    private final MilitaryType type;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType type) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
    }

    public MilitaryType getType() {
        return type;
    }

    public boolean isTransportMilitaryPlane(List<MilitaryPlane> transportMilitaryPlanes) {
        boolean isMilitary = false;
        for (MilitaryPlane militaryPlane : transportMilitaryPlanes) {
            if ((militaryPlane.getType() == MilitaryType.TRANSPORT)) {
                isMilitary = true;
                break;
            }
        }
        return isMilitary;
    }

    public void isAtLeastOneBomber(List<MilitaryPlane> transportMilitaryPlanes) {
        boolean hasAtLeastOneBomber = false;
        for (MilitaryPlane militaryPlane : transportMilitaryPlanes) {
            if ((militaryPlane.getType() == MilitaryType.BOMBER)) {
                hasAtLeastOneBomber = true;
            }
        }
        return hasAtLeastOneBomber;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + type +
                        '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MilitaryPlane)) return false;
        if (!super.equals(o)) return false;
        MilitaryPlane that = (MilitaryPlane) o;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}