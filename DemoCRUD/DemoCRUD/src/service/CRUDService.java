package service;

import java.util.List;

public interface CRUDService<T> {
    List<T> getAll();
    T getById(String id);
    void delete(String id);
    void update(T t);
}
