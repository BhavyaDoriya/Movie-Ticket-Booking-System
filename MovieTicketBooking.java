//Changes :
//Quality of Movie , Final Bill in Square Boxe , If ticket is booked then print "Thanks for Bookng Ticket , Visit Again"
//Otherwise,Thanks for Visiting ... , Available Seats 
//Add comments
import java.util.Scanner;
class Main {
    static Scanner scanner=new Scanner(System.in);
     static void HomePage()
     {
         System.out.println("Enter 1 for Developer");
         System.out.println("Enter 2 for Customer");
         System.out.println("Enter 3 To Terminate programme");
         int choice=scanner.nextInt();
         
         switch(choice)
         {
             case 1:
             Developer.developerAction();
             break;
             case 2:
             Customer.customerAction();
             break;
             case 3:
             System.out.println("Program terminated successfully");
             break;
             default:
             System.out.println("Enter valid choice!");
             HomePage();
             break;
         }
     }
     public static void main(String[] args) {
         ComedyMovies.defaultMovies();
         RomanceMovies.defaultMovies();
         ActionMovies.defaultMovies();
         SliceOfLifeMovies.defaultMovies();
         HorrorMovies.defaultMovies();
         AnimatedMovies.defaultMovies();
         ScienceFictionMovies.defaultMovies();
         Theatre.defaultTheatre();
         HomePage();
     }
 }
 class Developer {
    static String developer_password="@integration09";
    static void developerAction()
    {
        System.out.println("Enter your admin password :");
        String tryPass=Main.scanner.nextLine();
        if(tryPass.equals(developer_password))
        {
            System.out.println("What would you like to do ?");
            System.out.println("Enter 1 to Add a Movie");
            System.out.println("Enter 2 to Delete a Movie");
            System.out.println("Enter 3 to for logging out and going back to Home page");
            int choice=Main.scanner.nextInt();
            switch(choice)
            {
                case 1:
                addMovies();
                developerAction();
                break;
                case 2:
                deleteMovies();
                developerAction();
                break;
                case 3:
                System.out.println("Going Back to Home Page");
                Main.HomePage();
                break;
                default:
                System.out.println("Enter valid choice next time,Going back to home page by default");
                Main.HomePage();
                break;
            }
        }
        else
        {
            System.out.println("Invalid Password!");
            System.out.println("Try again!");
            System.out.println("Back To Home Page");
            Main.HomePage();
        }
    }
    static void addMovies() {
        boolean check = false;
        System.out.println("How many Genre does your movie have?(1-7)//Press 8 to exit.");
        int NumOfGenre = Main.scanner.nextInt();
        do {
            if(NumOfGenre==8)
            {
                return;
            }
            else if (NumOfGenre >= 1 && NumOfGenre <= 7) {
                check = false;
            } else {
                System.out.println("Enter valid Number of Genre(1-7)/Press '8' to exit ");
                NumOfGenre = Main.scanner.nextInt();
                check = true;
            }
        } while (check);

        String GenreofMovie[] = new String[NumOfGenre];

        System.out.println("Available Genres:");
        for (int i = 0; i < Movies.existingGenre.length; i++) {
            System.out.println("*" + Movies.existingGenre[i]);
        }
        boolean check1 = false;
        System.out.println("Enter Genres of Movies(In the above format)://Press Q to exit.");
        for (int i = 0; i < NumOfGenre; i++) {
            for (;;) {
                GenreofMovie[i] = Main.scanner.nextLine();
                if(GenreofMovie[i].equals("Q"))
                {
                    return;
                }
                for (int j = 0; j < Movies.existingGenre.length; j++) {
                    if (GenreofMovie[i].equals(Movies.existingGenre[j])) {
                        check1 = true;
                        break;
                    }
                }
                if (check1 == false) {
                    System.out.println("Enter valid Genre or Press Q to exit.");
                } else {
                    break;
                }
            }
        }
        System.out.println("Enter the name of movie you want to add/Press Q to exit:");
        String name = Main.scanner.nextLine();
        if(name.equals("Q"))
        {
            return;
        }
        for (int i = 0; i < NumOfGenre; i++) {
            switch (GenreofMovie[i]) {
                case "Comedy":

                    ComedyMovies.ComedyMovieslist[ComedyMovies.index] = new ComedyMovies(name, GenreofMovie);
                    ComedyMovies.index++;
                    break;
                case "Action":

                    ActionMovies.ActionMovieslist[ActionMovies.index] = new ActionMovies(name, GenreofMovie);
                    ActionMovies.index++;
                    break;
                case "Slice of Life":
                    SliceOfLifeMovies.SliceOfLifeMovieslist[SliceOfLifeMovies.index] = new SliceOfLifeMovies(name, GenreofMovie);
                    SliceOfLifeMovies.index++;
                    break;
                case "Horror":
                    HorrorMovies.HorrorMovieslist[HorrorMovies.index] = new HorrorMovies(name, GenreofMovie);
                HorrorMovies.index++;
                    break;
                case "Science Fiction":
                    ScienceFictionMovies.ScienceFictionMovieslist[ScienceFictionMovies.index] = new ScienceFictionMovies(name, GenreofMovie);
                    ScienceFictionMovies.index++;
                    break;
                case "Romance":
                    RomanceMovies.RomanceMovieslist[RomanceMovies.index] = new RomanceMovies(name, GenreofMovie);
                    RomanceMovies.index++;
                    break;
                case "Animated":
                    AnimatedMovies.AnimatedMovieslist[AnimatedMovies.index] = new AnimatedMovies(name, GenreofMovie);
                    AnimatedMovies.index++;

                    break;

            }
        }
                
                System.out.println("Enter the name of theatres you would like to add this movie to: ");
                System.out.println("Available Theatres: ");
                for(int i=0;i<Theatre.index;i++)
                {
                    System.out.println("* "+Theatre.TheatreList[i].name);
                }
                for(;;)
                {   
                    String theatre_name=Main.scanner.nextLine();
                    for(int i=0;i<Theatre.index;i++)
                    {
                        if(Theatre.TheatreList[i].name.equals(theatre_name))
                        {
                            Theatre.TheatreList[i].availableMovies[Theatre.TheatreList[i].movieIndex]=name;
                            Theatre.TheatreList[i].movieIndex++;
                            System.out.println("Movie Successfully added to "+Theatre.TheatreList[i].name);
                            check=true;
                            break;
                        }
                    }
                    if(check==false)
                    {
                        System.out.println("Invalid Theatre Name");
                        System.out.println("Re-enter Theatre Name or press Q to exit.");
                        theatre_name=Main.scanner.nextLine();
                    }
                    else
                    {
                        System.out.println("Enter another Theatre in which you would like to add this movie to or Press Q to exit: ");
                        theatre_name=Main.scanner.nextLine();
                    }
                    if(theatre_name.equals("Q"))
                    {
                        System.out.println("Exited Add movie method succesfully");
                        developerAction();
                        break;
                    }
                }
    }

    static void deleteMovies() {
        System.out.println("Enter the name of Movie you want to delete or press Q to exit");
        String name = Main.scanner.nextLine();
        boolean check = true;
        for (; check;) {
            if(name.equals("Q"))
            {
                return;
            }
            for (int i = 0; i < ComedyMovies.index; i++) {
                if (name.equals(ComedyMovies.ComedyMovieslist[i].name)) {

                    for (int j = i; j < ComedyMovies.index - 1; j++) {
                        ComedyMovies.ComedyMovieslist[j] = ComedyMovies.ComedyMovieslist[j + 1];
                    }
                    ComedyMovies.ComedyMovieslist[ComedyMovies.index - 1] = null;
                    ComedyMovies.index--;
                    check = false;
                    break;
                }
            }
            for (int i = 0; i < ActionMovies.index; i++) {
                if (name.equals(ActionMovies.ActionMovieslist[i].name)) {

                    for (int j = i; j < ActionMovies.index - 1; j++) {
                        ActionMovies.ActionMovieslist[j] = ActionMovies.ActionMovieslist[j + 1];
                    }
                    ActionMovies.ActionMovieslist[ActionMovies.index - 1] = null;
                    ActionMovies.index--;
                    check = false;
                    break;
                }
            }
            for (int i = 0; i < SliceOfLifeMovies.index; i++) {
                if (name.equals(SliceOfLifeMovies.SliceOfLifeMovieslist[i].name)) {

                    for (int j = i; j < SliceOfLifeMovies.index - 1; j++) {
                        SliceOfLifeMovies.SliceOfLifeMovieslist[j] = SliceOfLifeMovies.SliceOfLifeMovieslist[j + 1];
                    }
                    SliceOfLifeMovies.SliceOfLifeMovieslist[SliceOfLifeMovies.index - 1] = null;
                    SliceOfLifeMovies.index--;
                    check = false;
                    break;
                }
            }
            for (int i = 0; i < HorrorMovies.index; i++) {
                if (name.equals(HorrorMovies.HorrorMovieslist[i].name)) {

                    for (int j = i; j < HorrorMovies.index - 1; j++) {
                        HorrorMovies.HorrorMovieslist[j] = HorrorMovies.HorrorMovieslist[j + 1];
                    }
                    HorrorMovies.HorrorMovieslist[HorrorMovies.index - 1] = null;
                    HorrorMovies.index--;
                    check = false;
                    break;
                }
            }
            for (int i = 0; i < ScienceFictionMovies.index; i++) {
                if (name.equals(ScienceFictionMovies.ScienceFictionMovieslist[i].name)) {

                    for (int j = i; j < ScienceFictionMovies.index - 1; j++) {
                        ScienceFictionMovies.ScienceFictionMovieslist[j] = ScienceFictionMovies.ScienceFictionMovieslist[j
                                + 1];
                    }
                    ScienceFictionMovies.ScienceFictionMovieslist[ScienceFictionMovies.index - 1] = null;
                    ScienceFictionMovies.index--;
                    check = false;
                    break;
                }
            }
            for (int i = 0; i < RomanceMovies.index; i++) {
                if (name.equals(RomanceMovies.RomanceMovieslist[i].name)) {

                    for (int j = i; j < RomanceMovies.index - 1; j++) {
                        RomanceMovies.RomanceMovieslist[j] = RomanceMovies.RomanceMovieslist[j + 1];
                    }
                    RomanceMovies.RomanceMovieslist[RomanceMovies.index - 1] = null;
                    RomanceMovies.index--;
                    check = false;
                    break;
                }
            }
            for (int i = 0; i < AnimatedMovies.index; i++) {
                if (name.equals(AnimatedMovies.AnimatedMovieslist[i].name)) {

                    for (int j = i; j < AnimatedMovies.index - 1; j++) {
                        AnimatedMovies.AnimatedMovieslist[j] = AnimatedMovies.AnimatedMovieslist[j + 1];
                    }
                    AnimatedMovies.AnimatedMovieslist[AnimatedMovies.index - 1] = null;
                    AnimatedMovies.index--;
                    check = false;
                    break;
                }
            }

            if (check) {
                System.out.println("Invalid Name: ");
                System.out.println("Re-enter the name of movie or press 'Q' to exit:");
                name = Main.scanner.nextLine();
                
            } else {
                break;
            }
        }
        //For deleting Movie from Theatre
        for(int i=0;i<Theatre.index;i++)
        {
            if(name.equals("Q"))
            {
                break;
            }
            for(int j=0;j<Theatre.TheatreList[i].movieIndex;j++)
            {
                if(Theatre.TheatreList[i].availableMovies[j].equals(name))
                {
                    for(int k=j;k<Theatre.TheatreList[i].movieIndex-1;k++)
                    {
                        Theatre.TheatreList[i].availableMovies[k]=Theatre.TheatreList[i].availableMovies[k+1];
                    }
                        Theatre.TheatreList[i].availableMovies[Theatre.TheatreList[i].movieIndex-1]=null;
                        Theatre.TheatreList[i].movieIndex--;
                }
            }
        }
    }
}

 class Customer {
    static int customerCount = 0; // Number of existing customers
    static Customer customerList[]=new Customer[20];
    String customer_name;
    String user_name;
    String pass;
    static int current_customer_index;
    double total_bill;
    int choosenTheatreIndex=0;
    int choosenMovieIndex=0;

    Customer(String customer_name,String user_name,String pass)
    {
        this.customer_name=customer_name;
        this.user_name=user_name;
        this.pass=pass;
    }
    

    static void createAccount() {
        
        if(customerCount>=customerList.length)
        {
            System.out.println("Too Many Customers!");
            System.out.println("Cannot store any more data. Customer can't create account.");
            return;
        }
        System.out.println("Enter your name: ");
        String name = Main.scanner.nextLine();

        System.out.println("Enter a username: ");
        String username = Main.scanner.nextLine();

        // Check if the username is already taken
        for (int i = 0; i < customerCount; i++) {
            if (customerList[i].user_name.equals(username)) {
                System.out.println("An account with this name already exists. Try logging in or enter different user name.");
                return;
            }
        }

        System.out.println("Enter a password: ");
        String password = Main.scanner.nextLine();

        // Save the new user
        customerList[customerCount]=new Customer(name, username, password);
        customerCount++;
        System.out.println("Account created successfully!");
        System.out.println("Returning to customer page.");
    }

    static void login() {

        System.out.println("Enter username: ");
        String username = Main.scanner.nextLine();

        System.out.println("Enter password: ");
        boolean check=true;
        String password = Main.scanner.nextLine();
        boolean check2=true;
        for(;;)
        {
            for (int i = 0; i < customerCount; i++) {
                if (customerList[i].user_name.equals(username) && customerList[i].pass.equals(password)) {
                    System.out.println("Login successful! Welcome, " + username);
                    current_customer_index=i;
                    check=false;
                    break;
                }
            }
            if(check)
            {
                System.out.println("Re-enter correct login details!: ");
                System.out.println("Enter your username or press Q to exit");
                username=Main.scanner.nextLine();
                if(username.equals("Q"))
                {
                    check2=false;
                    break;
                }
                else
                {
                    System.out.println("Enter your password:");
                    password=Main.scanner.nextLine();
                }
            }
            else
            {
                break;
            }
        }
        if(check2)
        {
        customerActionAfterLogin();
        
        }
        else
        {
            return;
        }

    }
    static void customerAction()
    {
        
        System.out.println("Enter 1 to Create account");
        System.out.println("Enter 2 to Login account");
        System.out.println("Enter 3 to return to the Home page");
        int choice=Main.scanner.nextInt();
        Main.scanner.nextLine();
        switch(choice)
        {
            case 1:
            createAccount();
            customerAction();
            break;

            case 2:
            login();
            customerAction();
            break;

            case 3:
            System.out.println("Returning to HomePage");
            Main.HomePage();
            break;

            default:
            System.out.println("Enter Valid Option:");
            customerAction();
        }
    }

    static void customerActionAfterLogin()
    {
        System.out.println("What would you like to do?");
        System.out.println("Enter 1 to see list of All Movies (sorted by genre):");
        System.out.println("Enter 2 to see list of Comedy Movies :");
        System.out.println("Enter 3 to see list of Slice Of Life Movies :");
        System.out.println("Enter 4 to see list of Romance Movies :");
        System.out.println("Enter 5 to see list of Science Fiction Movies :");
        System.out.println("Enter 6 to see list of Animated Movies :");
        System.out.println("Enter 7 to see list of Horror Movies :");
        System.out.println("Enter 8 to see list of Action Movies :");
        System.out.println("Enter 9 to logout:");
        int choice=Main.scanner.nextInt();
        switch(choice)
        {
            case 1:
			System.out.println();
            System.out.println("*****Comedy Movies:***** ");
            ComedyMovies.print();
			System.out.println();
            System.out.println("*****Slice of Life Movies:*****");
            SliceOfLifeMovies.print();
			System.out.println();
            System.out.println("*****Romance Movies*****");
            RomanceMovies.print();
			System.out.println();
            System.out.println("*****Science Fiction Movies*****");
            ScienceFictionMovies.print();
			System.out.println();
            System.out.println("*****Animated Movies:*****");
            AnimatedMovies.print();
			System.out.println();
            System.out.println("*****Horror Movies*****");
            HorrorMovies.print();
			System.out.println();
            System.out.println("*****Action Movies*****");
            ActionMovies.print();
            System.out.println("");
            System.out.println("**************************************************");
            System.out.println("");
            customerList[current_customer_index].bookYourMovie();
            customerActionAfterLogin();
            break;

            case 2:
            System.out.println("*****Comedy Movies:***** ");
            ComedyMovies.print();
			customerList[current_customer_index].bookYourMovie();
            customerActionAfterLogin();
            break;
			
            case 3:
            System.out.println("*****Slice of Life Movies:*****");
            SliceOfLifeMovies.print();
			customerList[current_customer_index].bookYourMovie();
            customerActionAfterLogin();
			break;
			
            case 4:
            System.out.println("*****Romance Movies*****");
            RomanceMovies.print();
			customerList[current_customer_index].bookYourMovie();
            customerActionAfterLogin();
            break;
			
            case 5:
            System.out.println("*****Science Fiction Movies*****");
            ScienceFictionMovies.print();
			customerList[current_customer_index].bookYourMovie();
            customerActionAfterLogin();
			break;
			
            case 6:
            System.out.println("*****Animated Movies:*****");
            AnimatedMovies.print();
			customerList[current_customer_index].bookYourMovie();
            customerActionAfterLogin();
			break;
			
            case 7:
            System.out.println("*****Horror Movies*****");
            HorrorMovies.print();
			customerList[current_customer_index].bookYourMovie();
            customerActionAfterLogin();
			break;
			
            case 8:
            System.out.println("*****Action Movies*****");
            ActionMovies.print();
			customerList[current_customer_index].bookYourMovie();
            customerActionAfterLogin();
			break;
			
            case 9:
            System.out.println("log out succesful");
            System.out.println("Back to Customer Page");
            return;
            
			default:
			System.out.println("Enter Valid Option !");
			customerActionAfterLogin();
        }
    }

    void bookYourMovie()
    {
        
        System.out.println("Enter the name of the movie you want to buy tickets for/Press Q to exit.");
        String nameofBooking=Main.scanner.nextLine();
        for(;;)
        {
            nameofBooking=Main.scanner.nextLine();
            if(Movies.checkMovieExist(nameofBooking))
            {
                break;
            }
            else if(nameofBooking.equals("Q"))
            {
                return;
            }
            else 
            {
                System.out.println("Invalid Action,Re Enter Movie Name or Press Q to Exit");
            }
        }
        System.out.println("Available Theatres for the movie *"+nameofBooking+"*");
        for(int i=0;i<Theatre.index;i++)
        {
            for(int j=0;j<Theatre.TheatreList[i].movieIndex;j++)
            {
                if(Theatre.TheatreList[i].availableMovies[j].equals(nameofBooking))
                {
                    this.choosenMovieIndex=j;
                    System.out.println("* "+Theatre.TheatreList[i].name);
                    System.out.println("Location : "+Theatre.TheatreList[i].location);
                }
            }
        }
        System.out.println("Enter the name of theatre you want to book ticket in : ");
        String nameOfTheatre=Main.scanner.nextLine();
        boolean check=false;
        
        for(;;)
        {
            for(int i=0;i<Theatre.index;i++)
            {
                if(Theatre.TheatreList[i].name.equals(nameOfTheatre))
                {
                    this.choosenTheatreIndex=i;
                    check=true;
                    break;
                }
            }
            if(check==false)
            {
                System.out.println("Invalid Theatre Name. Re enter theatre name.");
                nameOfTheatre=Main.scanner.nextLine();
            }
            else
            {
                break;
            }
        }

        double basePrice_local=Theatre.TheatreList[this.choosenTheatreIndex].basePrice[this.choosenMovieIndex];
        System.out.println("Pricing For Your Movie In The Selected Theatre :");
        System.out.println("Seat: Silver");
        System.out.println("Timings:");
        System.out.println("Morning : price--> "+(calculatePrice(nameOfTheatre, nameofBooking)*Theatre.timeFactor[0]*Theatre.seatFactor[0]));
        System.out.println("Afternoon : price--> "+(calculatePrice(nameOfTheatre, nameofBooking)*Theatre.timeFactor[1]*Theatre.seatFactor[0]));
        System.out.println("Night : price--> "+(calculatePrice(nameOfTheatre, nameofBooking)*Theatre.timeFactor[2]*Theatre.seatFactor[0]));
        System.out.println("Seat: Gold");
        System.out.println("Timings:");
        System.out.println("Morning : price--> "+(calculatePrice(nameOfTheatre, nameofBooking)*Theatre.timeFactor[0]*Theatre.seatFactor[1]));
        System.out.println("Afternoon : price--> "+(calculatePrice(nameOfTheatre, nameofBooking)*Theatre.timeFactor[1]*Theatre.seatFactor[1]));
        System.out.println("Night : price--> "+(calculatePrice(nameOfTheatre, nameofBooking)*Theatre.timeFactor[2]*Theatre.seatFactor[1]));
        System.out.println("Seat: Platinum");
        System.out.println("Timings:");
        System.out.println("Morning : price--> "+(calculatePrice(nameOfTheatre, nameofBooking)*Theatre.timeFactor[0]*Theatre.seatFactor[2]));
        System.out.println("Afternoon : price--> "+(calculatePrice(nameOfTheatre, nameofBooking)*Theatre.timeFactor[1]*Theatre.seatFactor[2]));
        System.out.println("Night : price--> "+(calculatePrice(nameOfTheatre, nameofBooking)*Theatre.timeFactor[2]*Theatre.seatFactor[2]));
        System.out.println("Select Seat Category:(Enter-->1-->Silver,2-->Gold,3-->Platinum) ");
        int seatCategory=Main.scanner.nextInt();
        seatCategory--;

        for(;;)
        {
            if(seatCategory>=0&&seatCategory<=2)
            {
                break;
            }
            else
            {
                System.out.println("Enter valid seat category(1-3)");
                seatCategory=Main.scanner.nextInt();
                seatCategory--;
            }
        }
        System.out.println("Enter timings for your show:--> 1-->Morning,2-->Afternoon,3-->Night");
        int timeCategory=Main.scanner.nextInt();
        timeCategory--;
        for(;;)
        {
            if(timeCategory>=0&&timeCategory<=2)
            {
                break;
            }
            else
            {
                System.out.println("Re-enter Enter valid timings.");
                timeCategory=Main.scanner.nextInt();
                timeCategory--;
            }
        }
        System.out.println("Enter the Quantity for tickets: ");
        int quantity=Main.scanner.nextInt();
        for(;;)
        {
            if(quantity<=0)
            {
                System.out.println("Quanity should atleast be 1.");
                System.out.println("Re-Enter Quantity");
                quantity=Main.scanner.nextInt();
            }
            else{
                break;
            }
        }
        System.out.println("*****************************************************************");
        System.out.println("Customer Name : "+this.customer_name);
        System.out.println("Customer ID : "+this.user_name);
        System.out.println("Theatre name :"+Theatre.TheatreList[choosenTheatreIndex].name);
        System.out.println("Theatre Location :"+Theatre.TheatreList[choosenTheatreIndex].location);
        System.out.println("Movie Name : "+Theatre.TheatreList[choosenTheatreIndex].availableMovies[choosenMovieIndex]);
        System.out.print("Seat : ");
        if(seatCategory==0)
        {
            System.out.println("Silver");
        }
        else if(seatCategory==1)
        {
            System.out.println("Gold");
        }
        else 
        {
            System.out.println("Platinum");
        }
        System.out.print("Show time: ");
        if(timeCategory==0)
        {
            System.out.println("Morning");
        }
        else if(timeCategory==1)
        {
            System.out.println("Afternoon");
        }
        else 
        {
            System.out.println("Night");
        }
        System.out.println("Quantity : "+quantity);
        calculateTotalBill(basePrice_local, seatCategory, timeCategory, quantity);

    }

    void calculateTotalBill(double basePrice,int seatCategory,int timeCategory,int quantity)
    {
        total_bill=basePrice*Theatre.timeFactor[timeCategory]*Theatre.seatFactor[seatCategory]*quantity;
        System.out.println("Total Bill : "+total_bill);
        System.out.println("Ticket booked successfully");
        System.out.println("Thank you for visiting.");
        System.out.println("*****************************************************************");
    }
    double calculatePrice(String nameOfTheatre,String nameOfBooking)
    {
            double price=0;
            for(int i=0;i<Theatre.index;i++)
            {
                if(Theatre.TheatreList[i].name.equals(nameOfTheatre))
                {
                    for(int j=0;j<Theatre.TheatreList[i].movieIndex;j++)
                    {
                       if(Theatre.TheatreList[i].availableMovies[j].equals(nameOfBooking))
                        {
                            price=Theatre.TheatreList[i].basePrice[j];
                        }
                    }
                    break;
                }
            }
            return price;
    }
}

