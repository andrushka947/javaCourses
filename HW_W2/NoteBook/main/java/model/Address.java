package model;

public class Address {
    private int index;
    private String city;
    private String street;
    private int house_Number;
    private int flatNumber;

    public Address() {}

    public Address(int index, String city, String street, int house_Number, int flatNumber) {
        this.index = index;
        this.city = city;
        this.street = street;
        this.house_Number = house_Number;
        this.flatNumber = flatNumber;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse_Number() {
        return house_Number;
    }

    public void setHouse_Number(int house_Number) {
        this.house_Number = house_Number;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "index=" + index +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house_Number=" + house_Number +
                ", flatNumber=" + flatNumber +
                '}';
    }
}
