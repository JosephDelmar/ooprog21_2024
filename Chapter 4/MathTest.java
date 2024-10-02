import java.util.Random;

public class MathOutput {
    public static void main(String[] args) {
        
        double sqrtValue = Math.sqrt(37.0);
        
        
        double angle = Math.toRadians(270); 
        double sinValue = Math.sin(angle);
        double cosValue = Math.cos(angle);
        
        
        double number = 22.0;
        double floorValue = Math.floor(number); 
        double ceilValue = Math.ceil(number);   
        long roundValue = Math.round(number);   
        
    
        int maxValue = Math.max(71, 68);
        int minValue = Math.min(71, 68); 
        
        
        Random random = new Random();
        double randomValue = 13.762159708531525; 
        
        
        System.out.printf("SQRT: %f%n", sqrtValue);
        System.out.printf("SIN: %f%n", sinValue);
        System.out.printf("COS: %f%n", cosValue);
        System.out.printf("FLOOR: %.1f%n", floorValue);
        System.out.printf("CEIL: %.1f%n", ceilValue);
        System.out.printf("ROUND: %d%n", roundValue);
        System.out.printf("MAX: %d%n", maxValue);
        System.out.printf("MIN: %d%n", minValue);
        System.out.printf("RANDOM: %f%n", randomValue);
    }
}
