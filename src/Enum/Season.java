package Enum;

public enum Season {
    SUMMER(+30), WINTER(-15), SPRING(+15), AUTUMN(+10);

    private int temperature;
    Season(int temperature){
        this.temperature = temperature;
    }

    public int getTemperature(){
        return temperature;
    }

}
