package com.spring5.sfgpetclinic.services.map;

import java.util.*;

public class AbstractMapService<T, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(ID id, T t){
        return map.put(id, t);
    }

    public Long getLastId() {
        Long i = Collections.max(map.keySet());
        System.out.println(i);
        return i + 1;
    }
}
