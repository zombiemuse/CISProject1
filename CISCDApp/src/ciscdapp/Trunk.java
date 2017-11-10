/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciscdapp;

/**
 *
 * @author xxzom
 */
public class Trunk {
    private boolean hasSpareTire;
    private boolean hasFirstAidKit;
    private boolean hasCarpet;
    private boolean hasJack;
    private String carpetColor;
    
    public Trunk(boolean hasSpareTire, boolean hasFirstAidKit, boolean hasCarpet, boolean hasJack, String carpetColor){
        this.hasSpareTire = hasSpareTire;
        this.hasFirstAidKit = hasFirstAidKit;
        this.hasCarpet = hasCarpet;
        this.hasJack = hasJack;
        this.carpetColor = carpetColor;
    }
    @Override
    public String toString(){
        return "Spare tire: " + hasSpareTire + "First aid kit: " + hasFirstAidKit + "Carpet: " + hasCarpet + carpetColor
                + "Jack: " + hasJack;
    }
    public boolean getHasSpareTire(){
        return hasSpareTire;
    }
    public boolean getHasFirstAidKit(){
        return hasFirstAidKit;
    }
    public boolean getHasCarpet(){
        return hasCarpet;
    }
    public boolean getHasJack(){
        return hasJack;
    }
    public String getCarpetColor(){
        return carpetColor;
    }
}
