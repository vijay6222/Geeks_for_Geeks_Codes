import java.util.ArrayList;

class Solution {
    // Function to return an ArrayList with exact result and formatted result
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        ArrayList<Float> result = new ArrayList<>();
        
        float exact = a / b;
        float rounded = (float)(Math.round(exact * 1000) / 1000.0);

        result.add(exact);
        result.add(rounded);

        return result;
    }
}
