package org.example.Steps;

import org.example.Account;
import org.example.Context;
import org.example.IPipelineStep;

public class ChangeIpPipelineStep implements IPipelineStep {

    public final String newIP;

    public ChangeIpPipelineStep(String newIP) {
        this.newIP = newIP;
    }

    public void execute(Context context) {
        context.ipsHistory.add(newIP);
        Account.ChangeIP(context, newIP);
    }
}
