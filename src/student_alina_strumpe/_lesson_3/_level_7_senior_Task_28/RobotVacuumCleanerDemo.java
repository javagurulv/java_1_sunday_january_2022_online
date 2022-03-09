package student_alina_strumpe._lesson_3._level_7_senior_Task_28;

public class RobotVacuumCleanerDemo {

    public static void main(String[] args){

        RobotVacuumCleaner robotVacuumCleaner = new RobotVacuumCleaner("Hobot","Black", false);
        String vacClnModel = robotVacuumCleaner.getModel();
        String vacClnColor = robotVacuumCleaner.getVacClColor();
        double vacClStartTime = robotVacuumCleaner.setCleanStartTime();
        double vacClTime = robotVacuumCleaner.setCleanTime();
        double vacClFinishedTime = robotVacuumCleaner.calculateClFinishedTime();

        System.out.println("Model is "+vacClnModel);
        System.out.println("Color is "+vacClnColor);
        System.out.println("Start time is "+vacClStartTime);
        System.out.println("Clean time is "+vacClTime + " min.");
        robotVacuumCleaner.switchON();
        robotVacuumCleaner.voiceFinished();
        System.out.println("Time "+vacClFinishedTime +" a.m.");
        robotVacuumCleaner.switchOFF();
    }
}



// Sweet dreams, baby.