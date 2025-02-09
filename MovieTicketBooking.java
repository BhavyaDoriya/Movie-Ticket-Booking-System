import java.util.Scanner;

class Movies {
    String name;
    String GenreofMovie[];
    String existingGenre[] = new String[] { "Comedy", "Action", "Slice of Life", "Horror", "Science Fiction", "Romance",
            "Animated", "Documentry" };
    int price;
    Scanner s = new Scanner(System.in);

    void addMovies() {
        System.out.println("How many Genre does your movie have?");
        int NumOfGenre = 8;
        String GenreofMovie[] = new String[8];
        System.out.println("Enter the Genres of Movie you want to add:");
        for (int i = 0; i < existingGenre.length; i++) {
            SYstem.out.println(existingGenre[i]);
        }
        boolean check = false;
        String GenreofMovie[] = new String[NumOfGenre];
        for (int i = 0; i < NumOfGenre; i++) {
            for (;;) {
                GenreofMovie[i] = s.nextLine();
                for (int j = 0; j < existingGenre.length; j++) {
                    if (GenreofMovie[i] == existingGenre[j]) {
                        check = true;
                        break;
                    }
                }
                if (check == false) {
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
                
                ComedyMovies o = new ComedyMovies();
                o.ComedyMovieslist[o.index] = new ComedyMovies(name,GenreofMovie);
                o.index++;
                break;
            case "Action":
                ActionMovies o1 = new ActionMovies();
                o1.ActionMovieslist[o1.index] = new ActionMovies(name,GenreofMovie);
                o1.index++;
                break;
            case "Slice of Life":
                SliceOfLifeMovies o2 = new SliceOfLifeMovies();
                o2.SliceOfLifeMovieslist[o2.index] = new SliceOfLifeMovies(name,GenreofMovie);
                o2.index++;
                break;
            case "Horror":
                HorrorMovies o3 = new HorrorMovies();
                o3.HorrorMovieslist[o3.index] = new HorrorMovies(name,GenreofMovie);
                o3.index++;
                break;
            case "Science Fiction":
                ScienceFictionMovies o4 = new ScienceFictionMovies();
                o4.ScienceFictionMovieslist[o4.index] = new ScienceFictionMovies(name,GenreofMovie);
                o4.index++;
            break;
            case "Romance":
                RomanceMovies o5 = new RomanceMovies();
                o5.RomanceMovieslist[o5.index] = new RomanceMovies(name,GenreofMovie);
                o5.index++;
                break;
            case "Animated":
                AnimatedMovies o6 = new AnimatedMovies();
                o6.AnimatedMovieslist[o6.index] = new AnimatedMovies(name,GenreofMovie);
                o6.index++;
                
                break;
            case "Documentry":
                DocumentryMovies o7 = new DocumentryMovies();
                o7.DocumentryMovieslist[o7.index] = new DocumentryMovies(name,GenreofMovie);
                o7.index++;
                break;
        }
        }

    }

    void deleteMovies() {
        ComdeyMovieslist[index] = new ComedyMovies();
        ComedyMovieslist[index].name = s.nextLine();
        ComedyMovieslist[index].objectIndex = index;
        index++;
        System.out.println("Enter the name of the movie you want to delete");
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
        ComedyMovieslist[index].name = "Dhamal";
        index++;
        ComedyMovieslist[index] = new ComedyMovies();
        ComedyMovieslist[index].name = "Hera Pheri";
        index++;
        ComedyMovieslist[index] = new ComedyMovies();
        ComedyMovieslist[index].name = "Munna Bhai M.B.B.S>";
        index++;
        ComedyMovieslist[index] = new ComedyMovies();
        ComedyMovieslist[index].name = "Hum Chaar";
        index++;
        ComedyMovieslist[index] = new ComedyMovies();
        ComedyMovieslist[index].name = "The Fall Guy";
        index++;
    }

}

class ActionMovies extends Movies {

    static int index = 0;
    int objectIndex;

    static ActionMovies ActionMovieslist[] = new ActionMovies[50];

    ActionMovies() {
        this.Genre = "Action";
    }

