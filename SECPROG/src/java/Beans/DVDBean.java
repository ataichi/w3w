
package Beans;

import java.util.ArrayList;

public class DVDBean {
    protected int dvdID;
    protected String director;
    protected String productionCompany;
    protected ArrayList<String> mainActors;

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
