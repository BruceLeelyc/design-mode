package com.test.example.filter;

import java.util.List;

/**
 * @ClassName: OrCriteria
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 14:49
 */
public class OrCriteria implements Criteria {

    private Criteria oneCriteria;
    private Criteria orCriteria;

    public OrCriteria(Criteria oneCriteria, Criteria orCriteria) {
        this.oneCriteria = oneCriteria;
        this.orCriteria = orCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> oneCriteriaPersons = oneCriteria.meetCriteria(persons);
        List<Person> orCriteriaPersons = orCriteria.meetCriteria(persons);
        for (Person orCriteriaPerson : orCriteriaPersons) {
            if (!oneCriteriaPersons.contains(orCriteriaPerson)) {
                oneCriteriaPersons.add(orCriteriaPerson);
            }
        }
        return oneCriteriaPersons;
    }
}
