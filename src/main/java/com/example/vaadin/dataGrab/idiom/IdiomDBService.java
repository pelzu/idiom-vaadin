package com.example.vaadin.dataGrab.idiom;


import com.example.vaadin.model.idiom.Idiom;
import com.example.vaadin.model.idiom.IdiomDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IdiomDBService {

    @Autowired
    private IdiomDao idiomDao;


    public void saveIdiomListToDb(List<Idiom> idiomList){
        idiomDao.saveAllIdioms(idiomList);
    }


}
