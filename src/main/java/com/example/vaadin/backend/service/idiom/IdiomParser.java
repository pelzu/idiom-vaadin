package com.example.vaadin.backend.service.idiom;


import com.example.vaadin.backend.model.Idiom;
import com.example.vaadin.backend.IdiomIdComparator;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class IdiomParser {


    private final String PREFIX_LINK = "https://www.ang.pl";


    public List<Idiom> parseToIdiom(Elements elements) {

        List<Idiom> idiomList = new ArrayList<>();
        elements.forEach(element -> {
            Idiom idiom = Idiom.builder()
                    .id(Long.valueOf(getIdNumber(element)))
                    .audioTranslateLink(getMp3TranslateLink(element))
                    .linkToIdiom(getLinkToIdiom(element))
                    .englishMeaning(getEnglishTranslation(element))
                    .polishMeaning(getPolishTranslation(element))
                    .audioExampleLink(getExampleMp3Link(element))
                    .englishExample(getExampleEnglish(element))
                    .build();
            idiomList.add(idiom);
        });
        idiomList.sort(new IdiomIdComparator());
        log.info("Parsed and added " + idiomList.size() + " number of Idiom to list");


        return idiomList;
    }

    public String getExampleEnglish(Element el) {
        Node node = el.select("div[class=medium-5 columns]").select("p").first().childNodes().get(1);
        return node.toString();
    }

    public String getExampleMp3Link(Element el) {
        String exampleMp3Link = el.select("div[class=medium-5 columns]").select("a[href]").attr("href");
        return PREFIX_LINK + exampleMp3Link;
    }

    public String getPolishTranslation(Element el) {
        String polishTranslation = el.select("p[class=pol]").text();
        return polishTranslation;
    }

    public String getEnglishTranslation(Element el) {
        String englishTranslation = el.select("p[class=big mtop]").select("a[href]").next("a[href]").text();
        return englishTranslation;
    }

    private String getLinkToIdiom(Element el) {
        String idiomLink = el.select("p[class=big mtop]").select("a[href]").next("a[href]").attr("href");
        return PREFIX_LINK + idiomLink;
    }

    private String getIdNumber(Element el) {

        String idNumber = el.select("p[class=big mtop]").select("a[href]").next("a[href]").attr("href");
        idNumber = idNumber.substring(idNumber.lastIndexOf("/") + 1);

        return idNumber;
    }

    public String getMp3TranslateLink(Element el) {
        String mp3El = el.select("p[class=big mtop]").select("a[href]").attr("href");
        return PREFIX_LINK + mp3El;
    }


}
