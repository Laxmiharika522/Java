import java.io.*;
import java.util.Scanner;

class Movie implements Serializable {
    private String title;
    private int releaseYear;

    public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    // Custom serialization
    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        oos.writeInt(releaseYear - 3); // store 3 years earlier
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        releaseYear = ois.readInt(); // read modified year
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}

public class MovieManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] parts = s.split(" ");
        String title = parts[0];
        int year = Integer.parseInt(parts[1]);

        Movie movie = new Movie(title, year);

        // Serialize
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("movie_info.ser"))) {
            oos.writeObject(movie);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("movie_info.ser"))) {
            Movie deserializedMovie = (Movie) ois.readObject();
            System.out.println(deserializedMovie.getReleaseYear());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

