import java.util.HashMap;
import java.util.Set;

public class TrackList{
    public static void main(String[] args){
        HashMap<String, String> trackList  = new HashMap<String, String>();
        trackList.put("ma3oal","ma3oal l2 mesh m3aol");
        trackList.put("perfect","perfect body");
        trackList.put(" let her go","and you let her go");
        trackList.put("zoro","Keep your heart here with mine ");
        
        System.out.println("The thired Song in the list ");
        String song3=trackList.get("perfect");
        System.out.println(song3);

        System.out.println("All the songs ");
        Set<String> keys = trackList.keySet();
        for(String key : keys){
            System.out.println(key);
            System.out.println(trackList.get(key));
        }

        }
}