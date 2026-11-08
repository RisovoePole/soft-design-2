package org.example;

import java.util.ArrayList;

public class Pipeline implements IPipelineStep {

    public ArrayList<IPipelineStep> steps = new ArrayList();

    public void execute(Context context) {
        for (IPipelineStep step : steps) {
            step.execute(context);
        }
    }
}
