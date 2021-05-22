package com.design.example.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: CriteriaSingle
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 14:16
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons) {
            String maritalStatus = person.getMaritalStatus();
            if ("SINGLE".equalsIgnoreCase(maritalStatus)) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
