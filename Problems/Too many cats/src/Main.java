class Cat {

    // write static and instance variables
    String catName;
    int catAge;
    public static int counter;

    public Cat(String name, int age) {
        // implement the constructor
        catName = name;
        catAge = age;
        counter++;
        if(counter > 5) {
            System.out.println("You have too many cats");
        }
        // do not forget to check the number of cats
    }

    public static int getNumberOfCats() {
        // implement the static method
        return counter;
    }
}