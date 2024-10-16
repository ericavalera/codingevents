package org.launchcode.codingevents.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Objects;

public class Event {
    private int id;
    private static int nextId= 1;
    private Boolean attendeeRegister = true;


    @Min(value= 1, message = "Number of attendess must be a number 1 or more.")
    private int attendees;

    @NotBlank
    @Size(min = 3, max = 50, message = "Location must be between 3 to 50 characters.")
    private String location;

    @Size(max = 500, message = "Description is too long.")
    private String description;

    @NotBlank(message = "Name is required.")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters.")
    private String name;

    @NotBlank(message = "Email is required.")
    @Email(message = "Invalid email, try again.")
    private String contactEmail;

    private EventType type;
    public Event(){
        this.id = nextId;
        nextId ++;
    }

    public Event(String name, String description,String location, String contactEmail, EventType type,
                 Boolean attendeeRegister, int attendees) {
        this();
        this.location = location;
        this.name = name;
        this.description= description;
        this.contactEmail = contactEmail;
        this.type= type;
        this.attendeeRegister = attendeeRegister;
        this.attendees = attendees;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public @Email String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(@Email String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @Override
    public String toString() {
        return "name";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public @NotBlank @Size(min = 3, max = 50) String getLocation() {
        return location;
    }

    public void setLocation(@NotBlank @Size(min = 3, max = 50) String location) {
        this.location = location;
    }

    public Boolean getAttendeeRegister() {
        return attendeeRegister;
    }


    @Min(value = 1, message = "Number of attendess must be a number 1 or more.")
    public int getAttendees() {
        return attendees;
    }

    public void setAttendees(@Min(value = 1, message = "Number of attendess must be a number 1 or more.") int attendees) {
        this.attendees = attendees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