class Movies {
    String name;
    String GenreofMovie[];
    static String existingGenre[] = new String[] { "Comedy", "Action", "Slice of Life", "Horror", "Science Fiction",
            "Romance",
            "Animated" };
    static boolean checkMovieExist(String name)
    { 
         boolean check=false;
        for (int i = 0; i < ComedyMovies.index; i++) {
            if (name.equals(ComedyMovies.ComedyMovieslist[i].name)) {
                check=true;
                break;
            }
        }
        for (int i = 0; i < ActionMovies.index; i++) {
            if (name.equals(ActionMovies.ActionMovieslist[i].name)) {

                check=true;
                break;
            }
        }
        for (int i = 0; i < SliceOfLifeMovies.index; i++) {
            if (name.equals(SliceOfLifeMovies.SliceOfLifeMovieslist[i].name)) {

                check = true;
                break;
            }
        }
        for (int i = 0; i < HorrorMovies.index; i++) {
            if (name.equals(HorrorMovies.HorrorMovieslist[i].name)) {

                check=true;
                break;
            }
        }
        for (int i = 0; i < ScienceFictionMovies.index; i++) {
            if (name.equals(ScienceFictionMovies.ScienceFictionMovieslist[i].name)) {

               
                check = true;
                break;
            }
        }
        for (int i = 0; i < RomanceMovies.index; i++) {
            if (name.equals(RomanceMovies.RomanceMovieslist[i].name)) {

                
                check = true;
                break;
            }
        }
        for (int i = 0; i < AnimatedMovies.index; i++) {
            if (name.equals(AnimatedMovies.AnimatedMovieslist[i].name)) {

              
                check = true;
                break;
            }
        }
        return check;
    }

}

