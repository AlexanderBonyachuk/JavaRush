package com.javarush.task.task13.task1317;

/* 
The weather is fine
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FREEZING));
    }

//    interface Weather {
//       String getWeatherType();
//    }

    static class Today implements Weather{
        private String type;

        public String getWeatherType() {
            return type;
//            String pogoda = "";
//            if (type.equals(WeatherType.CLOUDY))
//                return WeatherType.CLOUDY;
////                pogoda = CLOUDY;
//            else {
//                if (type.equals(WeatherType.FOGGY))
//                    return WeatherType.FOGGY;
//                else {
////                pogoda = FOGGY;
//                    if (type.equals(WeatherType.FREEZING))
//                        return WeatherType.FREEZING;
//                    else
//                        return null;
//                }
//            }
//                pogoda = FREEZING;
//            return pogoda;
        }

        Today(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return String.format("Today it will be %s", this.getWeatherType());
        }
    }
}
