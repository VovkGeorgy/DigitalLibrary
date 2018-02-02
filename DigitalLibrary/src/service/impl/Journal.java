package service.impl;

import service.IPrintMatter;

import java.util.Date;

public class Journal extends PrintMatter implements IPrintMatter{
    private Date printDate;
    private String journalHolder;

    public Journal(String name, Date printDate, String journalHolder, String language){
        this.type = "Journal";
        this.name = name;
        this.printDate = printDate;
        this.journalHolder = journalHolder;
        this.language = language;
    }
}
