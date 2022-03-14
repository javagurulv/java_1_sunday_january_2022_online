package student_yevgeniy_tolks.lesson_4.level_5;


class LightColorDetector {

    public String detect(int waveLenght) {

        if (waveLenght >= 380 && waveLenght <= 449) {
            return "Violet";
        } else if (waveLenght >= 450 && waveLenght <= 494) {
            return "Blue";
        } else if (waveLenght >= 495 && waveLenght <= 569) {
            return "Green";
        } else if (waveLenght >= 570 && waveLenght <= 589) {
            return "Yellow";
        } else if (waveLenght >= 590 && waveLenght <= 619) {
            return "Orange";
        } else if (waveLenght >= 620 && waveLenght <= 750) {
            return "Red";
        } else {
            return "Invisible light";
        }
    }
}
