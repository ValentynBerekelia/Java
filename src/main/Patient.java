package main;
import java.util.Date;
import java.util.UUID;
import java.util.Objects;
public class Patient {
    private final UUID patientId;
    private String name;
    private Date dateOfBirth;//
    private String diagnosis;//винести в exam.

    public Patient(UUID patientId) {
        this.patientId = patientId;
    }
    public Patient(UUID patientId, String name, Date dateOfBirth, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.diagnosis = diagnosis;
    }
    public Patient(String name, String diagnosis) {
        this.patientId = UUID.randomUUID();
        this.name = name;
        this.diagnosis = diagnosis;
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
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return patientId == patient.patientId &&
                Objects.equals(name, patient.name) &&
                Objects.equals(dateOfBirth, patient.dateOfBirth) &&
                Objects.equals(diagnosis, patient.diagnosis);
    }
    @Override
    public int hashCode() {
        return Objects.hash(patientId, name, dateOfBirth, diagnosis);
    }

}
