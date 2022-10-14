package com.bridgelabz.addressbook.dto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressBookDTO {
public String name;
public long doorNumber;
public String area;
public long pincode;

    @Override
    public String toString() {
        return "AddressBookDTO{" +
                "name='" + name + '\'' +
                ", doorNumber=" + doorNumber +
                ", area='" + area + '\'' +
                ", pincode=" + pincode +
                '}';
    }

    public AddressBookDTO(String name, long doorNumber, String area, long pincode) {
        this.name = name;
        this.doorNumber = doorNumber;
        this.area = area;
        this.pincode = pincode;
    }

    public AddressBookDTO() {
        name=null;
        doorNumber=0;
        area=null;
        pincode=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(long doorNumber) {
        this.doorNumber = doorNumber;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public long getPincode() {
        return pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }
}