class ComedyMovies extends Movies {

    static int index = 0;
    static ComedyMovies ComedyMovieslist[] = new ComedyMovies[50];

    ComedyMovies() {

    }

    ComedyMovies(String name, String GenreofMovie[]) {
        this.name = name;
        this.GenreofMovie = new String[GenreofMovie.length];
        this.GenreofMovie = GenreofMovie;
    }

    static void defaultMovies() {
        ComedyMovieslist[index] = new ComedyMovies();
        ComedyMovieslist[index].name = "PK";
        index++;
        ComedyMovieslist[index] = new ComedyMovies();
        ComedyMovieslist[index].name = "Hera Pheri";
        index++;
        ComedyMovieslist[index] = new ComedyMovies();
        ComedyMovieslist[index].name = "Munna Bhai M.B.B.S.";
        index++;
        ComedyMovieslist[index] = new ComedyMovies();
        ComedyMovieslist[index].name = "Bhool Bhoolaiya";
        index++;
        ComedyMovieslist[index] = new ComedyMovies();
        ComedyMovieslist[index].name = "The Fall Guy";
        index++;
        ComedyMovieslist[index] = new ComedyMovies();
        ComedyMovieslist[index].name = "3 Idiots";
        index++;
        ComedyMovieslist[index] = new ComedyMovies();
        ComedyMovieslist[index].name = "Kung Fu Panda";
        index++;
    }

