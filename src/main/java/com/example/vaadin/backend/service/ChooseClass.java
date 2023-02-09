package com.example.vaadin.backend.service;

import com.example.vaadin.backend.service.idiom.*;
import com.example.vaadin.backend.service.nonoption.DefaultImplAngPl;
import com.example.vaadin.backend.service.phrasal.PhrasalVerbsImpl;


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
