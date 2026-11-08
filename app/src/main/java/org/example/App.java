package org.example;

import java.util.ArrayList;
import java.util.List;
import org.example.Steps.ChangeIpPipelineStep;
import org.example.Steps.ChangeNamePipelineStep;
import org.example.Steps.HideIpPipelineStep;
import org.example.Steps.InspectAccountPipelineStep;
import org.example.Steps.PrintIpHistoryPipelineStep;

public class App {

    public static void main(String[] args) {
        Account account = new Account("12313121231251", 1241L, "Victor");
        Context context = new Context();
        context.account = account;
        context.ipsHistory = new ArrayList<>();

        InspectAccountPipelineStep inspect =
            InspectAccountPipelineStep.getInstace();
        PrintIpHistoryPipelineStep printIpHistory =
            PrintIpHistoryPipelineStep.getInstance();
        ChangeIpPipelineStep step1 = new ChangeIpPipelineStep(
            "99999999999999999"
        );
        ChangeNamePipelineStep step2 = new ChangeNamePipelineStep("ViteaRU");
        ChangeNamePipelineStep step3 = new ChangeNamePipelineStep("--victor--");
        HideIpPipelineStep step4 = new HideIpPipelineStep("7777777777777");
        ChangeIpPipelineStep step5 = new ChangeIpPipelineStep("987654321");
        Pipeline pipe1 = new Pipeline();
        pipe1.steps = new ArrayList<>(List.of(inspect, inspect, inspect));

        ArrayList<IPipelineStep> pipe = new ArrayList<>(
            List.of(
                pipe1,
                step1,
                inspect,
                step2,
                inspect,
                step4,
                inspect,
                step3,
                inspect,
                step5,
                inspect,
                printIpHistory
            )
        );

        for (IPipelineStep pipelineStep : pipe) {
            pipelineStep.execute(context);
        }
    }
}
