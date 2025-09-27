
import java.util.*;

class Query {

    int start, end;

    public Query(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class SubwaySystem {

    private int N, M;
    private List<List<Integer>> lines;
    private Map<Integer, List<Integer>> stationMap;

    public SubwaySystem(int N, int M) {
        this.N = N;
        this.M = M;
        lines = new ArrayList<>();
        stationMap = new HashMap<>();
    }

    public void addLine(List<Integer> stations) {
        int lineId = lines.size();
        lines.add(stations);

        for (int station : stations) {
            stationMap.putIfAbsent(station, new ArrayList<>());
            stationMap.get(station).add(lineId);
        }
    }

    public int findMinLineChanges(int start, int end) {
        if (start == end) {
            return 0;
        }
        if (!stationMap.containsKey(start) || !stationMap.containsKey(end)) {
            return -1;
        }

        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[M];

        for (int line : stationMap.get(start)) {
            queue.add(new int[]{line, 0});
            visited[line] = true;
        }

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int line = cur[0];
            int changes = cur[1];

            if (lines.get(line).contains(end)) {
                return changes;
            }

            for (int station : lines.get(line)) {
                for (int nextLine : stationMap.get(station)) {
                    if (!visited[nextLine]) {
                        visited[nextLine] = true;
                        queue.add(new int[]{nextLine, changes + 1});
                    }
                }
            }
        }
        return -1;
    }
}

public class Algorithm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        SubwaySystem subway = new SubwaySystem(N, M);

        for (int i = 0; i < M; i++) {
            int S = sc.nextInt();
            List<Integer> stations = new ArrayList<>();
            for (int j = 0; j < S; j++) {
                stations.add(sc.nextInt());
            }
            subway.addLine(stations);
        }

        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int result = subway.findMinLineChanges(A, B);
            if (result == -1) {
                System.out.println("impossible");
            } else {
                System.out.println(result);
            }
        }

        sc.close();
    }
}
