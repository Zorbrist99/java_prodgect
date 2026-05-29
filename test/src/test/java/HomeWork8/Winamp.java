package HomeWork8;

import java.util.ArrayList;

public class Winamp {
    static void main(String[] args) {
        //Создали лист песен
        ArrayList<String> listSongs = new ArrayList<>();
        listSongs.add("Roma to Brooklyn");
        listSongs.add("Sway");
        listSongs.add("Let It Snow");


        //Создаем объект playList с названием и списком песен
        PlayList playList = new PlayList("Jazz", listSongs);

        //Добавили песню в лист
        System.out.println(playList);
        playList.addSongInPlayList("Mambo Italiano");
        System.out.println(playList);

        //Удалили песню по индексу
        System.out.println(playList);
        playList.deleteSongByIndex(2);
        System.out.println(playList);

        //Обновление песни по индексу
        System.out.println(playList);
        playList.updatingSongByIndex(2,"Don't Touch Me Nylon");
        System.out.println(playList);

        //Получение песни по индексу
        System.out.println(playList);
        playList.getSongByIndex(2);
    }
}
