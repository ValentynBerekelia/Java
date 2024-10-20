package test;

import main.Patient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class PatientTest {

    private Patient patient1;

    @BeforeEach
    void setUp() {
        UUID patientId = UUID.randomUUID();
        patient1 = new Patient(patientId, "Alice",LocalDate.of(24,10,20));
    }

    @Test
    void testPatientCreationWithFullConstructor() {
        assertEquals("Alice", patient1.toString().contains("Alice") ? "Alice" : null);
        assertNotNull(patient1.getPatientId());

    }
}