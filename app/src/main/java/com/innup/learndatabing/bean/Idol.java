package com.innup.learndatabing.bean;

public class Idol {

    private String name;

    private int star;

    private String netImgUrl;

    private int localImgId;

    public Idol() {
    }

    public Idol(String name, int star) {
        this.name = name;
        this.star = star;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getNetImgUrl() {
        return netImgUrl;
    }

    public void setNetImgUrl(String netImgUrl) {
        this.netImgUrl = netImgUrl;
    }

    public int getLocalImgId() {
        return localImgId;
    }

    public void setLocalImgId(int localImgId) {
        this.localImgId = localImgId;
    }
}
