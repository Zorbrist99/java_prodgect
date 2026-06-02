package HomeWork8;

import java.util.ArrayList;

public class Winamp {
    static void main(String[] args) {

        //Создаем объект playList с названием и списком песен
        PlayList playList = new PlayList("Jazz");
        playList.addSongInPlayList("Roma to Brooklyn");
        playList.addSongInPlayList("Sway");
        playList.addSongInPlayList("Let It Snow");

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
        playList.updatingSongByIndex(2, "Don't Touch Me Nylon");
        System.out.println(playList);

        //Получение песни по индексу
        System.out.println(playList);
        playList.getSongByIndex(2);
    }
}
