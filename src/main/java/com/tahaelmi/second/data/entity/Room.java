package com.tahaelmi.second.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "ROOM")
public class Room {
    @Id
    @Column(name = "ROOM_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long roomID;
    @Column(name = "NAME")
    private String roomName;
    @Column(name = "ROOM_NUMBER")
    private String roomNumber;
    @Column(name = "BED_INFO")
    private String berInfo;

    public long getRoomID() {
        return roomID;
    }

    public void setRoomID(long roomID) {
        this.roomID = roomID;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBerInfo() {
        return berInfo;
    }

    public void setBerInfo(String berInfo) {
        this.berInfo = berInfo;
    }

    public Long getRoomId() {
        return roomID;
    }
}
