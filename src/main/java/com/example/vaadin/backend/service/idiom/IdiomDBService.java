package com.example.vaadin.backend.service.idiom;


import com.example.vaadin.backend.model.Idiom;
import com.example.vaadin.backend.repository.IdiomDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IdiomDBService {

    @Autowired
    private IdiomDao idiomDao;


    public void saveIdiomListToDb(List<Idiom> idiomList){
        idiomDao.saveAllIdioms(idiomList);
    }


}
