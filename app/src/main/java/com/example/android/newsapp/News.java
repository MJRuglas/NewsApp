package com.example.android.newsapp;


public class News{

    /**
     * article title
     */
    private String webTitle;

    /**
     * section name
     */
    private String sectionName;

    /**
     * web url
     */
    private String webUrl;

    /**
     * Get Author name
     */
    private String author;

    /**
     * Get date
     */
    private String webPublicationDate;


    /**
     * Create Word objects
     *
     * @param webTitle is title of article
     * @param sectionName   is name of section
     * @param webUrl    is article web url
     * @param author   is the article's author
     * @param webPublicationDate     get date
     */


    public News (String webTitle, String sectionName, String webUrl, String author,
                 String webPublicationDate) {
        this.webTitle = webTitle;
        this.sectionName = sectionName;
        this.webUrl = webUrl;
        this.webPublicationDate = webPublicationDate;
        this.author = author;
    }


    /**
     * Get the title of article.
     */
    public String getWebTitle() {
        return webTitle;
    }

    /**
     * Get the name of section.
     */
    public String getSectionName() {
        return sectionName;
    }

    /**
     * Get the article web article.
     */
    public String getWebUrl() {
        return webUrl;
    }

    /**
     * Get the Author's name
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Get the date
     */
    public String getWebPublicationDate() {
        return webPublicationDate;
    }

}