   static void print() {
        for (int i = 0; i < ComedyMovies.index; i++) {
            System.out.println("* " + ComedyMovieslist[i].name);

        }
    }

}

class ActionMovies extends Movies {

    static int index = 0;
    static ActionMovies ActionMovieslist[] = new ActionMovies[50];

    ActionMovies() {

    }

    ActionMovies(String name, String GenreofMovie[]) {
        this.name = name;
        this.GenreofMovie = new String[GenreofMovie.length];
        this.GenreofMovie = GenreofMovie;
    }

    static void defaultMovies() {
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "Gladiator";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "John Wick";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "War";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "The Dark Knight";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "The Avengers";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "Star-Wars";
        index++;

    }
    static void print() {
        for (int i = 0; i < ActionMovies.index; i++) {
            System.out.println("* " + ActionMovieslist[i].name);

        }
    }
}

class SliceOfLifeMovies extends Movies {
    static int index = 0;
    static SliceOfLifeMovies SliceOfLifeMovieslist[] = new SliceOfLifeMovies[50];

    SliceOfLifeMovies() {

    }

    SliceOfLifeMovies(String name, String GenreofMovie[]) {
        this.name = name;
        this.GenreofMovie = new String[GenreofMovie.length];
        this.GenreofMovie = GenreofMovie;
    }

