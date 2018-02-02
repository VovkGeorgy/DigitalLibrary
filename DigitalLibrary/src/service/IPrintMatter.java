package service;

public interface IPrintMatter {
    String getType();

    String getName();

    String getAuthor();

    String getLanguage();

    String getSignature();

    void setName(String name);

    void setAuthor(String author);

    void setLanguage(String language);

    void setSignature(String signature);
}
