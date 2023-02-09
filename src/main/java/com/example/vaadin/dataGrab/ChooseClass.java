package com.example.vaadin.dataGrab;

import com.example.vaadin.dataGrab.idiom.*;
import com.example.vaadin.dataGrab.phrasal.PhrasalVerbsImpl;
import com.example.vaadin.inter.DataGrabberAngPl;


public class ChooseClass {

    private final PhrasalVerbsImpl phrasalVerbs;
    private final IdiomImpl idiom;
    private final DefaultImplAngPl defaultImplAngPl;

    public ChooseClass(PhrasalVerbsImpl phrasalVerbs, IdiomImpl idiom, DefaultImplAngPl defaultImplAngPl) {
        this.phrasalVerbs = phrasalVerbs;
        this.idiom = idiom;
        this.defaultImplAngPl = defaultImplAngPl;
    }

    public DataGrabberAngPl getRightImpl(String kind) {

        if (kind == null) {
            return defaultImplAngPl;
        } else if (kind.equals("idiom")) {
            return idiom;
        } else if (kind.equals("phrasal")) {
            return phrasalVerbs;
        } else
            return defaultImplAngPl;
    }


}
