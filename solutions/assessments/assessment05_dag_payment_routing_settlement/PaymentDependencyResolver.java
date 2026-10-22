package assessments.assessment05_dag_payment_routing_settlement;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class PaymentDependencyResolver {
    public static List<String> resolveExecutionOrder(List<String> transfers, List<String[]> dependencies) {
        List<String> result = new ArrayList<>();
        if (transfers == null) return result;

        Map<String, Integer> inDegree = new HashMap<>();
        Map<String, List<String>> adj = new HashMap<>();

        for (String tx : transfers) {
            inDegree.put(tx, 0);
            adj.put(tx, new ArrayList<>());
        }

        if (dependencies != null) {
            for (String[] dep : dependencies) {
                String dependent = dep[0];
                String prereq = dep[1];
                if (adj.containsKey(prereq) && inDegree.containsKey(dependent)) {
                    adj.get(prereq).add(dependent);
                    inDegree.put(dependent, inDegree.get(dependent) + 1);
                }
            }
        }

        Queue<String> queue = new ArrayDeque<>();
        for (String tx : inDegree.keySet()) {
            if (inDegree.get(tx) == 0) {
                queue.offer(tx);
            }
        }

        while (!queue.isEmpty()) {
            String curr = queue.poll();
            result.add(curr);
            for (String neighbor : adj.get(curr)) {
                inDegree.put(neighbor, inDegree.get(neighbor) - 1);
                if (inDegree.get(neighbor) == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        return result.size() == transfers.size() ? result : new ArrayList<>();
    }
}
