package iwork.dao;

import java.util.List;

interface Dao<T> {
	public T create(T obj);
	public T update(T obj);
	public boolean delete(int id);
	public List<T> list();
	public T find(int id);
	

}
