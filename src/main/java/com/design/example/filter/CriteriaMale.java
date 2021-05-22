package com.design.example.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: CriteriaMale
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 14:11
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            String gender = person.getGender();
            if ("MALE".equalsIgnoreCase(gender)) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
