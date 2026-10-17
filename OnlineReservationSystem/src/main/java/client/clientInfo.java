package client;

import java.time.LocalDate;

public class clientInfo {
    private String name;
    private String surname;
    private String email;
    private LocalDate birthDate;
    private String gender;
    private char Initial;

    public  clientInfo(String name, String surname, String email, LocalDate birthDate, String gender) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birthDate = birthDate;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public char getInitial() {
        return Initial;
    }

    public void setInitial(char initial) {
        Initial = initial;
    }
}
