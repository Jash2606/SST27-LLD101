
public class CommunicationService {
    CommunicationMethod communicationMethod;

    public CommunicationService(CommunicationMethod communicationMethod) {
        this.communicationMethod = communicationMethod;
    }

    public void send(String to , String body) {
        communicationMethod.send(to, body);
    }

}
