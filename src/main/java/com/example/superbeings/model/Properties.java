package com.example.superbeings.model;

public class Properties
{
    private String address;

    private String foursquare;

    private String landmark;

    private String category;

    private String wikidata;

    public String getAddress ()
    {
        return address;
    }

    public void setAddress (String address)
    {
        this.address = address;
    }

    public String getFoursquare ()
    {
        return foursquare;
    }

    public void setFoursquare (String foursquare)
    {
        this.foursquare = foursquare;
    }

    public String getLandmark ()
    {
        return landmark;
    }

    public void setLandmark (String landmark)
    {
        this.landmark = landmark;
    }

    public String getCategory ()
    {
        return category;
    }

    public void setCategory (String category)
    {
        this.category = category;
    }

    public String getWikidata ()
    {
        return wikidata;
    }

    public void setWikidata (String wikidata)
    {
        this.wikidata = wikidata;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [address = "+address+", foursquare = "+foursquare+", landmark = "+landmark+", category = "+category+", wikidata = "+wikidata+"]";
    }
}
