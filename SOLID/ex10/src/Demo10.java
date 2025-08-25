public class Demo10 {
    public static void main(String[] args) {
        ILogger logger = new ConsoleLogger();
        LoggerService loggerService = new LoggerService(logger);
        ReportService reportService = new ReportService(loggerService);
        reportService.generate();
    }
}
