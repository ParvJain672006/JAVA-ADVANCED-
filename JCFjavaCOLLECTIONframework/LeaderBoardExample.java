package JCFjavaCOLLECTIONframework;

import java.util.Collections;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class LeaderBoardExample {
    public static void main(String[] args) {
        TreeMap<Integer, PriorityQueue<String>> L = new TreeMap<>(Collections.reverseOrder());

        
        L.putIfAbsent(100, new PriorityQueue<>());
        L.get(100).add("alice");
        L.get(100).add("parv");
        L.putIfAbsent(90, new PriorityQueue<>());
        L.get(90).add("bob");

        
        for (Map.Entry<Integer, PriorityQueue<String>> Entry : L.entrySet()) {
            System.out.println("score " + Entry.getKey() + " plays: " + Entry.getValue());
        }
    }
}



// Step - 1
// -> TreeMap: Stores keys in sorted order.
// -> PriorityOueue: Holds players name for each score.

// Step - 2
// -> TreeMap(</.......................>)
// -> Intialize a treemap with integer keys(the scores,) using collections.reverse order()
// -> Higher scores comes first

// Step - 3
// -> Populating the LeaderBoard
// -> putIfAbsent => checks if 100 is present in the map, if not add a new priorityqueue<>(); for the same.
// -> add alice, bob => for the score 100.
// -> both are now associated with same score.

// Step - 4
// -> Display the leaderboard 
// -> for(......)
// -> Itrates through the map entries in decending order of source(due to collection.reverse order)
// -> prints each score alongside list of playernames

// *treemap orders scores
// *priority queue stores players
// *efficient grouping->multiple played with same score are grouped together under save scores without duplicating the code.