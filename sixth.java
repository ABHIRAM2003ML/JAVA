// Finding Fare of car Taxi

class RideCab {
    public static void name(String[] args) {
        int cd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance of driver to the user: ");
        cd = sc.nextInt();
        if (cd > 5); {
            Cab ob = new Cab(50+10 * (cd-5));
            System.out.print("Enter the distance travalled by the user: ");
            ob.d = sc.nextInt();
            ob.fare += 10 * ob.d;
            System.out.print("Total fare:Rs " + ob.fare);
        }
        else {
            Cab ob = new Cab();
            System.out.print("Enter the distance travalled by the user: ");
            ob.d = sc.nextInt();
            ob.fare += 10 * ob.d;
            System.out.print("Total fare:Rs " + ob.fare);
            
            Cab ob1 = new Cab(ob);
        }
    }
}

/* Difference between final , finally and finalize

1. final : This is a keyword that can only assign one value and cant be changed
           again and always a fixed value in that class.

2. finally : This used to create a code that follows other one 
             and always wish to execute ,despite happening withing 
             the code.           
3. finalize : This is used to clean up or destroy that is just 
            prior to the object created.
*/