public class Lasagna {
    private static final int EXPECTED_MINUTES_IN_OVEN = 40;
    private static final int PREPARATION_TIME_PER_LAYER = 2;
    
    public int expectedMinutesInOven(){
        return EXPECTED_MINUTES_IN_OVEN;
    }

    public int remainingMinutesInOven(int x){
        return EXPECTED_MINUTES_IN_OVEN-x;
    }

    public int preparationTimeInMinutes(int x){
        return PREPARATION_TIME_PER_LAYER*x;
    }

    public int totalTimeInMinutes(int x, int y){
        return (PREPARATION_TIME_PER_LAYER*x+y);
    }
}
