package service.impl;

import service.IPrintMatter;

public class PrintMatter implements IPrintMatter {
    protected String type;
    protected String name;
    protected String author;
    protected String language;
    protected String signature;

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getSignature() {
        return this.signature;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

}

