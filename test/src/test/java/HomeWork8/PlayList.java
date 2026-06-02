package HomeWork8;

import java.util.ArrayList;

public class PlayList {
    String namePlayList;
    ArrayList<String> listSongs;

    public PlayList(String namePlayList) {
        this.namePlayList = namePlayList;
        this.listSongs = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "\nPlayList{" +
                "namePlayList='" + namePlayList + '\'' +
                ", listSongs=" + listSongs +
                '}';
    }

    public void addSongInPlayList(String song) {
        listSongs.add(song);
        System.out.printf("Song '%s' added to playlist '%s'", song, namePlayList);
    }

    public void deleteSongByIndex(int index) {
        if (index + 1 > listSongs.size()) {
            System.out.printf("The song number '%d' does not exist.", index);
        } else {
            listSongs.remove(index);
            System.out.printf("A song named '%s' has been deleted from '%d' playlist", namePlayList, index);
        }
    }

    public void updatingSongByIndex(int index, String newSound) {
        if (index + 1 > listSongs.size()) {
            System.out.printf("The song number '%d' does not exist.", index);
        } else {
            listSongs.set(index, newSound);
            System.out.printf("Song '%s' added to '%d' position", newSound, index);
        }
    }

    public void getSongByIndex(int index) {
        System.out.printf("The following song was found using the '%d' index: '%s'", index, listSongs.get(index));
    }


}
