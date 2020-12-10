package com.example.superbeings.model;

public class Features
{
    private String place_name;

    private String matching_text;

    private String text_English;

    private String[] center;

    private String type;

    private String relevance;

    private String matching_place_name;

    private String[] place_type;

    private Context[] context;

    private String place_name_English;

    private Geometry geometry;

    private String id;

    private String text;

    private Properties properties;

    public String getPlace_name ()
    {
        return place_name;
    }

    public void setPlace_name (String place_name)
    {
        this.place_name = place_name;
    }

    public String getMatching_text ()
    {
        return matching_text;
    }

    public void setMatching_text (String matching_text)
    {
        this.matching_text = matching_text;
    }

    public String getText_English ()
    {
        return text_English;
    }

    public void setText_English (String text_English)
    {
        this.text_English = text_English;
    }

    public String[] getCenter ()
    {
        return center;
    }

    public void setCenter (String[] center)
    {
        this.center = center;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getRelevance ()
    {
        return relevance;
    }

    public void setRelevance (String relevance)
    {
        this.relevance = relevance;
    }

    public String getMatching_place_name ()
    {
        return matching_place_name;
    }

    public void setMatching_place_name (String matching_place_name)
    {
        this.matching_place_name = matching_place_name;
    }

    public String[] getPlace_type ()
    {
        return place_type;
    }

    public void setPlace_type (String[] place_type)
    {
        this.place_type = place_type;
    }

    public Context[] getContext ()
    {
        return context;
    }

    public void setContext (Context[] context)
    {
        this.context = context;
    }

    public String getPlace_name_English ()
    {
        return place_name_English;
    }

    public void setPlace_name_English (String place_name_English)
    {
        this.place_name_English = place_name_English;
    }

    public Geometry getGeometry ()
    {
        return geometry;
    }

    public void setGeometry (Geometry geometry)
    {
        this.geometry = geometry;
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

    public Properties getProperties ()
    {
        return properties;
    }

    public void setProperties (Properties properties)
    {
        this.properties = properties;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [place_name = "+place_name+", matching_text = "+matching_text+", text_English = "+text_English+", center = "+center+", type = "+type+", relevance = "+relevance+", matching_place_name = "+matching_place_name+", place_type = "+place_type+", context = "+context+", place_name_English = "+place_name_English+", geometry = "+geometry+", id = "+id+", text = "+text+", properties = "+properties+"]";
    }
}
