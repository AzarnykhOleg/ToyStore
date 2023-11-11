package com.toy_store.Accessory;
import com.toy_store.Shop.Toy;
import java.util.Collection;

public interface Lototron<T extends Toy> {
    
    public Integer GetRandom(Collection<T> collection);
}
