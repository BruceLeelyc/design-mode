package com.test.example.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: MaleCriteria
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 14:44
 */
public class MaleCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> maleCriteriaPersons = new ArrayList<>();
        for (Person person : persons) {
            String gender = person.getGender();
            if ("male".equalsIgnoreCase(gender)) {
                maleCriteriaPersons.add(person);
            }
        }
        return maleCriteriaPersons;
    }
}
