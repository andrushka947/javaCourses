package com.notebook.model;

public class Address {
    private int index;
    private String city;
    private String street;
    private int houseNumber;
    private int flatNumber;

    public Address() {}

    public Address(int index, String city, String street, int houseNumber, int flatNumber) {
        this.index = index;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }
/*
    public static Builder newBuilder() {
        return new Address().new Builder();
    }
    public class Builder {
        private Builder(){};

        public Builder setIndex(int index) {
            Address.this.index = index;
            return this;
        }
        public Builder setCity(String city) {
            Address.this.city = city;
            return this;
        }
        public Builder setStreet(String street) {
            Address.this.street = street;
            return this;
        }
        public Builder setHouseNumber(int houseNumber) {
            Address.this.houseNumber = houseNumber;
            return this;
        }
        public Builder setFlatNumber(int flatNumber) {
            Address.this.flatNumber = flatNumber;
            return this;
        }
        public Address build() {
            return Address.this;
        }

    }

*/

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

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
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
                ", houseNumber=" + houseNumber +
                ", flatNumber=" + flatNumber +
                '}';
    }
}
