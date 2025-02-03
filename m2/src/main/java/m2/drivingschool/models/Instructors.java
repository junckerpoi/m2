package m2.drivingschool.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Instructors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer instructorId;

    @OneToOne
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private Users users;

    private String licenseNumber; // Teaching license

    @Enumerated(EnumType.STRING)
    private InstructorType instructorType;

    public enum InstructorType {
        THEORY,
        PRACTICAL,
    }

    public Integer getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(Integer instructorId) {
        this.instructorId = instructorId;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public InstructorType getInstructorType() {
        return instructorType;
    }

    public void setInstructorType(InstructorType instructorType) {
        this.instructorType = instructorType;
    }

}
