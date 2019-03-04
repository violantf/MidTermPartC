/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author owner
 */
public class TestUserprofile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = input.nextLine();
        
        
        
        UserProfile usr = new UserProfile(name, "Unspecified");
        
        System.out.println("Select your prefered genre from the following");
        
        for(String genres: usr.getGenreList()){
            System.out.println("\t" + genres);
        }
        String genre;
        
        boolean genreCheck = false;
        
        do {
            
            System.out.print("Enter Genre: ");
            genre = input.nextLine();
            
            for(String genres: usr.getGenreList()){
                if(genre.equals(genres)) {
                    genreCheck = true;
                }
            }
            
        } while (genreCheck == false);
        
        usr.setGenre(genre);
        
        System.out.println("Name            : " + usr.getUserID());
        System.out.println("Favourite Genre : " + usr.getGenre());
        
        
        
    }
    
}
