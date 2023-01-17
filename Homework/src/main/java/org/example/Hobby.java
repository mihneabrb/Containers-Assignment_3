package org.example;
import java.util.List;

class Hobby {
    public String name;
    public int frequency;
    private List<String> addresses;
    public Hobby(String name, int frequency, List<String> addresses) {
        this.name = name;
        this.frequency = frequency;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }

    public String toString() {
        return "Hobby(name=" + name + ", frequency=" + frequency + ", addresses=" + addresses + ")"
    ;}
}
