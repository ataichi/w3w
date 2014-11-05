
package Beans;

import java.sql.Date;

public class MagazineBean {
    private int magazineID;
    private int volumeNo;
    private String publisher;
    private Date datePublished;
    private int issueNo;

    public int getVolumeNo() {
        return volumeNo;
    }

    public void setVolumeNo(int volumeNo) {
        this.volumeNo = volumeNo;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }

    public int getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(int issueNo) {
        this.issueNo = issueNo;
    }

    public int getMagazineID() {
        return magazineID;
    }

    public void setMagazineID(int magazineID) {
        this.magazineID = magazineID;
    }
}
