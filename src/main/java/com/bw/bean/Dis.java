package com.bw.bean;

public class Dis {
    private Integer did;
    private  String names;

    public Dis(Integer did, String names) {
        this.did = did;
        this.names = names;
    }

    public Dis() {
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "Dis{" +
                "did=" + did +
                ", names='" + names + '\'' +
                '}';
    }
}
