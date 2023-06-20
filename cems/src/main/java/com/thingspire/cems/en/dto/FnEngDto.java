package com.thingspire.cems.en.dto;

import lombok.Data;

import java.beans.Transient;


@Data
public class FnEngDto {

    private static final long serialVersionUID = 1L;


    private Integer id;

    private String engId;

    private String engName;

    private String engDescr;

    private String engUnit;

    private String engAbbr;

    private String useYn;

    private Integer regUserNo;

    private Long regDtm;

    private Integer chgUserNo;

    private Long chgDtm;

}
