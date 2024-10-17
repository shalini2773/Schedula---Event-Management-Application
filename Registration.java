package com;


public class Registration {
    
    private int registrationId;
    private int eventId;
    private int userId;
    public int getRegistrationId() {
        return registrationId;
    }
    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }
    public int getEventId() {
        return eventId;
    }
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public Registration(int registrationId, int eventId, int userId) {
        this.registrationId = registrationId;
        this.eventId = eventId;
        this.userId = userId;
    }

    
}
