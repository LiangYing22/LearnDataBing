package com.innup.learndatabing.bean;

public class JumpClassBean {
    private int imgId;

    private String className;

    private String classText;

    public JumpClassBean() {
    }

    public JumpClassBean(int imgId, String className, String classText) {
        this.imgId = imgId;
        this.className = className;
        this.classText = classText;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassText() {
        return classText;
    }

    public void setClassText(String classText) {
        this.classText = classText;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    @Override
    public String toString() {
        return "JumpClassBean{" +
                "imgId=" + imgId +
                ", className='" + className + '\'' +
                ", classText='" + classText + '\'' +
                '}';
    }
}
