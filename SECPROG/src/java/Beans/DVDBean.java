
package Beans;

import java.util.ArrayList;

public class DVDBean {
    private int dvdID;
    private String director;
    private String productionCompany;
    private ArrayList<String> mainActors;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProductionCompany() {
        return productionCompany;
    }

    public void setProductionCompany(String productionCompany) {
        this.productionCompany = productionCompany;
    }

    public ArrayList<String> getMainActors() {
        return mainActors;
    }

    public void setMainActors(ArrayList<String> mainActors) {
        this.mainActors = mainActors;
    }

    public int getDvdID() {
        return dvdID;
    }

    public void setDvdID(int dvdID) {
        this.dvdID = dvdID;
    }
}
