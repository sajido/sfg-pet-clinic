package com.spring5.sfgpetclinic.services.map;

import com.spring5.sfgpetclinic.model.BaseEntity;

import java.util.*;

public class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T t){
        t.setId(getLastId());
        return map.put(t.getId(), t);
    }

    private Long getLastId() {
        Long i;
        try{
            i = Collections.max(map.keySet());
            System.out.println(i);
            i++;
        }catch (NoSuchElementException e){
            i = 1L;
        }

        return i;
    }
}
