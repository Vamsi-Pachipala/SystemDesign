package DesignProblems.NotificationService;

public class EmailTemplate implements TemplateService {

    @Override
    public String getTemplate(String message) {
        return "Email Template: " + message;
    }
}
