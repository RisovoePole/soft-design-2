package org.example.Steps;

import org.example.Account;
import org.example.Context;
import org.example.IPipelineStep;

public class HideIpPipelineStep implements IPipelineStep {

    public final String newIP;

    public HideIpPipelineStep(String newIP) {
        this.newIP = newIP;
    }

    public void execute(Context context) {
        context.ipsHistory.add("???");
        Account.ChangeIP(context, newIP);
    }
}