   static void defaultMovies() {
        SliceOfLifeMovieslist[index] = new SliceOfLifeMovies();
        SliceOfLifeMovieslist[index].name = "Zindagi Na Milegi Dobara";
        index++;
        SliceOfLifeMovieslist[index] = new SliceOfLifeMovies();
        SliceOfLifeMovieslist[index].name = "Wake Up Sid";
        index++;
        SliceOfLifeMovieslist[index] = new SliceOfLifeMovies();
        SliceOfLifeMovieslist[index].name = "The Pursuit Of Happyness";
        index++;
        SliceOfLifeMovieslist[index] = new SliceOfLifeMovies();
        SliceOfLifeMovieslist[index].name = "My Neighbour Totoro";
        index++;
        SliceOfLifeMovieslist[index] = new SliceOfLifeMovies();
        SliceOfLifeMovieslist[index].name = "The Wind Rises";
        index++;
        SliceOfLifeMovieslist[index] = new SliceOfLifeMovies();
        SliceOfLifeMovieslist[index].name = "3 Idiots";
        index++;
        SliceOfLifeMovieslist[index] = new SliceOfLifeMovies();
        SliceOfLifeMovieslist[index].name = "Flavors Of Youth";
        index++;

    }
    static void print() {
        for (int i = 0; i < SliceOfLifeMovies.index; i++) {
            System.out.println("* " + SliceOfLifeMovieslist[i].name);

        }
    }

}

