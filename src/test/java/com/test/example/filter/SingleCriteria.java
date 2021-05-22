package com.test.example.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: SingleCriteria
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 14:47
 */
public class SingleCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> maleCriteriaPersons = new ArrayList<>();
        for (Person person : persons) {
            String gender = person.getMaritalStatus();
            if ("single".equalsIgnoreCase(gender)) {
                maleCriteriaPersons.add(person);
            }
        }
        return maleCriteriaPersons;
    }
}
