public class Main {
    private double height; // in centimeters
    private double weight; // in kilograms

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Getter for weight
    public double getWeight() {
        return weight;
    }

    // Setter for weight
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Method to calculate BMI
    public double calculateBMI() {
        // Convert height from cm to meters
        double heightInMeters = height / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }

    public static void main(String[] args) {
        BMICalculator bmiCalculator = new BMICalculator();
        bmiCalculator.setHeight(170); // height in cm
        bmiCalculator.setWeight(56);  // weight in kg

        double bmi = bmiCalculator.calculateBMI();
        System.out.println("The BMI is: " + bmi);
    }
}
