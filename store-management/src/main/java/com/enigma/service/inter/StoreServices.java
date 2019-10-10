package com.enigma.service.inter;

import com.enigma.entity.Store;

import java.util.List;

public interface StoreServices {
    public Store save(Store store);
    public Store getStore(Integer id);
    public List<Store> getAll(Store store);
    public List<Store> searcheByName(String name);
    public void deleteStore(Integer id);
/*    public List<Store> searcheByName(String);
    public void delete(Integer id);*/
}
