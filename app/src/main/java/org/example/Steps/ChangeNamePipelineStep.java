package org.example.Steps;

import org.example.Account;
import org.example.Context;
import org.example.IPipelineStep;

public class ChangeNamePipelineStep implements IPipelineStep {

    public final String newAccountName;

    public ChangeNamePipelineStep(String newAccountName) {
        this.newAccountName = newAccountName;
    }

    public void execute(Context context) {
        Account.ChangeName(context, newAccountName);
    }
}
