package org.launchcode.codingevents.models;

public class Event {
    private String description;
    private String name;

    public Event(String name, String description) {
        this.name = name;
        this.description= description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
