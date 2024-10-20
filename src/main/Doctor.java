package main;
import java.util.Objects;
import java.util.UUID;

public class Doctor {
    private final UUID id;
    private String specialty;//enum
    private String firstName;
    private String lastName;

    private Doctor(DoctorBuilder builder) {
        this.id = builder.id != null ? builder.id : UUID.randomUUID();
        this.specialty = builder.specialty;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public UUID getId() {
        return id;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, specialty);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(id, doctor.id) &&
                Objects.equals(firstName, doctor.firstName) &&
                Objects.equals(lastName, doctor.lastName) &&
                Objects.equals(specialty, doctor.specialty);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", specialty='" + specialty + '\'' +
                '}';
    }

    public static class DoctorBuilder {
        private UUID id;
        private String specialty;
        private String firstName;
        private String lastName;

        public DoctorBuilder id(UUID id) {
            this.id = id;
            return this;
        }

        public DoctorBuilder specialty(String specialty) {
            this.specialty = specialty;
            return this;
        }

        public DoctorBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public DoctorBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Doctor build() {
            return new Doctor(this);
        }
    }
}
