package com.davidinnocent.ajs;

import java.io.Serializable;

public class Case implements Serializable {

    String case_id,field_by,defendant,case_des,case_status;
    int thumbs_up,thumbs_down;

    public Case() {
    }

    public String getCase_id() {
        return case_id;
    }

    public void setCase_id(String case_id) {
        this.case_id = case_id;
    }

    public String getField_by() {
        return field_by;
    }

    public void setField_by(String field_by) {
        this.field_by = field_by;
    }

    public String getDefendant() {
        return defendant;
    }

    public void setDefendant(String defendant) {
        this.defendant = defendant;
    }

    public String getCase_des() {
        return case_des;
    }

    public void setCase_des(String case_des) {
        this.case_des = case_des;
    }

    public String getCase_status() {
        return case_status;
    }

    public void setCase_status(String case_status) {
        this.case_status = case_status;
    }

    public int getThumbs_up() {
        return thumbs_up;
    }

    public void setThumbs_up(int thumbs_up) {
        this.thumbs_up = thumbs_up;
    }

    public int getThumbs_down() {
        return thumbs_down;
    }

    public void setThumbs_down(int thumbs_down) {
        this.thumbs_down = thumbs_down;
    }
}
