package com.unicamp.entity;

import javax.persistence.*;

@Entity
@Table(name="consultation")
public class Consultation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "patientId")
    private Patient patient;

    @Column(name="mainComplaint")
    private String mainComplaint;

    @Column(name="subjectiveComments")
    private String subjectiveComments;

    @Column(name="height")
    private String height;

    @Column(name="weight")
    private String weight;

    @Column(name="temperature")
    private String temperature;

    @Column(name="diastolicPressure")
    private String diastolicPressure;

    @Column(name="systolicPressure")
    private String systolicPressure;

    @Column(name="heartRate")
    private String heartRate;

    @Column(name="glycemicLevel")
    private String glycemicLevel;

    @Column(name="respiratoryRate")
    private String respiratoryRate;

    @Column(name="oxigenLevel")
    private String oxigenLevel;

    @Column(name="carbonDioxideLevel")
    private String carbonDioxideLevel;

    @Column(name="objectiveComments")
    private String objectiveComments;

    @Column(name="analysisDiagnostic")
    private String analysisDiagnostic;

    @Column(name="analysisType")
    private String analysisType;

    @Column(name="analysisComments")
    private String analysisComments;

    @Column(name="conduct")
    private String conduct;

    @Column(name="planComments")
    private String planComments;

    @Column(name="evolution")
    private String evolution;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getMainComplaint() {
        return mainComplaint;
    }

    public void setMainComplaint(String mainComplaint) {
        this.mainComplaint = mainComplaint;
    }

    public String getSubjectiveComments() {
        return subjectiveComments;
    }

    public void setSubjectiveComments(String subjectiveComments) {
        this.subjectiveComments = subjectiveComments;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getDiastolicPressure() {
        return diastolicPressure;
    }

    public void setDiastolicPressure(String diastolicPressure) {
        this.diastolicPressure = diastolicPressure;
    }

    public String getSystolicPressure() {
        return systolicPressure;
    }

    public void setSystolicPressure(String systolicPressure) {
        this.systolicPressure = systolicPressure;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate;
    }

    public String getGlycemicLevel() {
        return glycemicLevel;
    }

    public void setGlycemicLevel(String glycemicLevel) {
        this.glycemicLevel = glycemicLevel;
    }

    public String getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(String respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public String getOxigenLevel() {
        return oxigenLevel;
    }

    public void setOxigenLevel(String oxigenLevel) {
        this.oxigenLevel = oxigenLevel;
    }

    public String getCarbonDioxideLevel() {
        return carbonDioxideLevel;
    }

    public void setCarbonDioxideLevel(String carbonDioxideLevel) {
        this.carbonDioxideLevel = carbonDioxideLevel;
    }

    public String getObjectiveComments() {
        return objectiveComments;
    }

    public void setObjectiveComments(String objectiveComments) {
        this.objectiveComments = objectiveComments;
    }

    public String getAnalysisDiagnostic() {
        return analysisDiagnostic;
    }

    public void setAnalysisDiagnostic(String analysisDiagnostic) {
        this.analysisDiagnostic = analysisDiagnostic;
    }

    public String getAnalysisType() {
        return analysisType;
    }

    public void setAnalysisType(String analysisType) {
        this.analysisType = analysisType;
    }

    public String getAnalysisComments() {
        return analysisComments;
    }

    public void setAnalysisComments(String analysisComments) {
        this.analysisComments = analysisComments;
    }

    public String getConduct() {
        return conduct;
    }

    public void setConduct(String conduct) {
        this.conduct = conduct;
    }

    public String getPlanComments() {
        return planComments;
    }

    public void setPlanComments(String planComments) {
        this.planComments = planComments;
    }

    public String getEvolution() {
        return evolution;
    }

    public void setEvolution(String evolution) {
        this.evolution = evolution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Consultation that = (Consultation) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (patient != null ? !patient.equals(that.patient) : that.patient != null) return false;
        if (mainComplaint != null ? !mainComplaint.equals(that.mainComplaint) : that.mainComplaint != null)
            return false;
        if (subjectiveComments != null ? !subjectiveComments.equals(that.subjectiveComments) : that.subjectiveComments != null)
            return false;
        if (height != null ? !height.equals(that.height) : that.height != null) return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;
        if (temperature != null ? !temperature.equals(that.temperature) : that.temperature != null) return false;
        if (diastolicPressure != null ? !diastolicPressure.equals(that.diastolicPressure) : that.diastolicPressure != null)
            return false;
        if (systolicPressure != null ? !systolicPressure.equals(that.systolicPressure) : that.systolicPressure != null)
            return false;
        if (heartRate != null ? !heartRate.equals(that.heartRate) : that.heartRate != null) return false;
        if (glycemicLevel != null ? !glycemicLevel.equals(that.glycemicLevel) : that.glycemicLevel != null)
            return false;
        if (respiratoryRate != null ? !respiratoryRate.equals(that.respiratoryRate) : that.respiratoryRate != null)
            return false;
        if (oxigenLevel != null ? !oxigenLevel.equals(that.oxigenLevel) : that.oxigenLevel != null) return false;
        if (carbonDioxideLevel != null ? !carbonDioxideLevel.equals(that.carbonDioxideLevel) : that.carbonDioxideLevel != null)
            return false;
        if (objectiveComments != null ? !objectiveComments.equals(that.objectiveComments) : that.objectiveComments != null)
            return false;
        if (analysisDiagnostic != null ? !analysisDiagnostic.equals(that.analysisDiagnostic) : that.analysisDiagnostic != null)
            return false;
        if (analysisType != null ? !analysisType.equals(that.analysisType) : that.analysisType != null) return false;
        if (analysisComments != null ? !analysisComments.equals(that.analysisComments) : that.analysisComments != null)
            return false;
        if (conduct != null ? !conduct.equals(that.conduct) : that.conduct != null) return false;
        if (planComments != null ? !planComments.equals(that.planComments) : that.planComments != null) return false;
        return !(evolution != null ? !evolution.equals(that.evolution) : that.evolution != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (patient != null ? patient.hashCode() : 0);
        result = 31 * result + (mainComplaint != null ? mainComplaint.hashCode() : 0);
        result = 31 * result + (subjectiveComments != null ? subjectiveComments.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (temperature != null ? temperature.hashCode() : 0);
        result = 31 * result + (diastolicPressure != null ? diastolicPressure.hashCode() : 0);
        result = 31 * result + (systolicPressure != null ? systolicPressure.hashCode() : 0);
        result = 31 * result + (heartRate != null ? heartRate.hashCode() : 0);
        result = 31 * result + (glycemicLevel != null ? glycemicLevel.hashCode() : 0);
        result = 31 * result + (respiratoryRate != null ? respiratoryRate.hashCode() : 0);
        result = 31 * result + (oxigenLevel != null ? oxigenLevel.hashCode() : 0);
        result = 31 * result + (carbonDioxideLevel != null ? carbonDioxideLevel.hashCode() : 0);
        result = 31 * result + (objectiveComments != null ? objectiveComments.hashCode() : 0);
        result = 31 * result + (analysisDiagnostic != null ? analysisDiagnostic.hashCode() : 0);
        result = 31 * result + (analysisType != null ? analysisType.hashCode() : 0);
        result = 31 * result + (analysisComments != null ? analysisComments.hashCode() : 0);
        result = 31 * result + (conduct != null ? conduct.hashCode() : 0);
        result = 31 * result + (planComments != null ? planComments.hashCode() : 0);
        result = 31 * result + (evolution != null ? evolution.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Consultation{" +
                "id=" + id +
                ", patient=" + patient +
                ", mainComplaint='" + mainComplaint + '\'' +
                ", subjectiveComments='" + subjectiveComments + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", temperature='" + temperature + '\'' +
                ", diastolicPressure='" + diastolicPressure + '\'' +
                ", systolicPressure='" + systolicPressure + '\'' +
                ", heartRate='" + heartRate + '\'' +
                ", glycemicLevel='" + glycemicLevel + '\'' +
                ", respiratoryRate='" + respiratoryRate + '\'' +
                ", oxigenLevel='" + oxigenLevel + '\'' +
                ", carbonDioxideLevel='" + carbonDioxideLevel + '\'' +
                ", objectiveComments='" + objectiveComments + '\'' +
                ", analysisDiagnostic='" + analysisDiagnostic + '\'' +
                ", analysisType='" + analysisType + '\'' +
                ", analysisComments='" + analysisComments + '\'' +
                ", conduct='" + conduct + '\'' +
                ", planComments='" + planComments + '\'' +
                ", evolution='" + evolution + '\'' +
                '}';
    }
}
