package main;

import main.Doctor;
import main.Patient;

import java.util.Date;
import java.util.Objects;


public class Examination {
    private final Doctor doctor;
    private final Patient patient;
    private final Date date;//local date
    private String room;

    public Examination(Doctor doctor, Patient patient, Date date, String room) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.room = room;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public Date getDate() {
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
                Objects.equals(room, that.room);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doctor, patient, date, room);
    }

    @Override
    public String toString() {
        return "Examination{" +
                "doctor=" + doctor +
                ", patient=" + patient +
                ", date=" + date +
                ", room='" + room + '\'' +
                '}';
    }
}
