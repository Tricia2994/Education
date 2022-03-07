/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MadLib;

/**
 *
 * @author patricia
 */
public class MadLibs {

    /*
  This program generates a mad libbed story.
Author: Laura
Date: 2/19/2049
     */
    public static void main(String[] args) {

        String name1 = "Cheetah";
        String adjective1 = "sad";
        String adjective2 = "bad";
        String adjective3 = "angry";
        String verb1 = "dance";
        String noun1 = "monkey";
        String noun2 = "bananas";
        String noun3 = "Hares";
        String noun4 = "foxes";
        String noun5 = "wheel";
        String noun6 = "lion";
        String name2 = " eagle";
        int number = 1812;
        String place1 = " madagascar";

        //The template for the story
        String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". "
                + "'It is going to be a " + adjective2 + " day!' Outside, a bunch of " + noun1
                + "s were protesting to keep " + noun2 + " in stores. They began to " + verb1
                + " to the rhythm of the " + noun3 + ", which made all the " + noun4 + "s very "
                + adjective3 + ". Concerned, " + name1 + " texted " + name2 + ", who flew " + name1
                + " to " + place1 + " and dropped " + name1 + " in a puddle of frozen " + noun5 + ". "
                + name1 + " woke up in the year " + number + ", in a world where "
                + noun6 + "s ruled the world.";
        System.out.println(story);

    }
}
