package practice.hospital;

public class Hospital {
    public static double roundAvoid(double value, int places) {//для чего этот код и откуда приходят value places
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] temperatures = new float[patientsCount];
        float minTemperature = 32f;
        float maxTemperature = 40f;

        for (int i = 0; i < temperatures.length; i++) {
            temperatures[i] = (float) roundAvoid(Math.random()
                    * (maxTemperature - minTemperature) + minTemperature, 1);//почему places 1
        }
        return temperatures;
    }

       // return new float[0];


    public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
            Округлите среднюю температуру с помощью Math.round до 2 знаков после запятой,
            а температуры каждого пациента до 1 знака после запятой
        */

        StringBuilder temperaturePatients = new StringBuilder();
        float average;
        float sum = 0;

        for (float temperature : temperatureData) {//делить? зачем?
            temperaturePatients.append(temperature).append(' ');
            sum += temperature;
        }

        average = (float) roundAvoid(sum / temperatureData.length, 2);//почему places 2

        return "Температуры пациентов: " + temperaturePatients.toString().trim() +
                "\nСредняя температура: " + average +
                "\nКоличество здоровых: " + getHealthyPatients(temperatureData);
    }

    public static int getHealthyPatients(float[] temperatureData) {
        int normalTemperature = 0;
        for (float temperatureDatum : temperatureData) {

            if (temperatureDatum >= 36.2f && temperatureDatum <= 36.9f) {
                normalTemperature++;
            }
        }
        return normalTemperature;
    }
}



