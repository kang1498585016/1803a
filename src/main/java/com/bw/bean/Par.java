package com.bw.bean;

public class Par {
    private  Integer id;
    private String name;
    private String gender;
    private String  birthday;
    private Integer did;
    private String diag_time;
    private String dia_time;

    private String names;

    public Par(Integer id, String name, String gender, String birthday, Integer did, String diag_time, String dia_time, String names) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.did = did;
        this.diag_time = diag_time;
        this.dia_time = dia_time;
        this.names = names;
    }

    public Par() {
    }

    @Override
    public String toString() {
        return "Par{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", did=" + did +
                ", diag_time='" + diag_time + '\'' +
                ", dia_time='" + dia_time + '\'' +
                ", names='" + names + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDiag_time() {
        return diag_time;
    }

    public void setDiag_time(String diag_time) {
        this.diag_time = diag_time;
    }

    public String getDia_time() {
        return dia_time;
    }

    public void setDia_time(String dia_time) {
        this.dia_time = dia_time;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }
}
