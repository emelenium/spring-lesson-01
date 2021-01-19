package ru.education.lessons.service;

import ru.education.lessons.dao.PersonDao;
import ru.education.lessons.domain.Person;

public class PersonServiceImpl implements PersonService{
    private final PersonDao dao;

    public PersonServiceImpl(PersonDao dao) {
        this.dao = dao;
    }

    @Override
    public Person getByName(String name) {
        return dao.findByName(name);
    }
}
