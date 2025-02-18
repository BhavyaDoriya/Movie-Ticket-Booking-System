import java.util.Scanner;

class Movies {
    String name;
    String GenreofMovie[];
    static String existingGenre[] = new String[] { "Comedy", "Action", "Slice of Life", "Horror", "Science Fiction", "Romance",
            "Animated" };
    int price[]=new int[3];
    Scanner s = new Scanner(System.in);

    void addMovies() {
        boolean check=false;
        System.out.println("How many Genre does your movie have?(1-7)");
        int NumOfGenre=s.nextInt();
        do
        {
            if(NumOfGenre>=1&&NumOfGenre<=7)
            {
                check=false;
            }
            else
            {
                System.out.println("Enter valid Number of Genre(1-7)");
                NumOfGenre=s.nextInt();
                check=true;
            }
        }while(check);

        String GenreofMovie[]=new String[NumOfGenre];
        
        System.out.println("Available Genres:");
        for(int i=0;i<existingGenre.length;i++)
        {
            System.out.println("*"+existingGenre[i]);
        }
        boolean check1=false;
        System.out.println("Enter Genres of Movies(In the above format):");
        for (int i = 0; i < NumOfGenre; i++) {
            for (;;) {
                GenreofMovie[i] = s.nextLine();//toLowerCase
                for (int j = 0; j < existingGenre.length; j++) {
                    if (GenreofMovie[i] == existingGenre[j]) {
                        check1 = true;
                        break;
                    }
                }
                if (check1 == false) {
                    System.out.println("Enter valid Genre.");
                } else {
                    break;
                }
            }
        }
        System.out.println("Enter the name of movie you want to add:");
        String name=s.nextLine();
        for(int i=0;i<NumOfGenre;i++)
        {
        switch (GenreofMovie[i]) {
            case "Comedy":
                
                
                ComedyMovies.ComedyMovieslist[ComedyMovies.index] = new ComedyMovies(name,GenreofMovie);
                ComedyMovies.index++;
                break;
            case "Action":
                
                ActionMovies.ActionMovieslist[ActionMovies.index] = new ActionMovies(name,GenreofMovie);
                ActionMovies.index++;
                break;
            case "Slice Of Life":
                SliceOfLifeMovies.SliceOfLifeMovieslist[SliceOfLifeMovies.index] = new SliceOfLifeMovies(name,GenreofMovie);
                SliceOfLifeMovies.index++;
                break;
            case "Horror":
                HorrorMovies.HorrorMovieslist[HorrorMovies.index] = new HorrorMovies(name,GenreofMovie);
                HorrorMovies.index++;
                break;
            case "Science Fiction":
                ScienceFictionMovies.ScienceFictionMovieslist[ScienceFictionMovies.index] = new SciencceFictionMovies(name,GenreofMovie);
                ScienceFictionMovies.index++;
                break;
            case "Romance":
                RomanceMovies.RomanceMovieslist[RomanceMovies.index] = new RomanceMovies(name,GenreofMovie);
                RomanceMovies.index++;
                break;
            case "Animated":
                AnimatedMovies.AnimatedMovieslist[AnimatedMovies.index] = new AnimatedMovies(name,GenreofMovie);
                AnimatedMovies.index++;
                break;
           
        }
        }

    }

