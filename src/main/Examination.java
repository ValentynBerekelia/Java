package main;

import main.Doctor;
import main.Patient;

import java.time.LocalDate;
import java.util.Objects;


public class Examination {
    private final Doctor doctor;
    private final Patient patient;
    private final String diagnosis;
    private final LocalDate date;//local date
    private String room;


    public Examination(Doctor doctor, Patient patient,String diagnosis, LocalDate date, String room) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.room = room;
        this.diagnosis = diagnosis;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    private String getDiagnosis(){return diagnosis;}

    public LocalDate getDate() {
        return date;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Examination that = (Examination) o;
        return Objects.equals(doctor, that.doctor) &&
                Objects.equals(patient, that.patient) &&
                Objects.equals(date, that.date) &&
                Objects.equals(room, that.room) &&
                Objects.equals(diagnosis, that.diagnosis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doctor, patient, date, room,diagnosis);
    }

    @Override
    public String toString() {
        return "Examination{" +
                "doctor=" + doctor +
                ", patient=" + patient +
                ", date=" + date +
                ", room='" + room + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
