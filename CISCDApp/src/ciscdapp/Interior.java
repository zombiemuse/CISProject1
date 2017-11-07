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
public class Interior {
    private String color1;
    private String color2;
    boolean hasSunRoof;
    boolean hasMoonRoof;
    
    public Interior(String color1, String color2, boolean hasSunRoof, boolean hasMoonRoof){
        this.color1 = color1;
        this.color2 = color2;
        this.hasSunRoof = hasSunRoof;
        this.hasMoonRoof = hasMoonRoof;
    }
    @Override
    public String toString(){
        String s = color1 + " and " + color2 + " with sun roof: " + hasSunRoof + " with moon roof: " + hasMoonRoof;
        return s;
    }
    public String getColor1(){
        return color1;
    }
    public String getColor2(){
        return color2;
    }
    public boolean getHasSunRoof(){
        return hasSunRoof;
    }
    public boolean getHasMoonRoof(){
        return hasMoonRoof;
    }
    
}
