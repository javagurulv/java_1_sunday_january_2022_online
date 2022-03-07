package student_vitaly_galuzo;

public class Monitor {

    private boolean powerOn;


    public Monitor(boolean isOn){
        this.powerOn = isOn;

    }

    public void switchedOn(){
        this.powerOn = true;

    }

    public void switchedOff(){
        this.powerOn = false;

    }

    public boolean isPower() {
        return powerOn;
    }
}
