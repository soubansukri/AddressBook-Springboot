package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressBookController {
    @GetMapping("/get/{SlNo}")
    public ResponseEntity<String> getEmployeePayrollData(@PathVariable("slNo.") int slNo) {
        return new ResponseEntity<String>("Get Call Success for SlNo.:" + slNo, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> addAddress(@RequestBody AddressBookDTO addressBookDTO) {
        return new ResponseEntity<String>("Created Address : " + addressBookDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateEmployeePayrollData(@RequestBody AddressBookDTO addressBookDTO){
        return new ResponseEntity<String>("Updated address:"+ addressBookDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{slNo}")
    public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("slNo.") int slNo){
        return new ResponseEntity<String>("Delete call success for slNo:"+ slNo, HttpStatus.OK);
    }
}