    ActionMovies(String name) {
        this.name = name;
        this.Genre = "Action";
    }

    void defaultMovies() {
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "Gladiator-II";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "John Wick";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "The Matrix";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "Fighter";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "Yodha";
        index++;

    }

}

class SliceOfLifeMovies extends Movies {
    static int index = 0;
    int objectIndex;

    static SliceOfLifeMovies SliceOfLifeMovieslist[] = new SliceOfLifeMovies[50];

    SliceOfLifeMovies() {
        this.Genre = "Action";
    }

    SliceOfLifeMovies(String name) {
        this.name = name;
        this.Genre = "Action";
    }

    void defaultMovies() {
        SliceOfLifeMovieslist[index] = new SliceOfLifeMovies();
        SliceOfLifeMovieslist[index].name = "Gladiator-II";
        index++;
        SliceOfLifeMovieslist[index] = new SliceOfLifeMovies();
        SliceOfLifeMovieslist[index].name = "Gladiator-II";
        index++;
        SliceOfLifeMovieslist[index] = new SliceOfLifeMovies();
        SliceOfLifeMovieslist[index].name = "Gladiator-II";
        index++;
        SliceOfLifeMovieslist[index] = new SliceOfLifeMovies();
        SliceOfLifeMovieslist[index].name = "Gladiator-II";
        index++;
        SliceOfLifeMovieslist[index] = new SliceOfLifeMovies();
        SliceOfLifeMovieslist[index].name = "Gladiator-II";
        index++;
        SliceOfLifeMovieslist[index] = new SliceOfLifeMovies();
        SliceOfLifeMovieslist[index].name = "Gladiator-II";
        index++;

    }

}

class HorrorMovies extends Movies {
    static int index = 0;
    int objectIndex;

    static ActionMovies ActionMovieslist[] = new ActionMovies[50];

    ActionMovies(){
        this.Genre="Action";
    }

    ActionMovies(String name)
    {
        this.name=name;
        this.Genre="Action";
    }

    void defaultMovies() {
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "Gladiator-II";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "John Wick";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "The Matrix";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "Fighter";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "Yodha";
        index++;

    }

}

class ScienceFictionMovies extends Movies {

    static int index = 0;
    int objectIndex;

    static ActionMovies ActionMovieslist[] = new ActionMovies[50];

    ActionMovies(){
        this.Genre="Action";
    }

    ActionMovies(String name)
    {
        this.name=name;
        this.Genre="Action";
    }

    void defaultMovies() {
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "Gladiator-II";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "John Wick";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "The Matrix";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "Fighter";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "Yodha";
        index++;

    }
}

class RomanceMovies extends Movies {

    static int index = 0;
    int objectIndex;

    static ActionMovies ActionMovieslist[] = new ActionMovies[50];

    ActionMovies(){
        this.Genre="Action";
    }

    ActionMovies(String name)
    {
        this.name=name;
        this.Genre="Action";
    }

    void defaultMovies() {
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "Gladiator-II";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "John Wick";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "The Matrix";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "Fighter";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "Yodha";
        index++;

    }
}

class AnimatedMovies extends Movies {

    static int index = 0;
    int objectIndex;

    static ActionMovies ActionMovieslist[] = new ActionMovies[50];

    ActionMovies(){
        this.Genre="Action";
    }

    ActionMovies(String name)
    {
        this.name=name;
        this.Genre="Action";
    }

    void defaultMovies() {
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "Gladiator-II";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "John Wick";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "The Matrix";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "Fighter";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "Yodha";
        index++;

    }
}

class DocumentryMovies extends Movies {

    static int index = 0;
    int objectIndex;

    static ActionMovies ActionMovieslist[] = new ActionMovies[50];

    ActionMovies(){
        this.Genre="Action";
    }

    ActionMovies(String name)
    {
        this.name=name;
        this.Genre="Action";
    }

    void defaultMovies() {
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "Gladiator-II";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "John Wick";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "The Matrix";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "Fighter";
        index++;
        ActionMovieslist[index] = new ActionMovies();
        ActionMovieslist[index].name = "Yodha";
        index++;

    }
}