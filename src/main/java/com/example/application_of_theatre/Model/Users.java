package com.example.application_of_theatre.Model;

public class Users {
    private String  fio, mail, phone, password;

    public Users()
    {

    }

    public Users(String fio, String mail, String phone, String password) {
        this.fio = fio;
        this.mail = mail;
        this.phone = phone;
        this.password = password;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
