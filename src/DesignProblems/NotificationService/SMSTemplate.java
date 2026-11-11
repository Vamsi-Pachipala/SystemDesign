package DesignProblems.NotificationService;

public class SMSTemplate  implements TemplateService {

    @Override
    public String getTemplate(String message) {
        return "SMS Template: " + message;
    }

}
