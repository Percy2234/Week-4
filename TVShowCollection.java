class TVShowCollection {
    TVShow[] myShows;

    TVShowCollection() {
        this.myShows = new TVShow[3];
    }

    public String toString() {
        // Note that this method must return a single string. We have a bit
        // of a problem because we've got an array of TVShows. We want to
        // combine the output of all the shows into a single String value.
        // We need to build up such a String starting from the empty String
        // "". Study carefully the following snippet:

        String s = "";
        for (TVShow show : this.myShows) {
            // The '\n' is a special character that pushes output to the
            // next line, as if you've pressed the Enter key.
            s += " - " + show.toString() + "\n";
        }
        return s;
    }

    void printLongestShow() {
        int longestTime = 0;
        String nameOfLongestShow = "";
        for (TVShow show : this.myShows) {
            int showPlaytime = show.totalPlaytimeInMinutes();
            if (showPlaytime > longestTime) {
                longestTime = showPlaytime;
                nameOfLongestShow = show.name;
            }
        }

        System.out.println(nameOfLongestShow + " is the longest show");
    }

    String showWithMostEpisodes() {
        int mostEpisodes = 0;
        String nameOfShowWithMostEpisodes = "";
        for (TVShow show : this.myShows) {
            int numEpisodes = show.numberOfEpisodes;
            if (numEpisodes > mostEpisodes) {
                mostEpisodes = numEpisodes;
                nameOfShowWithMostEpisodes = show.name;
            }
        }

        return nameOfShowWithMostEpisodes;
    }

}

class TVTest {
    public static void main(String[] args) {
        TVShow breakingBad = new TVShow("Breaking Bad", 9.5, 47, 62);
        TVShow gameOfThrones = new TVShow("Game Of Thrones", 9.3, 57, 73);

        TVShowCollection collection = new TVShowCollection();
        collection.myShows[0] = breakingBad;
        collection.myShows[1] = gameOfThrones;

        System.out.println(collection);
    }
}