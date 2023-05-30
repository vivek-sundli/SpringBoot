package com.demo.Controller;

import com.demo.Model.PhoneBook;
import com.demo.Service.PhoneBookService;
import com.demo.ServiceImpl.PhoneBookImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
public class PhoneBookController {
    @Autowired
    PhoneBookService phoneBookimpl;
    @GetMapping("/test")
    String getContacts(){
        return "test";
    }
    @GetMapping("/test1")
    PhoneBook getContact() {
        try {
            return phoneBookimpl.getPhoneBook(12);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/post")
    String addPhoneBook(@RequestBody PhoneBook phoneBook){
        phoneBookimpl.addPhoneBook(phoneBook);
        return "Success";
    }
}


