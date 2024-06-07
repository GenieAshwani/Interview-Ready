package LLD.LoadBalancer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Server class representing a server in the load balancer
class Server {
    private String name;

    public Server(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Simulate server processing
    public void processRequest(String request) {
        System.out.println("Server " + name + " processing request: " + request);
        // Simulate processing time
        try {
            Thread.sleep(1000); // Simulate processing time of 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Request processed by server " + name);
    }
}

// LoadBalancer class representing the load balancer
class LoadBalancer {
    private List<Server> servers;
    private int currentIndex;

    public LoadBalancer() {
        servers = new ArrayList<>();
        servers.add(new Server("Server1"));
        servers.add(new Server("Server2"));
        servers.add(new Server("Server3"));
        servers.add(new Server("Server4"));
        currentIndex = 0;
    }

    // Distribute request to a random server
    public void distributeRequest(String request) {
        synchronized (this) {
            Server server = servers.get(currentIndex);
            server.processRequest(request);
            currentIndex = (currentIndex + 1) % servers.size();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LoadBalancer loadBalancer = new LoadBalancer();
        // Simulate incoming requests
        for (int i = 1; i <= 10; i++) {
            String request = "Request " + i;
            System.out.println("Incoming request: " + request);
            loadBalancer.distributeRequest(request);
            System.out.println();
        }
    }
}
