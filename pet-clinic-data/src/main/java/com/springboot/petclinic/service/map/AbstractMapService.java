package com.springboot.petclinic.service.map;

import com.springboot.petclinic.model.BaseEntity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    public Set<T> findAll(){

        return new HashSet<>(map.values());
    }

    public T findById(ID id){

        return map.get(id);
    }

    public T save(T entity){
        Long id = (long) (map.size() + 1);

        entity.setId(id);
        return map.put(entity.getId(), entity);
    }

    public void deleteById(ID id){
        map.remove(id);
    }

    public void delete(T entity){
        map.entrySet().removeIf(en -> en.getValue().equals(entity));
    }
}
