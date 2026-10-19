package edu.campus.studyroom.model;
public class Reservation {
    private Long id;
    private String studentName;
    private String roomName;
    private int hours;
    private boolean confirmed;
    public Reservation() {}
    public Reservation(Long id, String studentName, String roomName, int hours, boolean confirmed) {
        this.id=id; this.studentName=studentName; this.roomName=roomName; this.hours=hours; this.confirmed=confirmed;
    }
    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}
    public String getStudentName(){return studentName;}
    public void setStudentName(String studentName){this.studentName=studentName;}
    public String getRoomName(){return roomName;}
    public void setRoomName(String roomName){this.roomName=roomName;}
    public int getHours(){return hours;}
    public void setHours(int hours){this.hours=hours;}
    public boolean isConfirmed(){return confirmed;}
    public void setConfirmed(boolean confirmed){this.confirmed=confirmed;}
}
