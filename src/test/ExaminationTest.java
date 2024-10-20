package test;

import main.Doctor;
import main.Examination;
import main.Patient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
class ExaminationTest {
    private Doctor doctor;
    private Patient patient;
    private Examination examination;
    @BeforeEach
    void setUp() {
        doctor = new Doctor.DoctorBuilder()
                .firstName("Jon")
                .lastName("Smit")
                .specialty(Doctor.Specialty.CARDIOLOGY)
                .id(UUID.randomUUID())
                .build();

        UUID patientId = null;
        patient = new Patient(patientId, "Alice", LocalDate.of(24, 10, 20));
        examination = new Examination(doctor, patient, "Flu", LocalDate.of(24, 10, 20), "Room A");
    }
    @Test
    void testExaminationCreation() {
        assertEquals(doctor, examination.getDoctor());
        assertEquals(patient, examination.getPatient());
        assertEquals(examination.getDate(), examination.getDate());
        assertEquals("Room A", examination.getRoom());
    }
    @Test
    void testToString() {
        String expected = "Examination{doctor=" + doctor + ", patient=" + patient + ", date=" + examination.getDate() + ", room='Room A'" + ", diagnosis='Flu'}";
        assertEquals(expected, examination.toString());
    }
    @Test
    void testSetRoom(){
        examination.setRoom("Room B");
        assertEquals("Room B", examination.getRoom());
    }

}