package student_sergei_klunkov.lesson_4.lessoncode;

class LightDetector {


    public String detect(int lenght){
    if (lenght > 400 && lenght <= 500) {
        return "Red";
    } else if (lenght > 500 && lenght <=600){
return  "Blue";
        }
        else {
            return "Invisible";
    }

}

}