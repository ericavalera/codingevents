package org.launchcode.codingevents.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Objects;

@Entity
public class EventCategory extends AbstractEntity {


    @NotBlank(message = "Name is required.")
    @Size(min=3, message="Name must be at least 3 characters long.")
    private String name;

    public EventCategory( String name) {

        this.name = name;
    }

    public EventCategory() {}


    public @NotBlank(message = "Name is required.") @Size(min = 3, message = "Name must be at least 3 characters long.") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Name is required.") @Size(min = 3, message = "Name must be at least 3 characters long.") String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }

    }






