package domain;

import java.io.Serializable;

public class Job implements Serializable {
    private int id;
    private String jobname;
    private String img;
    private String title;
    private String fu_title;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFu_title() {
        return fu_title;
    }

    public void setFu_title(String fu_title) {
        this.fu_title = fu_title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
