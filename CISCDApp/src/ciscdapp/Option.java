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
public class Option {
    private String name;
    private String description;
    
    public Option(String name, String description){
        this.name = name;
        this.description = description;
    }
    @Override
    public String toString(){
        return "Name: " + name + "\n" + "Description: " + description;
    }
}
