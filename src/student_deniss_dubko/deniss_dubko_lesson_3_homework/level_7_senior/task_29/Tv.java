package student_deniss_dubko.deniss_dubko_lesson_3_homework.level_7_senior.task_29;

import java.util.Random;

class Tv {

    String tvBrand;
    boolean isTvOn;
    int currentTvChannel;

    public Tv (String tvBrand) {

        this.tvBrand = tvBrand;
        this.isTvOn = false;
        this.currentTvChannel = 0;
    }

    public void showTvBrand() {
        System.out.println("TV Brand: " + this.tvBrand);
    }

    public void isTvOnOff() {
        isTvOn = !isTvOn;
        }

    public void showTvChannel() {
        System.out.println("Channel: " + this.currentTvChannel);
    }

    // To be continued


}
