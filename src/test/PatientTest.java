package test;

import main.Patient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class PatientTest {

    private Patient patient1;
    private UUID patientId;

    @BeforeEach
    void setUp() {
        patientId = UUID.randomUUID();
        patient1 = new Patient(patientId, "Alice", new Date(946684800000L), "Flu"); // 2000-01-01
    }

    @Test
    void testPatientCreationWithFullConstructor() {
        assertEquals("Alice", patient1.toString().contains("Alice") ? "Alice" : null);
        assertNotNull(patient1.getPatientId());

    }
}