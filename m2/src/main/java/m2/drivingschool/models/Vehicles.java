package m2.drivingschool.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class Vehicles {
    @Id
    private String vehicleId;

    @Enumerated(EnumType.STRING)
    private VehicleType vehicleType;

    private String licensePlate;

    @Enumerated(EnumType.STRING)
    private VehicleStatus vehicleStatus;

    public enum VehicleType {
        CAR,
        TRUCK,
        BIKE,
    }

    public enum VehicleStatus {
        AVAILABLE,
        MAINTAINANCE,
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

}