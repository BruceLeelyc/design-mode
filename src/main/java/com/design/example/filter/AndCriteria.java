package com.design.example.filter;

import java.util.List;

/**
 * @ClassName: AndCriteria
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 14:18
 */
public class AndCriteria implements Criteria {

    private Criteria firstCriteria;
    private Criteria andCriteria;

    AndCriteria(Criteria firstCriteria, Criteria twoCriteria) {
        this.firstCriteria = firstCriteria;
        this.andCriteria = twoCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstPersons = firstCriteria.meetCriteria(persons);
        List<Person> twoPersons = andCriteria.meetCriteria(firstPersons);
        return twoPersons;
    }
}
