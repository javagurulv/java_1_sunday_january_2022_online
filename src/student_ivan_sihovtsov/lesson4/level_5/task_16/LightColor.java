package student_ivan_sihovtsov.lesson4.level_5.task_16;

public class LightColor {

    public String detect(int wave){
        if (wave > 380 && wave <= 449) {
            return "Violet";
        }else if (wave > 450 && wave <= 494) {
            return "Blue";
        }else if (wave > 495 && wave <= 569) {
            return "Green";
        }else if (wave > 570 && wave <= 589) {
            return "Yellow";
        }else if (wave > 590 && wave <= 619) {
            return "Orange";
        }else if (wave > 620 && wave <= 750) {
            return "Red";
        }else {
            return "Invisible";
        }
    }

}
