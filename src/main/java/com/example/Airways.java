package com.example;

import jakarta.persistence.*;

@Entity
@Table(name = "AIRWAYS")
public class Airways {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AWY_KEY")
    private Long awyKey;

    @Column(name = "AWY_ID")
    private String awyId;

    @Column(name = "AWY_RT_TYPE")
    private String awyRtType;

    @Column(name = "AWY_LEVEL")
    private String awyLevel;

    @Column(name = "AWY_OPERATOR")
    private String awyOperator;

    @Column(name = "AWY_SUBSTITUTE")
    private String awySubstitute;

    @Column(name = "AWY_UPD_STATUS")
    private String awyUpdStatus;

    @Column(name = "AWY_JOP")
    private String awyJop;

    @Column(name = "AWY_ACTIVE")
    private Integer awyActive;

    public Long getAwyKey() {
        return awyKey;
    }

    public void setAwyKey(Long awyKey) {
        this.awyKey = awyKey;
    }

    public String getAwyId() {
        return awyId;
    }

    public void setAwyId(String awyId) {
        this.awyId = awyId;
    }

    public String getAwyRtType() {
        return awyRtType;
    }

    public void setAwyRtType(String awyRtType) {
        this.awyRtType = awyRtType;
    }

    public String getAwyLevel() {
        return awyLevel;
    }

    public void setAwyLevel(String awyLevel) {
        this.awyLevel = awyLevel;
    }

    public String getAwyOperator() {
        return awyOperator;
    }

    public void setAwyOperator(String awyOperator) {
        this.awyOperator = awyOperator;
    }

    public String getAwySubstitute() {
        return awySubstitute;
    }

    public void setAwySubstitute(String awySubstitute) {
        this.awySubstitute = awySubstitute;
    }

    public String getAwyUpdStatus() {
        return awyUpdStatus;
    }

    public void setAwyUpdStatus(String awyUpdStatus) {
        this.awyUpdStatus = awyUpdStatus;
    }

    public String getAwyJop() {
        return awyJop;
    }

    public void setAwyJop(String awyJop) {
        this.awyJop = awyJop;
    }

    public Integer getAwyActive() {
        return awyActive;
    }

    public void setAwyActive(Integer awyActive) {
        this.awyActive = awyActive;
    }

}