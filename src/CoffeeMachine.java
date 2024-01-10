import java.util.Scanner;

public class CoffeeMachine {
    public static void VirtualCoffeeMachine(){
        Scanner scan = new Scanner(System.in);
        boolean t = true;
        int[] supplies = {400, 540, 120, 9, 550};
        String[] resourcesNames = {"water", "milk", "coffee beans", "cups"};

        do {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
            String actionToDo = scan.nextLine();
            System.out.println(" ");

            if (actionToDo.equalsIgnoreCase("buy")){
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                String coffeeChoice = scan.next();
                scan.nextLine();
                System.out.println("");

                if (coffeeChoice.equalsIgnoreCase("1")){
                    int shortageCounter = 0;
                    if (supplies[0] >= 250){
                        if (supplies[2] >= 16){
                            if (supplies[3] >= 1){
                                System.out.println("I have enough resources, making you a coffee!");
                                supplies[0]-=250;
                                supplies[2]-=16;
                                supplies[3]-=1;
                                supplies[4]+=4;
                            }else {
                                shortageCounter=+3;
                            }
                        }else{
                            shortageCounter+=2;
                        }

                    }else {
                        System.out.println("sorry, not enough " + resourcesNames[shortageCounter] + "!");
                    }

                } else if (coffeeChoice.equalsIgnoreCase("2")) {
                    int shortageCounter = 0;
                    if (supplies[0] >= 350){
                        if (supplies[1] >= 75){
                            if (supplies[2] >= 20){
                                if (supplies[3] >= 1){
                                    System.out.println("I have enough resources, making you a coffee!");
                                    supplies[0]-=350;
                                    supplies[1]-=75;
                                    supplies[2]-=20;
                                    supplies[3]-=1;
                                    supplies[4]+=7;
                                }else {
                                    shortageCounter=+3;
                                }
                            }else{
                                shortageCounter+=2;
                            }
                        }else {
                            shortageCounter++;
                        }
                    }else {
                        System.out.println("sorry, not enough " + resourcesNames[shortageCounter] + "!");
                    }

                } else if (coffeeChoice.equalsIgnoreCase("3")) {
                    int shortageCounter = 0;
                    if (supplies[0] >= 200){
                        if (supplies[1] >= 100){
                            if (supplies[2] >= 12){
                                if (supplies[3] >= 1){
                                    System.out.println("I have enough resources, making you a coffee!");
                                    supplies[0]-=200;
                                    supplies[1]-=100;
                                    supplies[2]-=12;
                                    supplies[3]-=1;
                                    supplies[4]+=6;
                                }else {
                                    shortageCounter=+3;
                                }
                            }else{
                                shortageCounter+=2;
                            }
                        }else {
                            shortageCounter++;
                        }
                    }else {
                        System.out.println("sorry, not enough " + resourcesNames[shortageCounter] + "!");
                    }

                }else if (coffeeChoice.equalsIgnoreCase("back")){
                    // do nothing :)
                }

            } else if (actionToDo.equalsIgnoreCase("fill")) {
                System.out.println("Write how many ml of water you want to add:");
                int amountOfWater = scan.nextInt();
                supplies[0]+=amountOfWater;

                System.out.println("Write how many ml of milk you want to add:");
                int amountOfMilk = scan.nextInt();
                supplies[1]+=amountOfMilk;

                System.out.println("Write how many grams of coffee beans you want to add:");
                int amountOfCoffee = scan.nextInt();
                supplies[2]+=amountOfCoffee;

                System.out.println("Write how many disposable cups you want to add:");
                int amountOfCups = scan.nextInt();
                scan.nextLine();
                supplies[3]+=amountOfCups;
                System.out.println("");


            } else if (actionToDo.equalsIgnoreCase("take")) {
                System.out.println("I gave you $" + supplies[4]);
                supplies[4] = 0;
                System.out.println(" ");


            } else if (actionToDo.equalsIgnoreCase("remaining")) {
                System.out.println("The coffee machine has:");
                for (int i = 0; i < supplies.length; i++){
                    if (i == 0){
                        System.out.println(supplies[i] + " ml of water");
                    } else if (i == 1) {
                        System.out.println(supplies[i] + " ml of milk");
                    } else if (i == 2) {
                        System.out.println(supplies[i] + " g of coffee beans");
                    } else if (i == 3) {
                        System.out.println(supplies[i] + " disposable cups");
                    } else if (i == 4) {
                        System.out.println("$" + supplies[i] + " of money");
                    }
                }

            } else if (actionToDo.equalsIgnoreCase("exit")) {
                t = false;
            }
        }while(t);
    }
}
