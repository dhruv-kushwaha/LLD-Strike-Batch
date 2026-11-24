public class Main {
    public static void main(String[] args) {
        Report report = new Report("Usha", 8, 2);
        report.setDisplayStrategy(new strategies.CompactDisplay());
        report.displayReport();

        report.setDisplayStrategy(new strategies.DetailedDisplay());
        report.displayReport();

        report.setDisplayStrategy(new strategies.PrivacyModeDisplay());
        report.displayReport();
    }
}
