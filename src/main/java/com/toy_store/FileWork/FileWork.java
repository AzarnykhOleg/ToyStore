package com.toy_store.FileWork;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.toy_store.Shop.ToyController;

public interface FileWork<T extends ToyController> {
    
    public T ReadFile(String fileName) throws IOException, FileNotFoundException;
    public void WriteFile(String fileName, T toys) throws IOException;
}
