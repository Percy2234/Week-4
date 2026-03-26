public class TVShow {
    String name;
    double rating;
    int episodeLength;
    int numberOfEpisodes;

    TVShow(String name, double rating, int episodeLength, int numberOfEpisodes) {
        this.name = name;
        this.rating = rating;
        this.episodeLength = episodeLength;
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public String toString() {
        return this.name + " --> rating: " + this.rating + ", episode length(minutes): " + this.episodeLength
                + " # episodes: " + this.numberOfEpisodes;
    }

    int totalPlaytimeInMinutes() {
        return this.episodeLength * this.numberOfEpisodes / 60;
    }

    int totalPlaytimeInHours() {
        return this.episodeLength * this.numberOfEpisodes;
    }

}

class TVTest {
    public static void main(String[] args) {
        TVShow breakingBad = new TVShow("Breaking Bad", 9.5, 47, 62);
        TVShow gameOfThrones = new TVShow("Game Of Thrones", 9.3, 57, 73);
        TVShow clarksonsFarm = new TVShow("Clarkson's Farm", 9.0, 45, 16);

        System.out.println(breakingBad);
        System.out.println(gameOfThrones);
        System.out.println(clarksonsFarm);

        System.out.println(breakingBad.totalPlaytimeInHours());
        System.out.println(gameOfThrones.totalPlaytimeInHours());
        System.out.println(clarksonsFarm.totalPlaytimeInHours());
    }
}