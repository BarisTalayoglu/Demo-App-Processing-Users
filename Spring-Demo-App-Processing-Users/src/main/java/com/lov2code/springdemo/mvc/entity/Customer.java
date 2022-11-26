package com.lov2code.springdemo.mvc.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
    private String firstName;

    @NotNull(message = " is required")
    @Size(min=1, message="is required")
    private String lastName;

    @Max(value=10, message="must be lower than 10")
    @Min(value=0, message="must be bigger than or equals to 0")
    private String freePasses;

    public String getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(String freePasses) {
        this.freePasses = freePasses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
