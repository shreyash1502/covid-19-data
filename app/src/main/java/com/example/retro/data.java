package com.example.retro;

public class data {
    String Country;
    String Slug;
    int NewConfirmed;
    int TotalConfirmed;
    int NewDeaths;
    int TotalDeaths;
    int TotalRecovered;
    int NewRecovered;
    //{"Country":"India","Slug":"india","NewConfirmed":37,"TotalConfirmed":536,"NewDeaths":0,"TotalDeaths":10,"NewRecovered":6,"TotalRecovered":40}


    public data(String country, String slug, int newConfirmed, int totalConfirmed, int newDeaths, int totalDeaths, int totalRecovered, int newRecovered) {
        Country = country;
        Slug = slug;
        NewConfirmed = newConfirmed;
        TotalConfirmed = totalConfirmed;
        NewDeaths = newDeaths;
        TotalDeaths = totalDeaths;
        TotalRecovered = totalRecovered;
        NewRecovered = newRecovered;
    }

    public String getCountry() {
        return Country;
    }

    public String getSlug() {
        return Slug;
    }

    public int getNewConfirmed() {
        return NewConfirmed;
    }

    public int getTotalConfirmed() {
        return TotalConfirmed;
    }

    public int getNewDeaths() {
        return NewDeaths;
    }

    public int getTotalDeaths() {
        return TotalDeaths;
    }

    public int getTotalRecovered() {
        return TotalRecovered;
    }

    public int getNewRecovered() {
        return NewRecovered;
    }
}
