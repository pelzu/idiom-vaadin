package com.example.vaadin.backend;

import com.example.vaadin.backend.model.PhrasalVerb;

import java.util.Comparator;

public class PhrasalComparator implements Comparator<PhrasalVerb> {
    @Override
    public int compare(PhrasalVerb o1, PhrasalVerb o2) {
        return (int) (o1.getId() - o2.getId());
    }
}
