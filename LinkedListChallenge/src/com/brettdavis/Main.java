package com.brettdavis;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {


        Album album = new Album("Ride the Lightning", "Metallica");
        album.addSong("Ride the Lightning", 4.6);
        album.addSong("For Whom the Bell Tolls", 4.1);
        album.addSong("Creeping Death", 5.2);
        album.addSong("Fight Fire with Fire", 6.6);
        album.addSong("Fade to Black", 7.2);
        album.addSong("Escape", 3.6);
        album.addSong("Trapped Under Ice", 4.2);
        album.addSong("The Call of Ktulu", 9.5);
        albums.add(album);

        album = new Album("For those about to Rock!", "AC/DC");
        album.addSong("For Those about to Rock!", 5.44);
        album.addSong("Hells Bells", 3.9);
        album.addSong("Thunderstruck", 7.8);
        album.addSong("Long Way to the Top if You wanna rock'n'roll!", 7.1);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("Ride the Lightning", playList);
        albums.get(0).addToPlayList("For Whom the Bell Tolls", playList);
        albums.get(0).addToPlayList("Creeping Death", playList);
        albums.get(0).addToPlayList("Escape", playList);
        albums.get(0).addToPlayList("And Justice For All...", playList); //does not exist
        albums.get(0).addToPlayList(8, playList); //an alternative way to input data

        albums.get(1).addToPlayList("For Those about to Rock!", playList);
        albums.get(1).addToPlayList("Thunderstruck", playList);
        albums.get(1).addToPlayList("Hells Bells", playList);
        albums.get(1).addToPlayList(24, playList); //does not exist

        play(playList);


    }

    private static void play(LinkedList<Song> playList){

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;



        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0)
            System.out.println("No songs in playlist");
        else{
            System.out.println("Now playing: " + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){

                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1://going forward
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }else
                        System.out.println("We have reacehd the end of the playlist.");
                    break;
                case 2://going backward
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing: " + listIterator.previous().toString());

                    }
                    else{
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Replaying: " + listIterator.previous());
                            forward = false;
                        }else{
                            System.out.println("We are at the start of the list.");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Replaying: " + listIterator.next());
                            forward = true;
                        }else{
                            System.out.println("We have reached the end of the list.");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6: //removing a song from the playlist
                    if(playList.size() > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());

                        }else if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;



            }
        }


    }

    private static void printMenu(){
        System.out.println("Available actions: ");
        System.out.println("0 - to quit");
        System.out.println("1 - next song");
        System.out.println("2 - previous song");
        System.out.println("3 - replay current song");
        System.out.println("4 - list the songs in the playlist");
        System.out.println("5 - print available actions");
        System.out.println("6 - remove current song from playlist");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("==========================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("==========================");

    }

}
