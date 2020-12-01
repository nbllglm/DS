package com.gz.test.ddz;

public class Pok {
    private Color color;
    private String name;
    private int num;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
        switch (num) {
            case 0:
                this.name = "A";
                break;
            case 1:
                this.name = "2";
                break;
            case 2:
                this.name = "3";
                break;
            case 3:
                this.name = "4";
                break;
            case 4:
                this.name = "5";
                break;
            case 5:
                this.name = "6";
                break;
            case 6:
                this.name = "7";
                break;
            case 7:
                this.name = "8";
                break;
            case 8:
                this.name = "9";
                break;
            case 9:
                this.name = "10";
                break;
            case 10:
                this.name = "J";
                break;
            case 11:
                this.name = "Q";
                break;
            case 12:
                this.name = "K";
                break;
            case 13:
                this.name = "joker";
                break;
            case 14:
                this.name = "JOKER";
                break;
            default:
                break;
        }

    }

    @Override
    public String toString() {
        if (this.color != null) {
            return this.color.name + this.name;
        } else {
            return this.name;
        }
    }

    public enum Color {
        Spades("黑桃"),
        Club("梅花"),
        Heart("红桃"),
        Diamoned("方片");

        private String name;

        Color(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }

    }
}
