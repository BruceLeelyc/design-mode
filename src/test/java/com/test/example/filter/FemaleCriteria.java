package com.test.example.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: FemaleCriteria
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 14:46
 */
public class FemaleCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> maleCriteriaPersons = new ArrayList<>();
        for (Person person : persons) {
            String gender = person.getGender();
            if ("female".equalsIgnoreCase(gender)) {
                maleCriteriaPersons.add(person);
            }
        }
        return maleCriteriaPersons;
    }
}