class HorrorMovies extends Movies {
    static int index = 0;
    static HorrorMovies HorrorMovieslist[] = new HorrorMovies[50];

    HorrorMovies() {

    }

    HorrorMovies(String name, String GenreofMovie[]) {
        this.name = name;
        this.GenreofMovie = new String[GenreofMovie.length];
        this.GenreofMovie = GenreofMovie;
    }

    static void defaultMovies() {

        HorrorMovieslist[index] = new HorrorMovies();
        HorrorMovieslist[index].name = "Bhool Bhoolaiya";
        index++;
        HorrorMovieslist[index] = new HorrorMovies();
        HorrorMovieslist[index].name = "Evil Dead(2013)";
        index++;
        HorrorMovieslist[index] = new HorrorMovies();
        HorrorMovieslist[index].name = "The Grudge";
        index++;
        HorrorMovieslist[index] = new HorrorMovies();
        HorrorMovieslist[index].name = "Tumbbad";
        index++;
        HorrorMovieslist[index] = new HorrorMovies();
        HorrorMovieslist[index].name = "Terrifier(2016)";
        index++;

    }

    static void print() {
        for (int i = 0; i < HorrorMovies.index; i++) {
            System.out.println("* " + HorrorMovieslist[i].name);

        }
    }
}

class ScienceFictionMovies extends Movies {

    static int index = 0;
    static ScienceFictionMovies ScienceFictionMovieslist[] = new ScienceFictionMovies[50];

