class DogTestDrive{
    public static void main (String[] args){
        Dog one = new Dog();
        one.size = 70;
        one.name = "Barry";

        Dog two = new Dog();
        two.size = 13;
        two.name = "Larry";

        Dog three = new Dog();
        three.size = 25;
        three.name ="Jerry";

        one.bark();
        two.bark();
        three.bark();
    }
}