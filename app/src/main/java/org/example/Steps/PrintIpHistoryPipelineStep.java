package org.example.Steps;

import org.example.Account;
import org.example.Context;
import org.example.IPipelineStep;

public class PrintIpHistoryPipelineStep implements IPipelineStep {

    private static PrintIpHistoryPipelineStep instance;

    public static PrintIpHistoryPipelineStep getInstance() {
        if (instance == null) {
            instance = new PrintIpHistoryPipelineStep();
        }
        return instance;
    }

    public void execute(Context context) {
        System.out.println("\tIPs history:");
        for (String ip : context.ipsHistory) {
            System.out.println("\t-- %s".formatted(ip));
        }
    }
}
