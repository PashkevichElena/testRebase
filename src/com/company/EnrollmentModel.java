package com.company;

public class EnrollmentModel {

    public EnrollmentStatus getStatus() {
        return status;
    }

    public void setStatus(EnrollmentStatus status) {
        this.status = status;
    }

    private String authorEmail;
    private String authorName;
    private String userName;
    private String userEmail;
    private EnrollmentStatus status;
public EnrollmentModel(EnrollmentStatus status){
    this.status = status;
}

    public enum EnrollmentStatus {
        PENDING, CONFIRMED, PENDING_APPROVAL, INVITED, COMPLETED, AFFERED, CANCELLED, YANCELLED,
        UNDEFINED, ATTENDED, ALLOWED, ON_HOLD;
    }

    public enum EnrollmentCalendarStatus {
        INVITED, UPDATED, RESENDING
    }
}
