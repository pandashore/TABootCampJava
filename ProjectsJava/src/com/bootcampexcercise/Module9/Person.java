package com.bootcampexcercise.Module9;

public class Person {

    private int weight;
    private float height;


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    //TODO: Create a method to calculate humans body mass index with two parameters for height and weight
    //TODO: return String which indicates persons BMI. Calculation should be used weight/(height*height)
    public double getBodyMassIndex(int weight, float height){
        double bmi = 0;
        if(weight>0 && height>0 && weight<60 && height<200) {
            bmi = weight / (height*height);
            System.out.println( "Weight " + weight + " Height " + height+" Result " + bmi + " BMI");
        }else if(weight>60 && height>200){
            System.out.println("This is what it is");
        }
        else{
            System.out.println("Standard Human");
        }
        return bmi;

    }

}