    void deleteMovies() {
        System.out.println("Enter the name of Movie you want to delete");
        String name=s.nextLine();
        boolean check=true;
    for(;check;)
    {
        for(int i=0;i<ComedyMovies.index;i++)
        {
            if(name==ComedyMovies.ComedyMovieslist[i].name)
            {
                ComedyMovies.ComedyMovieslist[i]=ComedyMovies.ComedyMovieslist[i+1];
                for(int j=i+1;j<ComedyMovies.index;j++)
                {
                    ComedyMovies.ComedyMovieslist[j]=ComedyMovies.ComedyMovieslist[j+1];
                }
                ComedyMovies.index--;
                check=false;
                break;
            }
        }
        for(int i=0;i<ComedyMovies.index;i++)
        {
            if(name==ComedyMovies.ComedyMovieslist[i].name)
            {
                ComedyMovies.ComedyMovieslist[i]=ComedyMovies.ComedyMovieslist[i+1];
                for(int j=i+1;j<ComedyMovies.index;j++)
                {
                    ComedyMovies.ComedyMovieslist[j]=ComedyMovies.ComedyMovieslist[j+1];
                }
                ComedyMovies.index--;
                check=false;
                break;
            }
        }
        for(int i=0;i<ComedyMovies.index;i++)
        {
            if(name==ComedyMovies.ComedyMovieslist[i].name)
            {
                ComedyMovies.ComedyMovieslist[i]=ComedyMovies.ComedyMovieslist[i+1];
                for(int j=i+1;j<ComedyMovies.index;j++)
                {
                    ComedyMovies.ComedyMovieslist[j]=ComedyMovies.ComedyMovieslist[j+1];
                }
                ComedyMovies.index--;
                check=false;
                break;
            }
        }
        for(int i=0;i<ComedyMovies.index;i++)
        {
            if(name==ComedyMovies.ComedyMovieslist[i].name)
            {
                ComedyMovies.ComedyMovieslist[i]=ComedyMovies.ComedyMovieslist[i+1];
                for(int j=i+1;j<ComedyMovies.index;j++)
                {
                    ComedyMovies.ComedyMovieslist[j]=ComedyMovies.ComedyMovieslist[j+1];
                }
                ComedyMovies.index--;
                check=false;
                break;
            }
        }
        for(int i=0;i<ComedyMovies.index;i++)
        {
            if(name==ComedyMovies.ComedyMovieslist[i].name)
            {
                ComedyMovies.ComedyMovieslist[i]=ComedyMovies.ComedyMovieslist[i+1];
                for(int j=i+1;j<ComedyMovies.index;j++)
                {
                    ComedyMovies.ComedyMovieslist[j]=ComedyMovies.ComedyMovieslist[j+1];
                }
                ComedyMovies.index--;
                check=false;
                break;
            }
        }
        for(int i=0;i<ComedyMovies.index;i++)
        {
            if(name==ComedyMovies.ComedyMovieslist[i].name)
            {
                ComedyMovies.ComedyMovieslist[i]=ComedyMovies.ComedyMovieslist[i+1];
                for(int j=i+1;j<ComedyMovies.index;j++)
                {
                    ComedyMovies.ComedyMovieslist[j]=ComedyMovies.ComedyMovieslist[j+1];
                }
                ComedyMovies.index--;
                check=false;
                break;
            }
        }
    }
    }

    public static void main(String... args) {

    }
}

class ComedyMovies extends Movies {

    static int index = 0;
    int objectIndex;
    static ComedyMovies ComedyMovieslist[] = new ComedyMovies[50];

    ComedyMovies() {
        
    }

    ComedyMovies(String name,String GenreofMovie[]) {
        this.name = name;
        this.GenreofMovie=new String[GenreofMovie.length];
        this.GenreofMovie=GenreofMovie;
    }

    void defaultMovies() {
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
    void print()
    {
        for(int i=0;i<ComedyMovieslist.length;i++)
        {
            System.out.println("*"+ComedyMovieslist[i].name);
            System.out.print("*Genres: ");
            for(int j=0;j<ComedyMovieslist[i].GenreofMovie.length;j++)
            {
                if(j!=ComedyMovieslist[i].GenreofMovie.length-1)
                System.out.print(ComedyMovieslist[i].GenreofMovie[j]+",");
                else
                System.out.print(ComedyMovieslist[i].GenreofMovie[j]+".");
            }System.out.println("");

        }
    }


}

class ActionMovies extends Movies {

    static int index = 0;
    int objectIndex;
    static ActionMovies ActionMovieslist[] = new ActionMovies[50];

    ActionMovies() {
        
    }

    ActionMovies(String name,String GenreofMovie[]) {
        this.name = name;
        this.GenreofMovie=new String[GenreofMovie.length];
        this.GenreofMovie=GenreofMovie;
    }

    void defaultMovies() {
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
    void print()
    {
        for(int i=0;i<ActionMovieslist.length;i++)
        {
            System.out.println("*"+ActionMovieslist[i].name);
            System.out.print("*Genres: ");
            for(int j=0;j<ActionMovieslist[i].GenreofMovie.length;j++)
            {
                if(j!=ActionMovieslist[i].GenreofMovie.length-1)
                System.out.print(ActionMovieslist[i].GenreofMovie[j]+",");
                else
                System.out.print(ActionMovieslist[i].GenreofMovie[j]+".");
            }System.out.println("");

        }
    }
}

class SliceOfLifeMovies extends Movies {
    static int index = 0;
    int objectIndex;
    static SliceOfLifeMovies SliceOfLifeMovieslist[] = new SliceOfLifeMovies[50];

    SliceOfLifeMovies() {
        
    }

    SliceOfLifeMovies(String name,String GenreofMovie[]) {
        this.name = name;
        this.GenreofMovie=new String[GenreofMovie.length];
        this.GenreofMovie=GenreofMovie;
    }