    ScienceFictionMovies() {

    }

    ScienceFictionMovies(String name, String GenreofMovie[]) {
        this.name = name;
        this.GenreofMovie = new String[GenreofMovie.length];
        this.GenreofMovie = GenreofMovie;
    }

    static void defaultMovies() {
        ScienceFictionMovieslist[index] = new ScienceFictionMovies();
        ScienceFictionMovieslist[index].name = "Interstellar";
        index++;
        ScienceFictionMovieslist[index] = new ScienceFictionMovies();
        ScienceFictionMovieslist[index].name = "The Martian";
        index++;
        ScienceFictionMovieslist[index] = new ScienceFictionMovies();
        ScienceFictionMovieslist[index].name = "PK";
        index++;
        ScienceFictionMovieslist[index] = new ScienceFictionMovies();
        ScienceFictionMovieslist[index].name = "Big Hero 6";
        index++;
        ScienceFictionMovieslist[index] = new ScienceFictionMovies();
        ScienceFictionMovieslist[index].name = "Wall-E";
        index++;
        ScienceFictionMovieslist[index] = new ScienceFictionMovies();
        ScienceFictionMovieslist[index].name = "Blade Runner 2049";
        index++;
        ScienceFictionMovieslist[index] = new ScienceFictionMovies();
        ScienceFictionMovieslist[index].name = "Arrival";
        index++;
        ScienceFictionMovieslist[index] = new ScienceFictionMovies();
        ScienceFictionMovieslist[index].name = "Gravity";
        index++;
        ScienceFictionMovieslist[index] = new ScienceFictionMovies();
        ScienceFictionMovieslist[index].name = "The Passenger";
        index++;
        ScienceFictionMovieslist[index] = new ScienceFictionMovies();
        ScienceFictionMovieslist[index].name = "Star Wars";
        index++;

    }

    static void print() {
        for (int i = 0; i < ScienceFictionMovies.index; i++) {
            System.out.println("* " + ScienceFictionMovieslist[i].name);

        }
    }
}

class RomanceMovies extends Movies {

    static int index = 0;
    static RomanceMovies RomanceMovieslist[] = new RomanceMovies[50];

    RomanceMovies() {

    }

    RomanceMovies(String name, String GenreofMovie[]) {
        this.name = name;
        this.GenreofMovie = new String[GenreofMovie.length];
        this.GenreofMovie = GenreofMovie;
    }

    static void defaultMovies() {
        RomanceMovieslist[index] = new RomanceMovies();
        RomanceMovieslist[index].name = "Rockstar";
        index++;
        RomanceMovieslist[index] = new RomanceMovies();
        RomanceMovieslist[index].name = "The Wind Rises";
        index++;
        RomanceMovieslist[index] = new RomanceMovies();
        RomanceMovieslist[index].name = "Garden Of Words";
        index++;
        RomanceMovieslist[index] = new RomanceMovies();
        RomanceMovieslist[index].name = "I Wanna Eat Your Pancreas";
        index++;
        RomanceMovieslist[index] = new RomanceMovies();
        RomanceMovieslist[index].name = "Wake Up Sid";
        index++;
        RomanceMovieslist[index] = new RomanceMovies();
        RomanceMovieslist[index].name = "Masaan";
        index++;
        RomanceMovieslist[index] = new RomanceMovies();
        RomanceMovieslist[index].name = "Eternal Sunshine Of The Spotless Mind";
        index++;
        RomanceMovieslist[index] = new RomanceMovies();
        RomanceMovieslist[index].name = "La La Land";
        index++;
        RomanceMovieslist[index] = new RomanceMovies();
        RomanceMovieslist[index].name = "Jab We Met";
        index++;
        RomanceMovieslist[index] = new RomanceMovies();
        RomanceMovieslist[index].name = "Raanjhanaa";
        index++;
        RomanceMovieslist[index] = new RomanceMovies();
        RomanceMovieslist[index].name = "October";
        index++;

    }

    static void print() {
        for (int i = 0; i < RomanceMovies.index; i++) {
            System.out.println("* " + RomanceMovieslist[i].name);

        }
    }
}

class AnimatedMovies extends Movies {

    static int index = 0;
    static AnimatedMovies AnimatedMovieslist[] = new AnimatedMovies[50];

    AnimatedMovies() {

    }

    AnimatedMovies(String name, String GenreofMovie[]) {
        this.name = name;
        this.GenreofMovie = new String[GenreofMovie.length];
        this.GenreofMovie = GenreofMovie;
    }

