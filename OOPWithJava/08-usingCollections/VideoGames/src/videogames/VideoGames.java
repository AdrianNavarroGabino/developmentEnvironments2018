package videogames;

import java.util.*;
import videogames.data.PCVideoGame;
import videogames.data.VideoGame;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class VideoGames 
{
    public static final int MAX_VIDEOGAMES = 5;
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<VideoGame> games = new ArrayList<>();
        int option, positionToRemove;
        String textToSearch;
        
        games.add(new VideoGame("Mario Kart", "Sport", 25));
        games.add(new PCVideoGame(1, 600, "Call of Duty", "Shooter", 19));
        games.add(new PCVideoGame(2, 900, "Fifa 17", "Sports", 30));
        games.add(new VideoGame("Kingdom Hearts", "Adventure", 30));
        games.add(new VideoGame("Heavy Rain", "Adventure", 50));

        Collections.sort(games, new Comparator<VideoGame>()
        {
            @Override
            public int compare(VideoGame v1, VideoGame v2) 
            {
                return Float.compare(v1.getPrice(), v2.getPrice());
            }            
        });
        
        for (int i = 0; i < games.size(); i++)
        {
            System.out.println(games.get(i));
        }        
        
        System.out.println("Choose an option:");
        System.out.println("1. Search video game");
        System.out.println("2. Remove video game");
        option = sc.nextInt();
        sc.nextLine();
        
        if (option == 1)
        {
            System.out.println("Enter text to search:");
            textToSearch = sc.nextLine().toLowerCase();
            
            for(VideoGame game: games)
            {
                if (game.getTitle().toLowerCase().contains(textToSearch))
                    System.out.println(game);
            }
        }
        else
        {
            System.out.println("Enter position to remove:");
            positionToRemove = sc.nextInt();
            
            if (positionToRemove >= 0 && positionToRemove < games.size())
                games.remove(positionToRemove);
            
            for(VideoGame game: games)
            {
                System.out.println(game);
            }
        }   
    }   
}
