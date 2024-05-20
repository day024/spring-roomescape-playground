package roomescape.domain;

import roomescape.exception.InvalidRequestException;

public class Reservation {
    private long id;
    private String name;
    private String date;
    private String time;

    private final String INVALID_NAME_REQUEST_MESSAGE = "이름 정보가 공백입니다.";
    private final String INVALID_DATE_REQUEST_MESSAGE = "날짜 정보가 공백입니다.";
    private final String INVALID_TIME_REQUEST_MESSAGE = "시간 정보가 공백입니다.";

    public Reservation(long id, String name, String date, String time) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.time = time;
    }

    public long getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public void Validate(){
        nameValidate();
        dateValidate();
        timeValidate();
    }

    public void nameValidate() {
        if (isBlank(name)) {
            throw new InvalidRequestException(INVALID_NAME_REQUEST_MESSAGE);
        }
    }

    public void dateValidate() {
        if (isBlank(date)) {
            throw new InvalidRequestException(INVALID_DATE_REQUEST_MESSAGE);
        }
    }

    public void timeValidate() {
        if (isBlank(time)) {
            throw new InvalidRequestException(INVALID_TIME_REQUEST_MESSAGE);
        }
    }

    private boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }
}