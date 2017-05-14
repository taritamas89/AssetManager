package com.assetmanager.service;

import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public interface GenericService<T, ID extends Serializable> {
    public default Iterable<T> findAll() {
        return getRepository().findAll();
    }

    public default T get(ID id) {
        return getRepository().findOne(id);
    }

    public default T save(T entity) {
        return getRepository().save(entity);
    }

    public default void delete(ID id) {
        if (getRepository().exists(id)) {
            getRepository().delete(id);
        } else {
            //LOG
        }
    }

    public default void update(T entity) {
        if (getRepository().exists((ID) getId(entity))) {
            getRepository().save(entity);
        } else {
            //LOG
        }
    }

    public Long getId(T entity);

    public CrudRepository<T, ID> getRepository();
}
