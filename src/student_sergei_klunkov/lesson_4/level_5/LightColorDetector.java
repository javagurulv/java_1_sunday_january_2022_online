package student_sergei_klunkov.lesson_4.level_5;


class LightColorDetector {

    public String detect(int length) {
        if (length > 421 && length <= 449) {
            return "Violet";
        } else if (length > 450 && length <= 494) {
            return "Blue";
        } else if (length > 495 && length <= 569) {
            return "Green";
        } else if (length > 570 && length <= 589) {
            return "Yellow";
        } else if (length > 590 && length <= 619) {
            return "Orange";
        } else if (length > 620 && length <= 750) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }

}
