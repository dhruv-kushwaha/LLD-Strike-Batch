package factoryMethodExamples.overridableDefault;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Job> jobs = List.of(new EmailJob(), new ReportJob(), new PaymentCaptureJob());

        jobs.forEach(Job::run);
    }
}
