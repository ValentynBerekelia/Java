package test;

import main.Doctor;
import main.Examination;
import main.Patient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;
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
                .specialty("Cardiology")
                .id(UUID.randomUUID())
                .build();
        patient = new Patient("Alice","Flu");
        examination = new Examination(doctor, patient, new Date(), "Room A");
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
        String expected = "Examination{doctor=" + doctor + ", patient=" + patient + ", date=" + examination.getDate() + ", room='Room A'}";
        assertEquals(expected, examination.toString());
    }
    @Test
    void testSetRoom(){
        examination.setRoom("Room B");
        assertEquals("Room B", examination.getRoom());
    }

}