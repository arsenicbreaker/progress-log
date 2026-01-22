/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agustia_footballplayer;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author erina
 */
public class Football {
    
    private int nomorPunggung; //tidak boleh negatif
    private String nama;
    private String position;
    private LocalDate startingContract;
    private double sallary; //tidak boleh negatif
    private int match; //tidak boleh negatif
    private int goal; //tidak boleh negatif
    private int assist; //tidak boleh negatif
    private int cleanSheet; //tidak boleh negatif
    private int trophy; //tidak boleh negatif
    
    private ArrayList<Football> listOfFootball = new ArrayList();

    /**
     * @return the nomorPunggung
     */
    public int getNomorPunggung() {
        return nomorPunggung;
    }

    /**
     * @param nomorPunggung the nomorPunggung to set
     */
    public void setNomorPunggung(int nomorPunggung) throws Exception {
        if (nomorPunggung < 0 ) {
            throw new Exception("Nomor punggung ridak boleh 0");
        }
        this.nomorPunggung = nomorPunggung;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return the startingContract
     */
    public LocalDate getStartingContract() {
        return startingContract;
    }

    /**
     * @param startingContract the startingContract to set
     */
    public void setStartingContract(LocalDate startingContract) {
        this.startingContract = startingContract;
    }

    /**
     * @return the sallary
     */
    public double getSallary() {
        return sallary;
    }

    /**
     * @param sallary the sallary to set
     */
    public void setSallary(double sallary) throws Exception {
         if (sallary < 0 ) {
            throw new Exception("Sallary tidak boleh 0");
        }
        this.sallary = sallary;
    }

    /**
     * @return the match
     */
    public int getMatch() {
        return match;
    }

    /**
     * @param match the match to set
     */
    public void setMatch(int match) throws Exception {
         if (match < 0 ) {
            throw new Exception("Match tidak boleh 0");
        }
        this.match = match;
    }

    /**
     * @return the goal
     */
    public int getGoal() {
        return goal;
    }

    /**
     * @param goal the goal to set
     */
    public void setGoal(int goal) throws Exception {
         if (goal < 0 ) {
            throw new Exception("Goal tidak boleh 0");
        }
        this.goal = goal;
    }

    /**
     * @return the assist
     */
    public int getAssist() {
        return assist;
    }

    /**
     * @param assist the assist to set
     */
    public void setAssist(int assist) throws Exception {
         if (assist < 0 ) {
            throw new Exception("Assist tidak boleh 0");
        }
        this.assist = assist;
    }

    /**
     * @return the cleanSheet
     */
    public int getCleanSheet() {
        return cleanSheet;
    }

    /**
     * @param cleanSheet the cleanSheet to set
     */
    public void setCleanSheet(int cleanSheet) throws Exception {
         if (cleanSheet < 0 ) {
            throw new Exception("CleanSheet tidak boleh 0");
        }
        this.cleanSheet = cleanSheet;
    }

    /**
     * @return the trophy
     */
    public int getTrophy() {
        return trophy;
    }

    /**
     * @param trophy the trophy to set
     */
    public void setTrophy(int trophy) throws Exception {
         if (trophy < 0 ) {
            throw new Exception("Throphy tidak boleh 0");
        }
        this.trophy = trophy;
    }
   
    // default constructor
    public Football() {
        nomorPunggung = 0;
        nama = "";
        position = "";
        startingContract = LocalDate.now();
        sallary = 0;
        match = 0;
        goal = 0;
        assist = 0;
        cleanSheet  = 0;
        trophy = 0;
    }
    
    // constructor dengan parameter
    public Football(int nomorPunggung,String nama,String position,
            LocalDate startingContract, double sallary,int match,int goal,int assist,int cleanSheet, int trophy) throws Exception {
        
        if (nomorPunggung < 0 ) {
            throw new Exception("Nomor punggung ridak boleh 0");
        }
        
        if (sallary < 0 ) {
            throw new Exception("Sallary tidak boleh 0");
        }
        
        if (match < 0 ) {
            throw new Exception("Match tidak boleh 0");
        }
        
        if (goal < 0 ) {
            throw new Exception("Goal tidak boleh 0");
        }
        
        if (assist < 0 ) {
            throw new Exception("Assist tidak boleh 0");
        }
        
        if (cleanSheet < 0 ) {
            throw new Exception("CleanSheet tidak boleh 0");
        }
        
        if (trophy < 0 ) {
            throw new Exception("Throphy tidak boleh 0");
        }
        
        this.nomorPunggung = nomorPunggung;
        this.nama = nama;
        this.position = position;
        this.startingContract = startingContract;
        this.sallary = sallary;
        this.match = match;
        this.goal = goal;
        this.assist = assist;
        this.cleanSheet  = cleanSheet;
        this.trophy = trophy;
        
    }
    
    public void addData(Football football) throws Exception {
        //nomor punggung gaboleh double
        for(Football p : listOfFootball) {
            if(p.getNomorPunggung() == football.getNomorPunggung()) {
                throw new Exception("Nomor punggung sudah ada"); 
            }
        }
        listOfFootball.add(football);
    }
    
    public void updatePlayer(Football football, int nomerPunggung) {
        int index = -1;
        for(int i = 0; i < listOfFootball.size(); i++) {
            if(listOfFootball.get(i).getNomorPunggung() == nomorPunggung) {
                index = i;
                break;
            }
        } 
        listOfFootball.set(index,football);
    }
    
    //function display
    public String display() {
        String print = "";
        for(int i=0;i<listOfFootball.size();i++) {
            print += "Player-" + (i+1) + "\n"
                    + "Nama Player : " + listOfFootball.get(i).getNama() + "\n"
                    + "Nomor Punggung : " + listOfFootball.get(i).getNomorPunggung() + "\n"
                    + "Position : " + listOfFootball.get(i).getPosition() + "\n"
                    + "Match : " + listOfFootball.get(i).getMatch() + "\n"
                    + "Sallary : " + listOfFootball.get(i).getSallary() + "\n"
                    + "Perolehan Goal : " + listOfFootball.get(i).getGoal() + "\n"
                    + "Perolehan Assist : " + listOfFootball.get(i).getAssist() + "\n"
                    + "Perolehan CleanSheet : " + listOfFootball.get(i).getCleanSheet() + "\n"
                    + "Perolehan Trophy : " + listOfFootball.get(i).getTrophy() + "\n"
                    + "Starting Date: " + listOfFootball.get(i).getStartingContract().toString() + "\n" 
                    + "=========================";
        }
        
        return print;
    }
}
