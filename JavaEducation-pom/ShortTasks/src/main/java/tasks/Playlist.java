/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

/**
 *
 * @author patricia
 *
 */
import java.util.ArrayList;

public class Playlist {

    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        desertIslandPlaylist.add("Maybe tomorrow");
        desertIslandPlaylist.add("Ever green");
        desertIslandPlaylist.add("I wanna grow old with you");
        desertIslandPlaylist.add("Hero");
        desertIslandPlaylist.add("Perfect");
        desertIslandPlaylist.add("Tonight am loving you");
        desertIslandPlaylist.add("Fuck you");

        desertIslandPlaylist.remove("Fuck you");
        desertIslandPlaylist.remove("Hero");

        //System.out.println(desertIslandPlaylist);
        //System.out.println(desertIslandPlaylist.size());
        int indexA = desertIslandPlaylist.indexOf("Maybe tomorrow");
        int indexB = desertIslandPlaylist.indexOf("Tonight am loving you");

        String tempA = " Maybe tomorrow";

        desertIslandPlaylist.set(indexA, "Tonight am loving you");

        desertIslandPlaylist.set(indexB, tempA);

        System.out.println(desertIslandPlaylist);

    }

}
