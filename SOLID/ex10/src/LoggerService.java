public class LoggerService {
    ILogger logger;

    public LoggerService(ILogger logger) {
        this.logger = logger;
    }

    public void log(String message) {
        logger.log(message);
    }
}
