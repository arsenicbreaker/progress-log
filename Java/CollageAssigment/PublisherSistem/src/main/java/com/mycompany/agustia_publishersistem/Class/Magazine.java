/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agustia_publishersistem.Class;

import java.util.ArrayList;

/**
 *
 * @author erina
 */
public class Magazine {
    private String id;
    private String name;
    private Publisher publisher;
    ArrayList<Article> articles = new ArrayList<Article>();
    
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the publisher
     */
    public Publisher getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Magazine(String id, String name, Publisher publisher) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
    }

    public void AddArticle(Article article) {
        articles.add(article);
    }
    
    //method untuk mencari tahu berapa jumlah artikel
    public int NumberOfArticle() {
        if(articles.isEmpty() || articles == null) {
            return 0;
        } else {
            return articles.size();
        }
    }
    
    //function untuk mencari artikel tertentu
    public Article GetArticle(int idx) throws Exception {
        
        if(!articles.isEmpty() && idx >= 0) {
            return articles.get(idx);
        } else {
            throw new Exception("Artikel tidak ditemukan");
        }
    }
    
    public Article getArticle(String tittle) throws Exception {
        int idx = -1;
        
        for(int i = 0 ;i<articles.size();i++) {
            if(articles.get(i).getTittle() == tittle) {
                idx = i;
                break;    
            }
         }
        
        if(articles.isEmpty() && idx >= 0) {
            return GetArticle(idx);
        } else {
            throw new Exception("Artikel tidak dapat ditemukan");
        }
    }
    
    //METHOD UNTUK MENGHAPUS ARTIKEL
    public void DeleteArticle(int idx) throws Exception {
        if(!articles.isEmpty() && idx >= 0) {
            articles.remove(idx);
        }else{
            throw new Exception("Artikel tidak ditemukan");
        }
    }
    
    public String PrintArticle() {
        String print = "";
        
        for(Article article : articles) {
            print += "Tittle " + article.getTittle() + "\n"
                    + "Author: " + article.getAuthor() + "\n"
                    + "Web Address: " + article.getAddress() + "\n"
                    + "Content: " + article.getContent() + "\n";
        }
        return print;
        
    }

    public String toString() {
        return this.id + " - " + this.name;
    }
    
    public ArrayList<Article> getArticles() {
    return articles;
}

    
}
