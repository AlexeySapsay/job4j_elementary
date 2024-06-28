package ru.job4j.calculator;


    public class Fit {

        /**
         * Calculates the ideal weight for a man based on his height.
         * @param heightMan Height of the man in centimeters.
         * @return Ideal weight in kilograms.
         */
        public static double calculateManIdealWeight(short heightMan) {
            return (heightMan - 100) * 1.15;
        }

        /**
         * Calculates the ideal weight for a woman based on her height.
         * @param heightWoman Height of the woman in centimeters.
         * @return Ideal weight in kilograms.
         */
    public static double calculateWomanIdealWeight(short heightWoman) {
        return (heightWoman - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 173;
        double man = Fit.calculateManIdealWeight(height);
        System.out.println("Man 173 is " + man);
        double woman = Fit.calculateWomanIdealWeight(height);
        System.out.println("Woman 173 is " + woman);

    }
}


