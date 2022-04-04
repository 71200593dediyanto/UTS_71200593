package com.rplbo.tocm;

public class Main {
    public static double FeetIncToCm(double feet,double inch){

        if (feet <= 0 || inch <= 0 || inch > 12 ){
            return -1.0;
        } else {
            double inchkecm = inch * 2.54;
            double feetkecm = feet * 30.48;
            double totalinchfeet = inchkecm + feetkecm;
            System.out.println("Nilai dalam centimeter : "+totalinchfeet+" cm");
            return totalinchfeet;
        }
    }

    public static double FeetIncToCm(int inch){
        if (inch > 0){
            double inchtofeet = (double)inch/12;
            double hasilinch = (inchtofeet-(int)inchtofeet)*12;
            System.out.println(inch + " inc = "+(double)(int)inchtofeet + " feet "+ hasilinch + " inc" );
            return FeetIncToCm((int)inchtofeet,hasilinch);
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        FeetIncToCm(1,3);
        FeetIncToCm(15);
        FeetIncToCm(12,5);
        FeetIncToCm(30);
    }

}