    void defaultMovies() {
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
    void print()
    {
        for(int i=0;i<SliceOfLifeMovieslist.length;i++)
        {
            System.out.println("*"+SliceOfLifeMovieslist[i].name);
            System.out.print("*Genres: ");
            for(int j=0;j<SliceOfLifeMovieslist[i].GenreofMovie.length;j++)
            {
                if(j!=SliceOfLifeMovieslist[i].GenreofMovie.length-1)
                System.out.print(SliceOfLifeMovieslist[i].GenreofMovie[j]+",");
                else
                System.out.print(SliceOfLifeMovieslist[i].GenreofMovie[j]+".");
            }System.out.println("");

        }
    }

}

class HorrorMovies extends Movies {
    static int index = 0;
    int objectIndex;
    static HorrorMovies HorrorMovieslist[] = new HorrorMovies[50];

    HorrorMovies() {
        
    }

    HorrorMovies(String name,String GenreofMovie[]) {
        this.name = name;
        this.GenreofMovie=new String[GenreofMovie.length];
        this.GenreofMovie=GenreofMovie;
    }

    void defaultMovies() {
        
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
    void print()
    {
        for(int i=0;i<HorrorMovieslist.length;i++)
        {
            System.out.println("*"+HorrorMovieslist[i].name);
            System.out.print("*Genres: ");
            for(int j=0;j<HorrorMovieslist[i].GenreofMovie.length;j++)
            {
                if(j!=HorrorMovieslist[i].GenreofMovie.length-1)
                System.out.print(HorrorMovieslist[i].GenreofMovie[j]+",");
                else
                System.out.print(HorrorMovieslist[i].GenreofMovie[j]+".");
            }System.out.println("");

        }
    }
}

class ScienceFictionMovies extends Movies {

    static int index = 0;
    int objectIndex;
    static ScienceFictionMovies ScienceFictionMovieslist[] = new ScienceFictionMovies[50];

    ScienceFictionMovies() {
        
    }

    ScienceFictionMovies(String name,String GenreofMovie[]) {
        this.name = name;
        this.GenreofMovie=new String[GenreofMovie.length];
        this.GenreofMovie=GenreofMovie;
    }

    void defaultMovies() {
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
        ScienceFictionMovieslist[index].name = "Arival";
        index++;
        ScienceFictionMovieslist[index] = new ScienceFictionMovies();
        ScienceFictionMovieslist[index].name = "Gravity";
        index++;
        ScienceFictionMovieslist[index] = new ScienceFictionMovies();
        ScienceFictionMovieslist[index].name = "The Passanger";
        index++;
        ScienceFictionMovieslist[index] = new ScienceFictionMovies();
        ScienceFictionMovieslist[index].name = "Star-Wars";
        index++;
        
    }
    void print()
    {
        for(int i=0;i<ScienceFictionMovieslist.length;i++)
        {
            System.out.println("*"+ScienceFictionMovieslist[i].name);
            System.out.print("*Genres: ");
            for(int j=0;j<ScienceFictionMovieslist[i].GenreofMovie.length;j++)
            {
                if(j!=ScienceFictionMovieslist[i].GenreofMovie.length-1)
                System.out.print(ScienceFictionMovieslist[i].GenreofMovie[j]+",");
                else
                System.out.print(ScienceFictionMovieslist[i].GenreofMovie[j]+".");
            }System.out.println("");

        }
    }
}

class RomanceMovies extends Movies {

    static int index = 0;
    int objectIndex;
    static RomanceMovies RomanceMovieslist[] = new RomanceMovies[50];

    RomanceMovies() {
        
    }

    RomanceMovies(String name,String GenreofMovie[]) {
        this.name = name;
        this.GenreofMovie=new String[GenreofMovie.length];
        this.GenreofMovie=GenreofMovie;
    }

    void defaultMovies() {
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
    void print()
    {
        for(int i=0;i<RomanceMovieslist.length;i++)
        {
            System.out.println("*"+RomanceMovieslist[i].name);
            System.out.print("*Genres: ");
            for(int j=0;j<RomanceMovieslist[i].GenreofMovie.length;j++)
            {
                if(j!=RomanceMovieslist[i].GenreofMovie.length-1)
                System.out.print(RomanceMovieslist[i].GenreofMovie[j]+",");
                else
                System.out.print(RomanceMovieslist[i].GenreofMovie[j]+".");
            }System.out.println("");

        }
    }
}

class AnimatedMovies extends Movies {

    static int index = 0;
    int objectIndex;
    static AnimatedMovies AnimatedMovieslist[] = new AnimatedMovies[50];

    AnimatedMovies() {
        
    }

