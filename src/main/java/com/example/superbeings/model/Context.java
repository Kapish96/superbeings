package com.example.superbeings.model;

public class Context
{
    private String text_English;

    private String language;

    private String id;

    private String text;

    private String wikidata;

    private String language_English;

    public String getText_English ()
    {
        return text_English;
    }

    public void setText_English (String text_English)
    {
        this.text_English = text_English;
    }

    public String getLanguage ()
    {
        return language;
    }

    public void setLanguage (String language)
    {
        this.language = language;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getText ()
    {
        return text;
    }

    public void setText (String text)
    {
        this.text = text;
    }

    public String getWikidata ()
    {
        return wikidata;
    }

    public void setWikidata (String wikidata)
    {
        this.wikidata = wikidata;
    }

    public String getLanguage_English ()
    {
        return language_English;
    }

    public void setLanguage_English (String language_English)
    {
        this.language_English = language_English;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [text_English = "+text_English+", language = "+language+", id = "+id+", text = "+text+", wikidata = "+wikidata+", language_English = "+language_English+"]";
    }
}
	
