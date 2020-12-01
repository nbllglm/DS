package com.gz.test.ddz;

import java.util.*;

public class Main {
    static List<Player> players = new ArrayList<>();
    static List<Pok> pokList = new ArrayList<>();

    public static void main(String[] args) {
        try {
            players.clear();
            xipai();
            for (int i = 1; i < 4; i++) {
                Scanner scan = new Scanner(System.in);
                pl("第" + i + "号玩家是否抢地主");
                if (scan.hasNextLine()) {
                    String str = scan.nextLine();
                    if ("yes".equals(str) ? true : false) {
                        if (!isHaveLanlord()) {
                            players.add(new Landlord());
                        } else {
                            players.add(new Player());
                        }
                    } else {
                        players.add(new Player());
                    }
                }
            }
            fapai();
            for (Player player : players) {
                if (player instanceof Landlord) {
                    for (Pok pok : pokList) {
                        player.add(pok);
                    }
                }
                pl(player);
            }

        } catch (NullPointerException e) {
            System.out.println("asdasdasd");
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }


    }


    static boolean NoNull(Collection collection) throws NullPointerException {
        return collection != null && collection.size() > 0;
    }

    static void xipai() {
        pokList.clear();
        for (int i = 0; i < 4; i++) {
            Pok.Color color = null;
            switch (i) {
                case 0:
                    color = Pok.Color.Spades;
                    break;
                case 1:
                    color = Pok.Color.Club;
                    break;
                case 2:
                    color = Pok.Color.Heart;
                    break;
                case 3:
                    color = Pok.Color.Diamoned;
                    break;
                default:
                    break;
            }
            for (int j = 0; j < 13; j++) {
                Pok pok = new Pok();
                pok.setColor(color);
                pok.setNum(j);
                pokList.add(pok);
            }

        }
        Pok pok1 = new Pok();
        pok1.setColor(null);
        pok1.setNum(13);
        pokList.add(pok1);
        Pok pok2 = new Pok();
        pok2.setColor(null);
        pok2.setNum(14);
        pokList.add(pok2);
    }

    static void fapai() throws IndexOutOfBoundsException{
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 17; j++) {
                Pok pok = pokList.get(new Random().nextInt(pokList.size()-1));
                players.get(i).add(pok);
                pokList.remove(pok);
            }
        }
    }

    public static <T> void pl(T t) {
        System.out.println(t);
    }

    public static boolean isHaveLanlord() {
        for (Player player : players) {
            if (player instanceof Landlord) {
                return true;
            }
        }
        return false;
    }
}
