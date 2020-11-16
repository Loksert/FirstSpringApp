package org.example.NNG.config.DAO;

import org.example.NNG.config.models.Person;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.ArrayList;

@Component
public class PersonDAO {
    private List<Person> people;
    private int PEOPLE_COUNT = 0;
    {
        people = new ArrayList<>();
        people.add(new Person("Regina",++PEOPLE_COUNT));
        people.add(new Person("Eva",++PEOPLE_COUNT));
        people.add(new Person("Damon",++PEOPLE_COUNT));
    }

    public List<Person> index(){
        return  people;
    }

    public Person show(int id){
        return people.stream().filter(Person->Person.getId()==id).findAny().orElse(null);
    }

    public void save(Person person){
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

}
