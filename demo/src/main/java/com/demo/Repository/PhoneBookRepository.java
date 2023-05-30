package com.demo.Repository;

import com.demo.Model.PhoneBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PhoneBookRepository extends JpaRepository<PhoneBook,Long> {
}

