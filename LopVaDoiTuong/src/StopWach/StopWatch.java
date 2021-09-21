package StopWach;

public class StopWatch {
    private double startTime;
    private double endTime;

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setStartTime(double startTime){
        this.startTime = startTime;;
    }

    public void setEndTime(double endTime){
        this.endTime = endTime;;
    }

    public double getElapsedTime(){
        return getEndTime() - getStartTime();
    }
}
