import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    public int played = 0;
    public int lost = 0;
    public int won = 0;
    public int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
            return false;
            // here, above, we cast the player variable into Player class, but this is an ugly solution. Later on you will be
            // shown a way to get rid of that casting.
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team" + name);
            return true;
        }
    }

    public int numPlayer() {
        return members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            won++;
        } else if (ourScore < theirScore) {
            lost++;
        } else {
            tied++;
        }

        played++;
        if (opponent != null) {
            opponent.matchResult(null, theirScore, theirScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if(this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }

    }
}
