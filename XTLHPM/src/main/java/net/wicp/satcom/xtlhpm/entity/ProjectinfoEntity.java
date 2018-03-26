package net.wicp.satcom.xtlhpm.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "projectinfo", schema = "xtlhpm", catalog = "")
public class ProjectinfoEntity {
    private long autoid;
    private String uuid;
    private String proname;
    private String proschedule;
    private String procharger;
    private String prosettime;
    private String demandtime;
    private String designtime;
    private String timedesign;
    private String timecode;
    private String timetest;
    private String timemaintain;
    private String prostage;
    private String prostatus;
    private String pretotalday;
    private String actualtotalday;
    private String prosource;
    private String protype;
    private String prodescription;
    private String remark;

    @Id
    @Column(name = "autoid", nullable = false)
    public long getAutoid() {
        return autoid;
    }

    public void setAutoid(long autoid) {
        this.autoid = autoid;
    }

    @Basic
    @Column(name = " uuid", nullable = true, length = 36)
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "proname", nullable = true, length = 60)
    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    @Basic
    @Column(name = "proschedule", nullable = true, length = 10)
    public String getProschedule() {
        return proschedule;
    }

    public void setProschedule(String proschedule) {
        this.proschedule = proschedule;
    }

    @Basic
    @Column(name = "procharger", nullable = true, length = 10)
    public String getProcharger() {
        return procharger;
    }

    public void setProcharger(String procharger) {
        this.procharger = procharger;
    }

    @Basic
    @Column(name = "prosettime", nullable = true, length = 19)
    public String getProsettime() {
        return prosettime;
    }

    public void setProsettime(String prosettime) {
        this.prosettime = prosettime;
    }

    @Basic
    @Column(name = "demandtime", nullable = true, length = 19)
    public String getDemandtime() {
        return demandtime;
    }

    public void setDemandtime(String demandtime) {
        this.demandtime = demandtime;
    }

    @Basic
    @Column(name = "designtime", nullable = true, length = 19)
    public String getDesigntime() {
        return designtime;
    }

    public void setDesigntime(String designtime) {
        this.designtime = designtime;
    }

    @Basic
    @Column(name = "timedesign", nullable = true, length = 19)
    public String getTimedesign() {
        return timedesign;
    }

    public void setTimedesign(String timedesign) {
        this.timedesign = timedesign;
    }

    @Basic
    @Column(name = "timecode", nullable = true, length = 19)
    public String getTimecode() {
        return timecode;
    }

    public void setTimecode(String timecode) {
        this.timecode = timecode;
    }

    @Basic
    @Column(name = "timetest", nullable = true, length = 19)
    public String getTimetest() {
        return timetest;
    }

    public void setTimetest(String timetest) {
        this.timetest = timetest;
    }

    @Basic
    @Column(name = "timemaintain", nullable = true, length = 19)
    public String getTimemaintain() {
        return timemaintain;
    }

    public void setTimemaintain(String timemaintain) {
        this.timemaintain = timemaintain;
    }

    @Basic
    @Column(name = "prostage", nullable = true, length = 10)
    public String getProstage() {
        return prostage;
    }

    public void setProstage(String prostage) {
        this.prostage = prostage;
    }

    @Basic
    @Column(name = "prostatus", nullable = true, length = 6)
    public String getProstatus() {
        return prostatus;
    }

    public void setProstatus(String prostatus) {
        this.prostatus = prostatus;
    }

    @Basic
    @Column(name = "pretotalday", nullable = true, length = 10)
    public String getPretotalday() {
        return pretotalday;
    }

    public void setPretotalday(String pretotalday) {
        this.pretotalday = pretotalday;
    }

    @Basic
    @Column(name = "actualtotalday", nullable = true, length = 10)
    public String getActualtotalday() {
        return actualtotalday;
    }

    public void setActualtotalday(String actualtotalday) {
        this.actualtotalday = actualtotalday;
    }

    @Basic
    @Column(name = "prosource", nullable = true, length = 20)
    public String getProsource() {
        return prosource;
    }

    public void setProsource(String prosource) {
        this.prosource = prosource;
    }

    @Basic
    @Column(name = "protype", nullable = true, length = 19)
    public String getProtype() {
        return protype;
    }

    public void setProtype(String protype) {
        this.protype = protype;
    }

    @Basic
    @Column(name = "prodescription", nullable = true, length = 1000)
    public String getProdescription() {
        return prodescription;
    }

    public void setProdescription(String prodescription) {
        this.prodescription = prodescription;
    }

    @Basic
    @Column(name = "remark", nullable = true, length = 500)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectinfoEntity that = (ProjectinfoEntity) o;
        return autoid == that.autoid &&
                Objects.equals(uuid, that.uuid) &&
                Objects.equals(proname, that.proname) &&
                Objects.equals(proschedule, that.proschedule) &&
                Objects.equals(procharger, that.procharger) &&
                Objects.equals(prosettime, that.prosettime) &&
                Objects.equals(demandtime, that.demandtime) &&
                Objects.equals(designtime, that.designtime) &&
                Objects.equals(timedesign, that.timedesign) &&
                Objects.equals(timecode, that.timecode) &&
                Objects.equals(timetest, that.timetest) &&
                Objects.equals(timemaintain, that.timemaintain) &&
                Objects.equals(prostage, that.prostage) &&
                Objects.equals(prostatus, that.prostatus) &&
                Objects.equals(pretotalday, that.pretotalday) &&
                Objects.equals(actualtotalday, that.actualtotalday) &&
                Objects.equals(prosource, that.prosource) &&
                Objects.equals(protype, that.protype) &&
                Objects.equals(prodescription, that.prodescription) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(autoid, uuid, proname, proschedule, procharger, prosettime, demandtime, designtime, timedesign, timecode, timetest, timemaintain, prostage, prostatus, pretotalday, actualtotalday, prosource, protype, prodescription, remark);
    }
}
