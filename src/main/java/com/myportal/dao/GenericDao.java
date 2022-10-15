package com.myportal.dao;

import java.util.List;
import java.util.Optional;

public interface GenericDao<T> {

	Optional<T> get(long id);
    
    List<T> getAll(Class t);
    
    void save(T t);
    
    void update(T t);
    
    void delete(T t);

}
