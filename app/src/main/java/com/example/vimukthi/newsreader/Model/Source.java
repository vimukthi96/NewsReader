package com.example.vimukthi.newsreader.Model;

import java.util.List;

public class Source {
    private String id;
    private String name;
    private String description;
    private String category;
    private String url;
    private String language;
    private String country;
    private UrlToLogos urlToLogos;
    private List<String >sortByAvailable;

    public Source() {
    }

    public Source(String id, String name, String description, String category, String url, String language, String country, UrlToLogos urlToLogos, List<String> sortByAvailable) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.url = url;
        this.language = language;
        this.country = country;
        this.urlToLogos = urlToLogos;
        this.sortByAvailable = sortByAvailable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public UrlToLogos getUrlToLogos() {
        return urlToLogos;
    }

    public void setUrlToLogos(UrlToLogos urlToLogos) {
        this.urlToLogos = urlToLogos;
    }

    public List<String> getSortByAvailable() {
        return sortByAvailable;
    }

    public void setSortByAvailable(List<String> sortByAvailable) {
        this.sortByAvailable = sortByAvailable;
    }
}
class UrlToLogos{
    private String small,medium,large;

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }
}
