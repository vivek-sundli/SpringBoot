package com.demo.ServiceImpl;
import java.util.NoSuchElementException;
import com.demo.Model.PhoneBook;
import com.demo.Repository.PhoneBookRepository;
import com.demo.Service.PhoneBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

//service connects database to Controller/User
@Service
public class PhoneBookImpl implements PhoneBookService {
    @Autowired
    PhoneBookRepository phoneBookRepository;



    @Override
    public PhoneBook getPhoneBook(long id) throws NoSuchElementException {
        return phoneBookRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("PhoneBook not found with id: " + id));
    }

    public void addPhoneBook(PhoneBook phoneBook){
        phoneBookRepository.save(phoneBook);
        //System.out.println(phoneBook.toString());
    }
}
