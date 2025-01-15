public class Training {

    private int burpee_number;
    private int push_up_number;
    private int sit_up_number;
    private int squat_number;

    public int getSquat_number() {
        return squat_number;
    }

    public void setSquat_number(int squat_number) {
        this.squat_number = squat_number;
    }

    public int getSit_up_number() {
        return sit_up_number;
    }

    public void setSit_up_number(int sit_up_number) {
        this.sit_up_number = sit_up_number;
    }

    public int getPush_up_number() {
        return push_up_number;
    }

    public void setPush_up_number(int push_up_number) {
        this.push_up_number = push_up_number;
    }

    public int getBurpee_number() {
        return burpee_number;
    }

    public void setBurpee_number(int burpee_number) {
        this.burpee_number = burpee_number;
    }

    public Training(int burpee_number, int push_up_number, int squat_number, int sit_up_number) {
        this.burpee_number = burpee_number;
        this.push_up_number = push_up_number;
        this.squat_number = squat_number;
        this.sit_up_number = sit_up_number;
    }

    public void doExercise(String exerciseType, int number) {
        if (exerciseType.equals("Burpee")) {
            doBurpee(number);
        }
        else if (exerciseType.equals("Push Up")) {
            doPushUp(number);
        }
        else if (exerciseType.equals("Sit Up")) {
            doSitUp(number);
        }
        else if (exerciseType.equals("Squat")) {
            doSquat(number);
        }
        else {
            System.out.println("Invalid exercise type.");
        }
    }

    public void doBurpee(int number) {

        if (burpee_number == 0) {
            System.out.println("You finished your burpee exercise!");
        }
        else if (burpee_number < number) {
            System.out.println("Congratulations, you passed your target number of burpees.");
            burpee_number = 0;
            System.out.println("Number of remaining burpees is " + burpee_number);
        }
        else {
            burpee_number -= number;
            System.out.println("Number of remaining burpees is " + burpee_number);
        }
    }

    public void doPushUp(int number) {

        if (push_up_number == 0) {
            System.out.println("You finished your push up exercise!");
        }
        else if (push_up_number < number) {
            System.out.println("Congratulations, you passed your target number of push up.");
            push_up_number = 0;
            System.out.println("Number of remaining push up is " + push_up_number);
        }
        else {
            push_up_number -= number;
            System.out.println("Number of remaining push up is " + push_up_number);
        }
    }
    public void doSitUp(int number) {
        if (sit_up_number == 0) {
            System.out.println("You finished your sit up exercise!");
        }
        else if (sit_up_number < number) {
            System.out.println("Congratulations, you passed your target sit up.");
            sit_up_number = 0;
            System.out.println("Number of remaining sit up is " + sit_up_number);
        }
        else {
            sit_up_number -= number;
            System.out.println("Number of remaining sit up is " + sit_up_number);
        }
    }
    public void doSquat(int number) {
        if (squat_number == 0) {
            System.out.println("You finished your squat exercise!");
        }
        else if (squat_number < number) {
            System.out.println("Congratulations, you passed your target squat.");
            squat_number = 0;
            System.out.println("Number of remaining squat is " + squat_number);
        }
        else {
            squat_number -= number;
            System.out.println("Number of remaining squat is " + squat_number);
        }
    }

    public boolean exerciseFinished() {
        return (burpee_number == 0) && (push_up_number == 0) && (sit_up_number == 0) && (squat_number == 0);
    }

}
