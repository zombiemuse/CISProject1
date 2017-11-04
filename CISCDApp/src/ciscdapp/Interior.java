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
        
    }
    public String toString(){
        String s = color1 + color2 + hasSunRoof + hasMoonRoof;
        return s;
    }
            
    
}
