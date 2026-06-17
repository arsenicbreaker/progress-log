/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agustia_publishersistem.Class;

/**
 *
 * @author erina
 */
public class Article {
    
    private String tittle;
    private String author;
    private String getAddress;
    private String content;
    /**
     * @return the tittle
     */
    public String getTittle() {
        return tittle;
    }

    /**
     * @param tittle the tittle to set
     */
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the getAddress
     */
    public String getAddress() {
        return getAddress;
    }

    /**
     * @param getAddress the getAddress to set
     */
    public void setGetAddress(String getAddress) {
        this.getAddress = getAddress;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    public Article(String tittle, String author, String getAddress, String content) {
        this.tittle = tittle;
        this.author = author;
        this.getAddress = getAddress;
        this.content = content;
    }

    @Override
    public String toString() {
        return getTittle(); // judul artikel
    }

    
}
