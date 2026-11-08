package org.example.Steps;

import org.example.Account;
import org.example.Context;
import org.example.IPipelineStep;

public class InspectAccountPipelineStep implements IPipelineStep {

    private static InspectAccountPipelineStep inspect;

    public static InspectAccountPipelineStep getInstace() {
        if (inspect == null) {
            inspect = new InspectAccountPipelineStep();
        }
        return inspect;
    }

    public void execute(Context context) {
        Account.Inspect(context);
    }
}
