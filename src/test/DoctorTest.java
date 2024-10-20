package test;

import main.Doctor;
import main.Patient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.print.Doc;

import java.security.cert.Extension;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class DoctorTest{
    private Doctor doctor1;
    private Doctor doctor2;
    @BeforeEach
    void setUp(){
        doctor1 = new Doctor.DoctorBuilder()
                .id(UUID.randomUUID())
                .specialty("Neurology")
                .firstName("John")
                .lastName("S")
                .build();
        doctor2 = new Doctor.DoctorBuilder()
                .firstName("Jane")
                .lastName("N")
                .specialty("Cardiology")
                .id(UUID.randomUUID())
                .build();
    }
    @Test
    void testDoctorCreation(){
        assertNotNull(doctor1.getId());
        assertEquals(doctor1.getSpecialty(), "Neurology");
        assertEquals(doctor1.getFirstName(), "John");
        assertEquals(doctor1.getLastName(), "S");
    }
    @Test
    void testGetAndSet(){
        doctor1.setFirstName("Lina");
        assertEquals(doctor1.getFirstName(), "Lina");
        doctor1.setLastName("Miracle");
        assertEquals(doctor1.getLastName(), "Miracle");
        doctor1.setSpecialty("Cardiology");
        assertEquals(doctor1.getSpecialty(), "Cardiology");
    }
    @Test
    void testEqualsAndHash(){
        Doctor doctor3 = new Doctor.DoctorBuilder()
                .id(doctor1.getId())
                .specialty("Neurology")
                .firstName("John")
                .lastName("S")
                .build();
        assertEquals(doctor1, doctor3);
        assertEquals(doctor1.hashCode(), doctor3.hashCode());
        assertNotEquals(doctor3, doctor2);
    }
    @Test
    void testToString(){
        String expected  = "Doctor{id=" + doctor1.getId() + ", firstName='John'" + ", lastName='S'" + ", specialty='Neurology'}";
        assertEquals(expected , doctor1.toString());
    }
}