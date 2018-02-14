package dao;

import java.util.List;

public interface Dao<T,PK> {
	
	void insert(T obj);
	
	List<T> findAll();
	
	void update(T obj);
	
	void delete(PK key);
	
	T findByKey(PK key );

}