    AnimatedMovies(String name,String GenreofMovie[]) {
        this.name = name;
        this.GenreofMovie=new String[GenreofMovie.length];
        this.GenreofMovie=GenreofMovie;
    }

    void defaultMovies() {
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
    void print()
    {
        for(int i=0;i<AnimatedMovieslist.length;i++)
        {
            System.out.println("*"+AnimatedMovieslist[i].name);
            System.out.print("*Genres: ");
            for(int j=0;j<AnimatedMovieslist[i].GenreofMovie.length;j++)
            {
                if(j!=AnimatedMovieslist[i].GenreofMovie.length-1)
                System.out.print(AnimatedMovieslist[i].GenreofMovie[j]+",");
                else
                System.out.print(AnimatedMovieslist[i].GenreofMovie[j]+".");
            }System.out.println("");

        }
    }
}

class Customer {
    static Scanner s = new Scanner(System.in);
    static String[] names = new String[10];      // Stores names
    static String[] usernames = new String[10];  // Stores usernames
    static String[] passwords = new String[10];  // Stores passwords
    static int customerCount = 5; // Number of existing customers

    public static void main(String[] args) {
        // Pre-populating with 5 customers
        addCustomer(0, "Bhavya", "bhavya123", "bhavyaPass");
        addCustomer(1, "Aryan", "aryan123", "aryanPass");
        addCustomer(2, "Samil", "samil123", "samilPass");
        addCustomer(3, "Jaineesh", "jaineesh123", "jaineeshPass");
        addCustomer(4, "Jenish", "jenish123", "jenishPass");

        while (true) {
            System.out.println("\nWelcome! Choose an option:");
            System.out.println("1. Create Account");
            System.out.println("2. Log into Existing Account");
            System.out.println("3. Exit");

            int choice = s.nextInt();
            s.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Exiting... Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    static void addCustomer(int index, String name, String username, String password) {
        names[index] = name;
        usernames[index] = username;
        passwords[index] = password;
    }

    static void createAccount() {
        if (customerCount >= names.length) {
            System.out.println("Cannot add more customers. Database is full.");
            return;
        }

        System.out.println("Enter your name: ");
        String name = s.nextLine();

        System.out.println("Enter a username: ");
        String username = s.nextLine();

        for (int i = 0; i < customerCount; i++) {
            if (usernames[i].equals(username)) {
                System.out.println("Username already taken. Try a different one.");
                return;
            }
        }

        System.out.println("Enter a password: ");
        String password = s.nextLine();

        addCustomer(customerCount, name, username, password);
        customerCount++;
        System.out.println("Account created successfully!");
    }

    static void login() {
        System.out.println("Enter username: ");
        String username = s.nextLine();

        System.out.println("Enter password: ");
        String password = s.nextLine();

        for (int i = 0; i < customerCount; i++) {
            if (usernames[i].equals(username) && passwords[i].equals(password)) {
                System.out.println("Login successful! Welcome, " + names[i]);

                // Ask if the user wants to manage the account after logging in
                System.out.println("Do you want to manage your account? (yes/no)");
                String checkForManagement = s.nextLine();

                if (checkForManagement.equalsIgnoreCase("yes")) {
                    manageAccount(i); // Only pass the logged-in user index to manage their account
                }
                return;
            }
        }

        System.out.println("Invalid username or password. Try again.");
    }

    static void manageAccount(int index) {
        while (true) {
            System.out.println("\nAccount Management:");
            System.out.println("1. Reset Password");
            System.out.println("2. Delete Account");
            System.out.println("3. Logout");

            int choice = s.nextInt();
            s.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    resetPassword(index);  // Only available after login
                    break;
                case 2:
                    deleteAccount(index);  // Only available after login
                    return; // Return after deleting the account (ends the program)
                case 3:
                    System.out.println("Logged out successfully!");
                    return; // Return to the main menu
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    static void resetPassword(int index) {
        System.out.println("Enter new password: ");
        passwords[index] = s.nextLine();
        System.out.println("Password reset successfully!");
    }

    static void deleteAccount(int index) {
        System.out.println("Are you sure you want to delete your account? (yes/no)");
        String confirmation = s.nextLine();
        if (!confirmation.equalsIgnoreCase("yes")) {
            System.out.println("Account deletion cancelled.");
            return;
        }

        // Shift elements to delete the customer from the array
        for (int i = index; i < customerCount - 1; i++) {
            names[i] = names[i + 1];
            usernames[i] = usernames[i + 1];
            passwords[i] = passwords[i + 1];
        }
        customerCount--;  // Decrease the customer count after deletion
        System.out.println("Account deleted successfully!");
    }
}