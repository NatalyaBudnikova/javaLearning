public class IMTService {
    public String calculate(float weight, float height) {
        float imt = (float) (weight / (Math.pow(height, 2.0)));
        String result = null;

        if (imt < 16.5) {
            result = "Extreme weight loss";
        }

        if (imt >= 16.5 && imt <= 18.4) {
            result = "Lack of weight";
        }

        if (imt >= 18.5 & imt <= 24.9) {
            result = "Normal body weight";
        }

        if (imt >= 25.0 & imt <= 30.0) {
            result = "Overweight";
        }

        if (imt >= 30.1 & imt <= 34.9) {
            result = "Obesity (Class I)";
        }

        if (imt >= 35.0 & imt <= 40.0) {
            result = "Obesity (Class II)";
        }

        if (imt > 40.0) {
            result = "Obesity (Class III)";
        }

        return result;
    }
}
