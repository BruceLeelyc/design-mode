package com.test.example.filter;

import java.util.List;

/**
 * @ClassName: AndCriteria
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 14:47
 */
public class AndCriteria implements Criteria {

    private Criteria oneCriteria;
    private Criteria andCriteria;

    public AndCriteria(Criteria oneCriteria, Criteria andCriteria) {
        this.oneCriteria = oneCriteria;
        this.andCriteria = andCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> oneCriteriaPersons = oneCriteria.meetCriteria(persons);
        List<Person> andCriteria = this.andCriteria.meetCriteria(oneCriteriaPersons);
        return andCriteria;
    }
}
