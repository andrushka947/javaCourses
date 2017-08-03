package com.notebook.model.entity;

import com.notebook.model.Address;
import com.notebook.model.Group;

import java.time.LocalDateTime;

public class Note {

    private String name;
    private String surname;
    private String secondName;
    private String nickName;
    private Group group;
    private String homeNumber;
    private String mobileNumber;
    private String mobileNumber2;
    private String email;
    private String skype;
    private LocalDateTime saveDate;
    private LocalDateTime lastChangeDate;
    private Address address;

    public Note(){
        saveDate = LocalDateTime.now();
        lastChangeDate = LocalDateTime.now();
    }


    public static Builder newBuilder(){
        return new Note().new Builder();
    }
    public class Builder {
        private Builder(){}

        public Builder setName(String name) {
            Note.this.name = name;
            return this;
        }
        public Builder setSurname(String surname) {
            Note.this.surname = surname;
            return this;
        }
        public Builder setSecondName(String secondName) {
            Note.this.secondName = secondName;
            return this;
        }
        public Builder setNickName(String nickName) {
            Note.this.nickName = nickName;
            return this;
        }
        public Builder setGroup(Group group) {
            Note.this.group = group;
            return this;
        }
        public Builder setHomeNumber(String homeNumber) {
            Note.this.homeNumber = homeNumber;
            return this;
        }
        public Builder setMobileNumber(String mobileNumber) {
            Note.this.mobileNumber = mobileNumber;
            return this;
        }
        public Builder setMobileNumber2(String mobileNumber2) {
            Note.this.mobileNumber2 = mobileNumber2;
            return this;
        }
        public Builder setEmail(String email) {
            Note.this.email= email;
            return this;
        }
        public Builder setSkype(String skype) {
            Note.this.skype = skype;
            return this;
        }
        public Builder setAddress(Address address) {
            Note.this.address = address;
            return this;
        }
        public Note build() {
            return Note.this;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.lastChangeDate = LocalDateTime.now();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
        this.lastChangeDate = LocalDateTime.now();
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
        this.lastChangeDate = LocalDateTime.now();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
        this.lastChangeDate = LocalDateTime.now();
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
        this.lastChangeDate = LocalDateTime.now();
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
        this.lastChangeDate = LocalDateTime.now();
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        this.lastChangeDate = LocalDateTime.now();
    }

    public String getMobileNumber2() {
        return mobileNumber2;
    }

    public void setMobileNumber2(String mobileNumber2) {
        this.mobileNumber2 = mobileNumber2;
        this.lastChangeDate = LocalDateTime.now();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        this.lastChangeDate = LocalDateTime.now();
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
        this.lastChangeDate = LocalDateTime.now();
    }

    public LocalDateTime getSaveDate() {
        return saveDate;
    }

    public void setSaveDate(LocalDateTime saveDate) {
        this.saveDate = saveDate;
        this.lastChangeDate = LocalDateTime.now();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
        this.lastChangeDate = LocalDateTime.now();
    }

    public LocalDateTime getLastChangeDate() {
        return lastChangeDate;
    }

    public void setLastChangeDate(LocalDateTime lastChangeDate) {
        this.lastChangeDate = lastChangeDate;
    }

    @Override
    public String toString() {
        return "Note{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", secondName='" + secondName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", group=" + group +
                ", homeNumber='" + homeNumber + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", mobileNumber2='" + mobileNumber2 + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", saveDate=" + saveDate +
                ", lastChangeDate=" + lastChangeDate +
                ", address=" + address +
                '}';
    }
}
