package student_alina_strumpe._lesson_5_if._level_4_Task_16;

public class LightColorDetector {


    public String detect(int waveLength){

        if (waveLength <= 449 && waveLength >= 380) {
            return "Violet";
        } else if (waveLength <= 494 && waveLength >= 450) {
            return "Blue";
        } else if (waveLength <= 569 && waveLength >= 495) {
            return "Green";
        } else if (waveLength <= 589 && waveLength >= 570) {
            return "Yellow";
        } else if (waveLength <= 620 && waveLength >= 590) {
            return "Orange";
        } else if (waveLength <= 750 && waveLength >= 621) {
            return "Red";
        } else {
            return "Invisible light";
        }


        }
    }

//    Функциональные требования:
//        Программа должна определять цвет в зависимости
//        от длины волны в соответствии со следующими правилами:
//
//        380 ... 449 - Фиолетовый ("Violet")
//        450 ... 494 - Синий ("Blue")
//        495 ... 569 - Зеленый ("Green")
//        570 ... 589 - Желтый ("Yellow")
//        590 ... 619 - Оранжевый ("Orange")
//        620 ... 750 - Красный ("Red")
//        Вне диапазонов - невидимый спектр ("Invisible Light")
//
//        Логика с определением цвета должна быть реализована
//        в отдельном классе LightColorDetector:
//
//class LightColorDetector {
//​
//    public String detect(int wavelength) {
//        //TODO
