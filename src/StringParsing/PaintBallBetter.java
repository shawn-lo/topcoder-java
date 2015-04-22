package StringParsing;

import java.util.*;

/**
 * Created by Shawn on 4/21/15.
 */
public class PaintBallBetter {
    public String[] getLeaderboard(String[] players, String[] messages) {
        HashMap<String, Players> hashPlayer = new HashMap<String, Players>();
        HashMap<String, Teams> hashTeam = new HashMap<String, Teams>();
        ArrayList<Teams> teams = new ArrayList<Teams>();
        int i;
        String tn, p1, p2;
        Teams t;
        Players p, pp1, pp2;
        for(String element : players)
        {
            String[] array = element.split(" ");
            tn = array[1];
            p1 = array[0];
            if(hashTeam.containsKey(tn))
            {
                t = hashTeam.get(tn);
            }
            else
            {
                t = new Teams();
                t.name = tn;
                hashTeam.put(tn, t);
                teams.add(t);
            }
            p = new Players();
            t.players.add(p);
            p.name = p1;
            p.team = t;
            hashPlayer.put(p1, p);
        }
        for(String msg : messages)
        {
            String[] array = msg.split(" ");
            p1 = array[0];
            p2 = array[2];
            pp1 = hashPlayer.get(p1);
            pp2 = hashPlayer.get(p2);
            if(pp1 == pp2 || pp1.team == pp2.team)
                pp1.score--;
            else
            {
                pp1.score++;
                pp2.score--;
            }
        }
        for(Teams team : teams)
        {
            team.setScore();
            Collections.sort(team.players);
        }
        Collections.sort(teams);
        ArrayList<String> ans = new ArrayList<String>();
        for(Teams team : teams)
        {
            ans.add(team.name + " " + team.score);
            for(Players pl : team.players)
            {
                ans.add(" " + pl.name + " " + pl.score);
            }
        }
        return ans.toArray(new String[0]);
    }




    private class Players implements Comparable<Players>
    {
        String name;
        int score;
        Teams team;

        @Override
        public int compareTo(Players p) {
            if(this.score == p.score)
                return this.name.compareTo(p.name);
            else
                return p.score-this.score;
        }
    }

    private class Teams implements Comparable<Teams>
    {
        String name;
        int score;
        ArrayList<Players> players = new ArrayList<Players>();

        @Override
        public int compareTo(Teams t) {
            if(this.score == t.score)
                return this.name.compareTo(t.name);
            else
                return t.score-this.score;
        }

        void setScore(){
            score = 0;
            for(int i = 0; i < players.size(); i++)
            {
                score += players.get(i).score;
            }
        }
    }
}
