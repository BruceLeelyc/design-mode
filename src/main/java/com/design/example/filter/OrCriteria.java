package com.design.example.filter;

import java.util.List;

/**
 * @ClassName: OrCriteral
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 14:21
 */
public class OrCriteria implements Criteria {

    private Criteria oneCriteria;
    private Criteria orCriteria;

    OrCriteria(Criteria oneCriteria, Criteria orCriteria) {
        this.oneCriteria = oneCriteria;
        this.orCriteria = orCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> onePersons = oneCriteria.meetCriteria(persons);
        List<Person> orPersons = orCriteria.meetCriteria(persons);
        for (Person orPerson : orPersons) {
            if (!onePersons.contains(orPerson)) {
                onePersons.add(orPerson);
            }
        }
        return onePersons;
    }
}
