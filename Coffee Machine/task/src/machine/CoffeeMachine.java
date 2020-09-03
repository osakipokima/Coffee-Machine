package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int remainingWater = 400;
        int remainingMilk = 540;
        int remainingBeans = 120;
        int remainingCups = 9;
        int remainingCash = 550;
        String coffeeHas = "This coffee machine has: ";
        boolean stay = true;

        while (stay) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String coffeeAction = scanner.next();


            switch (coffeeAction) {

                case "buy":


                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");

                    //String backToMenu = scanner.next();

                    //adjust the ingredients based on what flavor of coffee they pick
                    if (scanner.hasNextInt()) {
                        int buyCoffee = scanner.nextInt();
                        switch (buyCoffee) {
                            case 1:
                                int espressoWater = 250;
                                int espressoBeans = 16;
                                //do some calculations to adjust the amount of ingredients left to see if you have enough
                                //to make some coffee or not
                                if (remainingCups >= 1) {
                                    if (remainingWater >= espressoWater) {
                                        if (remainingBeans >= espressoBeans) {
                                            remainingWater -= espressoWater;
                                            remainingBeans -= espressoBeans;
                                            remainingCash += 4;
                                            remainingCups -= 1;
                                            System.out.println("I have enough resources, making you a coffee!\n");
                                        } else {
                                            System.out.println("Sorry, not enough coffee beans!");
                                        }
                                    } else {
                                        System.out.println("Sorry, not enough water!");
                                    }
                                } else {
                                    System.out.println("Sorry, not enough cups!");
                                }
                                break;

                            case 2:
                                int latteWater = 350;
                                int latteMilk = 75;
                                int latteBeans = 20;
                                //do some calculations to adjust the amount of ingredients left

                                if (remainingCups >= 1) {
                                    if (remainingWater >= latteWater) {
                                        if (remainingBeans >= latteBeans) {
                                            if (remainingMilk >= latteMilk) {
                                                remainingWater -= latteWater;
                                                remainingBeans -= latteBeans;
                                                remainingMilk -= latteMilk;
                                                remainingCash += 7;
                                                remainingCups -= 1;
                                                System.out.println("I have enough resources, making you a coffee!\n");
                                            } else {
                                                System.out.println("Sorry, not enough milk!");
                                            }
                                        } else {
                                            System.out.println("Sorry, not enough coffee beans!");
                                        }
                                    } else {
                                        System.out.println("Sorry, not enough water!");
                                    }
                                } else {
                                    System.out.println("Sorry, not enough cups!");

                                }
                                break;
                            case 3:
                                int cappuccinoWater = 200;
                                int cappuccinoMilk = 100;
                                int cappuccinoBeans = 12;

                                if (remainingCups >= 1) {
                                    if (remainingWater >= cappuccinoWater) {
                                        if (remainingBeans >= cappuccinoBeans) {
                                            if (remainingMilk >= cappuccinoMilk) {
                                                remainingWater -= cappuccinoWater;
                                                remainingBeans -= cappuccinoBeans;
                                                remainingMilk -= cappuccinoMilk;
                                                remainingCash += 6;
                                                remainingCups -= 1;
                                                System.out.println("I have enough resources, making you a coffee!\n");
                                            } else {
                                                System.out.println("Sorry, not enough milk!");
                                            }
                                        } else {
                                            System.out.println("Sorry, not enough coffee beans!");
                                        }
                                    } else {
                                        System.out.println("Sorry, not enough water!");
                                    }
                                } else {
                                    System.out.println("Sorry, not enough cups!");
                                }

                                break;
                            //do some calculations to adjust the amount of ingredients left

                        }

                    } else {
                        continue;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add: \n");
                    int addWater = scanner.nextInt();
                    remainingWater += addWater;
                    System.out.println("Write how many ml of milk do you want to add: \n");
                    int addMilk = scanner.nextInt();
                    remainingMilk += addMilk;
                    System.out.println("Write how many grams of coffee beans do you want to add: \n");
                    int addBeans = scanner.nextInt();
                    remainingBeans += addBeans;
                    System.out.println("Write how many disposable cups of coffee do you want to add: \n");
                    int addCups = scanner.nextInt();
                    remainingCups += addCups;

                    //adjust the ingredients based on how much ingredients you add

                    //try to figure out some type of loop to keep going
                    System.out.println("Write action (buy, fill, take, remaining, exit): " + "\n");
                    break;

                case "take":
                    System.out.println("I gave you $" + remainingCash + "\n");
                    remainingCash = 0;
                    break;

                case "remaining":
                    System.out.println("\n" + coffeeHas);
                    System.out.println(remainingWater + " of water ");
                    System.out.println(remainingMilk + " of milk ");
                    System.out.println(remainingBeans + " of coffee beans ");
                    System.out.println(remainingCups + " of disposable cups ");
                    System.out.println("$" + remainingCash + " of money \n");
                    break;

                case "exit":
                    stay = false;
                    break;

            }

        }


    }
}
