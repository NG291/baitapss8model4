package com.baitap.model;


import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {
    @NotEmpty
    @Size(min=4 , max=45)
    private String firstName;

    @NotEmpty
    @Size(min=4, max=45)
    private String lastName;

    @NotEmpty
    @Pattern(regexp="^\\d{10}")
    private String numberPhone;

    @Min(value = 18, message = "tuoi phai lon 18")
    private int age;

    public User(){}
    public User(String firstName, String lastName, String numberPhone, int age){
        this.firstName= firstName;
        this.lastName=lastName;
        this.numberPhone=numberPhone;
        this.age=age;
    }

    public @NotEmpty @Size(min = 4, max = 45) String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotEmpty @Size(min = 4, max = 45) String firstName) {
        this.firstName = firstName;
    }

    public @NotEmpty @Size(min = 4, max = 45) String getLastName() {
        return lastName;
    }

    public void setLastName(@NotEmpty @Size(min = 4, max = 45) String lastName) {
        this.lastName = lastName;
    }

    public @NotEmpty @Pattern(regexp = "^\\d{10}") String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(@NotEmpty @Pattern(regexp = "^\\d{10}") String numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Min(value = 18, message = "tuoi phai lon 18")
    public int getAge() {
        return age;
    }

    public void setAge(@Min(value = 18, message = "tuoi phai lon 18") int age) {
        this.age = age;
    }
}
