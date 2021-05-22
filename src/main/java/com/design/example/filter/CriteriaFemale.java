package com.design.example.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: CriteriaFemale
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 14:13
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePerson = new ArrayList<>();
        for (Person person : persons) {
            String gender = person.getGender();
            if ("FEMALE".equalsIgnoreCase(gender)) {
                femalePerson.add(person);
            }
        }
        return femalePerson;
    }
}
