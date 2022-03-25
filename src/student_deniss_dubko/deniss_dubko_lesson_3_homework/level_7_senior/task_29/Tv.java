package student_deniss_dubko.deniss_dubko_lesson_3_homework.level_7_senior.task_29;

import java.util.Random;

class Tv {

    String tvBrand;
    int tvVolume;
    int tvChannel;

    public Tv (String tvBrand, int tvVolume, int tvChannel) {

        this.tvBrand = tvBrand;
        this.tvVolume = tvVolume;
        this.tvChannel = tvChannel;
    }

    public void showTvBrand() {
        System.out.println("TV Brand: " + this.tvBrand);
    }

    public void showTvVolume() {
        System.out.println("Volume: " + this.tvVolume);
        }

    public void showTvChannel() {
        System.out.println("Channel: " + this.tvChannel);
    }

    public void changeTvVolume() {

    }


}
