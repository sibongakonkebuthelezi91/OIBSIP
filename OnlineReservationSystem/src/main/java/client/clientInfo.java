package client;

import java.time.LocalDate;

public class clientInfo {
    private String name;
    private String surname;
    private String email;
    private LocalDate birthDate;
    private char Initial;
    private String password;
    private String city;
    private String country;

    public  clientInfo(String name,
                       String surname,
                       String email,
                       LocalDate birthDate,
                       String password,
                       String city,
                       String country) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birthDate = birthDate;
        this.password = password;
        this.city = city;
        this.country = country;
    }


    public clientInfo(){}

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




    public char getInitial() {
        return Initial;
    }

    public void setInitial(char initial) {
        Initial = initial;
    }
}
