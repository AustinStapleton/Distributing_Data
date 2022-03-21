package edu.lwtech.distributingdata;

public class MainModel {

    String description;
    String name;
    String rank;
    String turl;
    String type;
    MainModel()
    {

    }

    public MainModel(String description, String name, String rank, String turl, String type) {
        this.description = description;
        this.name = name;
        this.rank = rank;
        this.turl = turl;
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getTurl() {
        return turl;
    }

    public void setTurl(String turl) {
        this.turl = turl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
