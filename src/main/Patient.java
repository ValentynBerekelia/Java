package main;
import java.time.LocalDate;
import java.util.UUID;
import java.util.Objects;
public class Patient {
    private final UUID patientId;
    private String name;
    private LocalDate dateOfBirth;//

    public Patient(UUID patientId) {
        this.patientId = patientId;
    }
    public Patient(UUID patientId, String name, LocalDate dateOfBirth) {
        this.patientId = patientId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
    public UUID getPatientId() {
        return patientId;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return patientId == patient.patientId &&
                Objects.equals(name, patient.name) &&
                Objects.equals(dateOfBirth, patient.dateOfBirth);
    }
    @Override
    public int hashCode() {
        return Objects.hash(patientId, name, dateOfBirth);
    }

}
