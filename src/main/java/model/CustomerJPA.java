package model;

import javax.persistence.*;

@Entity
@Table( name = "customerJPA" )

public class CustomerJPA {
    private int id;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;

    public CustomerJPA() {
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "firstname")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Column(name = "lastname")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerJPA)) return false;

        CustomerJPA that = (CustomerJPA) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}


