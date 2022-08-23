 package base;
public class AverageAge {

    public static void main(String[] args) {

        String[] age = {"35","26","32","44"};

        AverageAge averageAge = new AverageAge();

         String average = averageAge.averageAgeCalculator(age);

        System.out.println("average = " + average);

    }

    public String averageAgeCalculator(String[] ageRawData){
        double average = 0;
        int total = 0;
        try{
            for (int i = 0; i < ageRawData.length ; i++) {
                 total =  total + Integer.parseInt(ageRawData[i]) ;
                average = total/ageRawData.length;
            }

        } catch (NumberFormatException e) {
            System.out.println("e = " + e);
        }
        String result = String.valueOf(average);
        return result;
    }
}
