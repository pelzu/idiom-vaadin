package com.example.vaadin.backend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PhrasalVerb {

    @Id
    private Long id;
    private String polishMeaning;
    private String englishMeaning;
    private String englishExample;
    private String linkToPhrasalVerb;
    @Override
    public String toString() {
        return "\n"+
                "PhrasalVerb{" +
                "id='" + id + '\'' +
                ", polishMeaning='" + polishMeaning + '\'' +
                ", englishMeaning='" + englishMeaning + '\'' +
                ", englishExample='" + englishExample + '\'' +
                ", linkToPhrasalVerb='" + linkToPhrasalVerb + '\'' +
                '}';
    }
}
