import java.util.HashSet;
import java.util.Set;

public class Song {
  private String name;
  private Song nextSong;

  public Song(String name) {
    this.name = name;
  }

  public void setNextSong(Song nextSong) {
    this.nextSong = nextSong;
  }

  public boolean isInRepeatingPlaylist() {
    Set<Song> seen = new HashSet<>();
    Song current = this;
    while (current != null){
      if (!seen.add(current)){
        return true;
      }
      current = current.nextSong;
    }
    return false;
  }

  public static void main(String[] args) {
    Song first = new Song("Hello");
    Song second = new Song("Eye of the tiger");

    first.setNextSong(second);
    second.setNextSong(first);

    System.out.println(first.isInRepeatingPlaylist());
  }
}