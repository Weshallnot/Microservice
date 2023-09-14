package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    List<Contact> list=List.of(
            new Contact(1L,"vi@gmail.com","Vishal",1311L),
            new Contact(2L,"vishal@gmail.com","Vishal patil",1312L),
            new Contact(3L,"vishalP@gmail.com","Vishal k patil",1313L),
            new Contact(4L,"vi1@gmail.com","Vishal p",1311L)
    );

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        // TODO Auto-generated method stub
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }

}
