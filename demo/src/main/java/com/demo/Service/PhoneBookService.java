package com.demo.Service;

import com.demo.Model.PhoneBook;

public interface PhoneBookService {
    Object getPhoneBook(long id) throws Exception;
    void addPhoneBook(PhoneBook phoneBook);
}
