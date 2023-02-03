package ru.alishev.springcourse.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.alishev.springcourse.models.Person;

import java.util.List;

/**
 * @author Neil Alishev
 */
@Component
public class PersonDAO {


    private final SessionFactory sessionFactory;

    public PersonDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public List<Person> index() {
        Session session = sessionFactory.getCurrentSession();
        List<Person> people = session.createQuery("select p from Person p", Person.class).getResultList();


        return people;
    }

    public Person show(int id) {
        return null;
    }

    public void save(Person person) {
    }

    public void update(int id, Person updatedPerson) {
    }

    public void delete(int id) {
    }
}
