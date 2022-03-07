package student_yevgeniy_tolks.lesson_4.level_5;


class LightColorDetector {

    public String detect(int waveLenght) {

        if (waveLenght >= 380 && waveLenght <= 449) {
            String waveColor = "Violet";
            return waveColor;
            }
            else if (waveLenght >= 450 && waveLenght <= 494) {
            String waveColor = "Blue";
            return waveColor;
            }
            else if (waveLenght>=495 && waveLenght<=569) {
                String waveColor = "Green";
                return waveColor;
            }
            else if(waveLenght>=570 && waveLenght<=589) {
                String waveColor = "Yellow";
                return waveColor;
            }
            else if(waveLenght>=590 && waveLenght<=619) {
                String waveColor = "Orange";
                return waveColor;
            }
            else if(waveLenght>=620 && waveLenght<=750) {
                String waveColor = "Red";
                return waveColor;
            }
            else {
            String waveColor = "Invisible light";
            return waveColor;
        }
    }
}