    static void defaultMovies() {
        AnimatedMovieslist[index] = new AnimatedMovies();
        AnimatedMovieslist[index].name = "Big Hero 6";
        index++;
        AnimatedMovieslist[index] = new AnimatedMovies();
        AnimatedMovieslist[index].name = "Wall-E";
        index++;
        AnimatedMovieslist[index] = new AnimatedMovies();
        AnimatedMovieslist[index].name = "The Wind Rises";
        index++;
        AnimatedMovieslist[index] = new AnimatedMovies();
        AnimatedMovieslist[index].name = "I Wanna Eat Your Pancreas";
        index++;
        AnimatedMovieslist[index] = new AnimatedMovies();
        AnimatedMovieslist[index].name = "Garden Of Words";
        index++;
        AnimatedMovieslist[index] = new AnimatedMovies();
        AnimatedMovieslist[index].name = "Flavors Of Youth";
        index++;
        AnimatedMovieslist[index] = new AnimatedMovies();
        AnimatedMovieslist[index].name = "Wild Robot";
        index++;
        AnimatedMovieslist[index] = new AnimatedMovies();
        AnimatedMovieslist[index].name = "My Neighbour Totoro";
        index++;
        AnimatedMovieslist[index] = new AnimatedMovies();
        AnimatedMovieslist[index].name = "Tangled";
        index++;
        AnimatedMovieslist[index] = new AnimatedMovies();
        AnimatedMovieslist[index].name = "Ratatouille";
        index++;
        AnimatedMovieslist[index] = new AnimatedMovies();
        AnimatedMovieslist[index].name = "Cars";
        index++;
        AnimatedMovieslist[index] = new AnimatedMovies();
        AnimatedMovieslist[index].name = "Shrek";
        index++;
        AnimatedMovieslist[index] = new AnimatedMovies();
        AnimatedMovieslist[index].name = "Return Of Hanuman";
        index++;
        AnimatedMovieslist[index] = new AnimatedMovies();
        AnimatedMovieslist[index].name = "Kung Fu Panda";
        index++;

    }

    static void print() {
        for (int i = 0; i < AnimatedMovies.index; i++) {
            System.out.println("* " + AnimatedMovieslist[i].name);

        }
    }
}



class Theatre 
{
    static Theatre TheatreList[]=new Theatre[20];
    String location;
    String name;
    static int index=0;
    String availableMovies[]=new String[30];
    double basePrice[]=new double[30];
    static double timeFactor[]=new double[]{0.8,1,1.2};
    static double seatFactor[]=new double[]{1,1.5,2};

    int movieIndex=0;

    static void defaultTheatre()
    {
        TheatreList[index]=new Theatre();
        TheatreList[index].name="Rajhans Cinema";
        TheatreList[index].location="Vastral,Ahmedabad";
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="PK";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=130;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Hera Pheri";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=120;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Munna Bhai M.B.B.S.";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=110;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="The Wind Rises";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=100;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Garden Of Words";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=80;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Bhool Bhoolaiya";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=130;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="3 Idiots";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=110;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="My Neighbour Totoro";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=150;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Kung Fu Panda";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=140;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Interstellar";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=115;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="The Fall Guy";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=135;
        TheatreList[index].movieIndex++;
        index++;

        TheatreList[index]=new Theatre();
        TheatreList[index].name="City Gold";
        TheatreList[index].location="Ashram Road,Ahmedabad";
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Gladiator";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=90;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="John Wick";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=100;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="War";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=80;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="The Dark Knight";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=130;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="The Avengers";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=100;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Star Wars";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=120;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Zindagi Na Milegi Dobara";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=123;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Wake Up Sid";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=125;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="The Pursuit Of Happyness";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=133;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Flavors Of Youth";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=103;
        TheatreList[index].movieIndex++;
        index++;

        TheatreList[index]=new Theatre();
        TheatreList[index].name="Devi Multiplex";
        TheatreList[index].location="Naroda,Ahmedabad";
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Bhool Bhoolaiya";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=70;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Evil Dead(2013)";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=100;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="The Grudge";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=90;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Tumbbad";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=95;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Terrifier(2016)";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=102;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Interstellar";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=75;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="PK";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=83;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Big Hero 6";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=96;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="The Martian";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=100;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Wall-E";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=120;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Blade Runner 2049";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=130;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Arrival";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=120;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Gravity";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=100;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="The Passenger";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=108;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Rockstar";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=98;
        TheatreList[index].movieIndex++;
        index++;

        TheatreList[index]=new Theatre();
        TheatreList[index].name="SB multiplex";
        TheatreList[index].location="Agora mall,Ahmedabad";
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Garden Of Words";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=120;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="I Wanna Eat Your Pancreas";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=110;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Wake Up Sid";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=140;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Masaan";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=150;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Eternal Sunshine of the Spotless Mind";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=110;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="La La Land";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=100;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Jab We Met";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=103;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Raanjhanaa";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=142;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="October";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=136;
        TheatreList[index].movieIndex++;
        index++;
        
        TheatreList[index]=new Theatre();
        TheatreList[index].name="Apple Multiplex";
        TheatreList[index].location="Maninagar,Ahmedabad";
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Big Hero 6";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=200;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Wall-E";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=230;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="The Wind Rises";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=170;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="I Wanna Eat Your Pancreas";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=196;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Wild Robot";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=245;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Evil Dead(2013)";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=147;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="The Grudge";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=178;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Tumbbad";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=155;
        TheatreList[index].movieIndex++;
        index++;

        TheatreList[index]=new Theatre();
        TheatreList[index].name="Mango Plus Cinemas";
        TheatreList[index].location="Nikol,Ahmedabad";
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Tangled";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=300;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Ratatouille";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=250;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Cars";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=270;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Shrek";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=160;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Return Of Hanuman";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=280;
        TheatreList[index].movieIndex++;
        index++;

        TheatreList[index]=new Theatre();
        TheatreList[index].name="P Square MoviePlex";
        TheatreList[index].location="Gota,Ahmedabad";
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Kung Fu Panda";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=130;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Interstellar";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=120;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="The Fall Guy";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=100;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="The Martian";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=180;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Wall-E";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=145;
        TheatreList[index].movieIndex++;
        TheatreList[index].availableMovies[TheatreList[index].movieIndex]="Blade Runner 2049";
        TheatreList[index].basePrice[TheatreList[index].movieIndex]=103;
        index++;

    }
}

