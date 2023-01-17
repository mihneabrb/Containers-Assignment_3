package org.example;

class Person {
    public String name;
    public int age;
    public Hobby hobby;
    public String address;
    public Person(String name, int age, Hobby hobby, String address) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Hobby getHobby() {
        return hobby;
    }

    public void setHobby(Hobby hobby) {
        this.hobby = hobby;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Person(name=" + name + ", age=" + age + ", hobby=" + hobby + ", address=" + address + ")";
    }
}
