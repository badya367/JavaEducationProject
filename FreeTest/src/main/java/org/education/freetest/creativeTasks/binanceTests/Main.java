package org.education.freetest.creativeTasks.binanceTests;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        String apiKey ="TLD4kVp4z7X0dMP94MKW7pzLSo2D8wCt3Ga9KvvqBZZUf8tjBPeO75EDsKtAkGYf";
        String secretKey ="koQMdHB23EKkaQsJYtOVM8WG9TVMYSVZ00DVYUBQqXYSj9LHxUgRGgayXPLZ2Hmn";
        String baseURL ="https://testnet.binance.vision";
        Bot bot = new Bot("BTCUSDT");
        Bot bot1 = new Bot("BNBUSDT");

        SpotClient client = new SpotClientImpl(apiKey, secretKey, baseURL);

        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        scheduledExecutorService.scheduleAtFixedRate(() -> {
            Map<String, Object> parameters = new LinkedHashMap<>();
            parameters.clear();
            ArrayList<String> symbols = new ArrayList<>();
            symbols.add(bot.getName());
            symbols.add(bot1.getName());

            parameters.put("symbols", symbols);
            String result = client.createMarket().bookTicker(parameters);

            System.out.println(result);
        }, 0, 5000, TimeUnit.MILLISECONDS);
        try {
            Thread.sleep(11000);
        } catch (InterruptedException e) {
            return;
        }
        scheduledExecutorService.shutdown();

    }
}

class Bot{
    private volatile double bidPrice;
    private final String name;

    Bot(String name) {
        this.name = name;
    }

    public synchronized void update(double bidPrice) {
        this.bidPrice = bidPrice;
    }

    public String getName() {
        return name;
    }
}
