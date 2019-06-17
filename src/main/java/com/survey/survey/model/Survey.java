package com.survey.survey.model;

import javax.persistence.*;

/**
 * @author alexa on 6/17/2019.
 */
@Entity
@Table(name = "survey_table")
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String email, phoneNumber, university, specialization, workingSituation, jobName, jobType, companyName,
            companyCity, studyingSituation, wishedWorkingLocation;

    @OneToOne(mappedBy = "survey")
    private User user;

    public Survey(String email, String phoneNumber, String university, String specialization, String workingSituation
            , String jobName, String jobType, String companyName, String companyCity, String studyingSituation,
                  String wishedWorkingLocation) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.university = university;
        this.specialization = specialization;
        this.workingSituation = workingSituation;
        this.jobName = jobName;
        this.jobType = jobType;
        this.companyName = companyName;
        this.companyCity = companyCity;
        this.studyingSituation = studyingSituation;
        this.wishedWorkingLocation = wishedWorkingLocation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getWorkingSituation() {
        return workingSituation;
    }

    public void setWorkingSituation(String workingSituation) {
        this.workingSituation = workingSituation;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyCity() {
        return companyCity;
    }

    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
    }

    public String getStudyingSituation() {
        return studyingSituation;
    }

    public void setStudyingSituation(String studyingSituation) {
        this.studyingSituation = studyingSituation;
    }

    public String getWishedWorkingLocation() {
        return wishedWorkingLocation;
    }

    public void setWishedWorkingLocation(String wishedWorkingLocation) {
        this.wishedWorkingLocation = wishedWorkingLocation;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Survey{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", university='" + university + '\'' +
                ", specialization='" + specialization + '\'' +
                ", workingSituation='" + workingSituation + '\'' +
                ", jobName='" + jobName + '\'' +
                ", jobType='" + jobType + '\'' +
                ", companyName='" + companyName + '\'' +
                ", companyCity='" + companyCity + '\'' +
                ", studyingSituation='" + studyingSituation + '\'' +
                ", wishedWorkingLocation='" + wishedWorkingLocation + '\'' +
                ", user=" + user +
                '}';
    }
}
