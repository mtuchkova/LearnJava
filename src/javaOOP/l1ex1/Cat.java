package javaOOP.l1ex1;

public class Cat {

    private int age;
    private double weight;
    private String name;
    private String favoriteFood;
    private boolean likesCuddle;


    public Cat() {
    }

    public Cat(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
    }

    public Cat(int age, double weight, String name, String favoriteFood, boolean likesCuddle) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.likesCuddle = likesCuddle;
    }


    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public boolean isLikesCuddle() {
        return likesCuddle;
    }

    public void setAge(int age) {
     if (age > 0) {
         this.age = age;
     } else {
         System.out.println("The value must be a positive integer!");
     }

    }

    public void setWeight(double weight) {
        if (age > 0) {
            this.weight = weight;
        } else {
            System.out.println("The value must be a positive number!");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public void setLikesCuddle(boolean likesCuddle) {
        this.likesCuddle = likesCuddle;
    }





    protected void feedCat() {
            System.out.println("You have to feed " + name + " with " + favoriteFood + ".");
    }

    protected void cuddleCat() {
        if(likesCuddle && (age < 5) && (weight < 6)) {
            System.out.println("You can hug the cat!");
        } else {
            System.out.println("The cat doesn't like to cuddle");
        }

    }


}