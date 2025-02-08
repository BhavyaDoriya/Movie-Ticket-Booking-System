import java.util.Scanner;

class Movies
{
    String name,Genre;
    int price;
    Scanner s=new Scanner(System.in);
    void addMovies()
        {
            System.out.println("Enter the Genre of the Movie you want to add:");
            System.out.println("Press ")
            System.out.println("1 For Comedy");
            System.out.println("2 For Action");
            System.out.println("3 For Slice of Life");
            System.out.println("4 For Horror");
            System.out.println("5 For Science Fiction");
            System.out.println("6 For Romance");
            System.out.println("7 For Animated");
            System.out.println("8 For Documentry");
            int Genre=s.nextInt();
            switch(Genre)
            {
                case 1:
                System.out.println("Enter the name of movie you want to add:");
                ComedyMovies o=new ComedyMovies();
                o.ComedyMovieslist[o.index]=new ComedyMovies(s.nextLine());
                o.index++;
                break;
            }
            
            
           
        }
        void deleteMovies()
        {
            ComdeyMovieslist[index]=new ComedyMovies();
            ComedyMovieslist[index].name=s.nextLine();
            ComedyMovieslist[index].objectIndex=index;
            index++;
            System.out.println("Enter the name of the movie you want to delete");
        }
    public static void main(String...args)
    {
       
        
    }
}
class ComedyMovies extends Movies
{
    Scanner s=new Scanner(System.in);
    
    static int index=0;
    int objectIndex;
    static ComedyMovies ComedyMovieslist[]=new ComedyMovies[50];
    ComedyMovies(){
        this.Genre="Comedy";
    }
    ComedyMovies(String name)
    {
        this.name=name;
        this.Genre="Comedy";
    }
    void defaultMovies()
    {
        ComedyMovieslist[index]=new ComedyMovies();
        ComedyMovieslist[index].name="Dhamal";
        index++;
        ComedyMovieslist[index]=new ComedyMovies();
        ComedyMovieslist[index].name="Hera Pheri";
        index++;
        ComedyMovieslist[index]=new ComedyMovies();
        ComedyMovieslist[index].name="Munna Bhai M.B.B.S>";
        index++;
        ComedyMovieslist[index]=new ComedyMovies();
        ComedyMovieslist[index].name="Hum Chaar";
        index++;
        ComedyMovieslist[index]=new ComedyMovies();
        ComedyMovieslist[index].name="The Fall Guy";
        index++;
    }
    
 
}
class ActionMovies extends Movies
{

    Scanner s=new Scanner(System.in);
    
    static int index=0;
    int objectIndex;
    
    
    static ActionMovies ActionMovieslist[]=new ActionMovies[50];
    
    ActionMovies(){
        this.Genre="Comedy";
    }
    ActionMovies(String name)
    {
        this.name=name;
        this.Genre="Comedy";
    }
    void defaultMovies()
    {
        ActionMovieslist[index]=new ActionMovies();
        ActionMovieslist[index].name="Gladiator-II";
        index++;
        ActionMovieslist[index]=new ActionMovies();
        ActionMovieslist[index].name="John Wick";
        index++;
        ActionMovieslist[index]=new ActionMovies();
        ActionMovieslist[index].name="The Matrix";
        index++;
        ActionMovieslist[index]=new ActionMovies();
        ActionMovieslist[index].name="";
        index++;
        ActionMovieslist[index]=new ActionMovies();
        ActionMovieslist[index].name="";
        index++;
        
    }
    
 
}
class SliceOfLifeMovies extends Movies
{

}
class HorrorMovies extends Movies
{
    
}
class ScienceFictionMovies extends Movies
{

}
class RomanceMovies extends Movies
{

}
class AnimatedMovies extends Movies
{

}
class DocumentryMovies extends Movies
{

}