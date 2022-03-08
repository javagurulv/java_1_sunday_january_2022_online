package student_alina_strumpe._lesson_3._level_7_senior_Task_28;

class RobotVacuumCleaner {

    // включен - выключен / сказал- закочил работу /сказал - я застрял /

    private boolean isON;
    private String vacClnModel;
    private String vacClColor;
    private double vacClTime;
    private double vacClStartTime;
    private double vacClFinishedTime;

    public RobotVacuumCleaner(String vacClnModel, String vacClColor, boolean isOn){
        this.vacClnModel = vacClnModel;
        this.vacClColor = vacClColor;
        this.isON = isOn;
        this.vacClTime = vacClTime;
        this.vacClStartTime = vacClStartTime;

    }
     public String getModel(){ return this.vacClnModel ;}

    public String getVacClColor(){ return this.vacClColor ;}

    public double setCleanStartTime(){ return this.vacClStartTime + (double)11.01; }

    public double  setCleanTime() { return this.vacClTime + (double)1.30 ;}

    public boolean switchON() {
        boolean isOn = true;
        return isON;
    }

    public boolean switchOFF() {
        boolean isON = false;
        return false;
            }
            public void voiceFinished(){ System.out.println("Work is DONE");}

    public double calculateClFinishedTime(){ return this.vacClFinishedTime = this.vacClStartTime + this.vacClTime +
            + (double)11.01 + (double)1.30 ;}

}
