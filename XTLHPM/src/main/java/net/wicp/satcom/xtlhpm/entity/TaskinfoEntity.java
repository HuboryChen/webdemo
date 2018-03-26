package net.wicp.satcom.xtlhpm.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "taskinfo", schema = "xtlhpm", catalog = "")
public class TaskinfoEntity {
    private long autoid;
    private String uuidpro;
    private String proname;
    private String uuidmodule;
    private String modulename;
    private String tasktime;
    private String requiredtime;
    private String committime;
    private String developername;
    private String uuidemployee;
    private String commitdesc;
    private String projudge;
    private String qualityjudge;
    private String judgedesc;
    private BigDecimal finishscore;
    private String auditer;
    private String audittime;
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
    @Column(name = "uuidpro", nullable = true, length = 36)
    public String getUuidpro() {
        return uuidpro;
    }

    public void setUuidpro(String uuidpro) {
        this.uuidpro = uuidpro;
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
    @Column(name = "uuidmodule", nullable = true, length = 36)
    public String getUuidmodule() {
        return uuidmodule;
    }

    public void setUuidmodule(String uuidmodule) {
        this.uuidmodule = uuidmodule;
    }

    @Basic
    @Column(name = "modulename", nullable = true, length = 60)
    public String getModulename() {
        return modulename;
    }

    public void setModulename(String modulename) {
        this.modulename = modulename;
    }

    @Basic
    @Column(name = "tasktime", nullable = true, length = 19)
    public String getTasktime() {
        return tasktime;
    }

    public void setTasktime(String tasktime) {
        this.tasktime = tasktime;
    }

    @Basic
    @Column(name = "requiredtime", nullable = true, length = 19)
    public String getRequiredtime() {
        return requiredtime;
    }

    public void setRequiredtime(String requiredtime) {
        this.requiredtime = requiredtime;
    }

    @Basic
    @Column(name = "committime", nullable = true, length = 19)
    public String getCommittime() {
        return committime;
    }

    public void setCommittime(String committime) {
        this.committime = committime;
    }

    @Basic
    @Column(name = "developername", nullable = true, length = 20)
    public String getDevelopername() {
        return developername;
    }

    public void setDevelopername(String developername) {
        this.developername = developername;
    }

    @Basic
    @Column(name = "uuidemployee", nullable = true, length = 36)
    public String getUuidemployee() {
        return uuidemployee;
    }

    public void setUuidemployee(String uuidemployee) {
        this.uuidemployee = uuidemployee;
    }

    @Basic
    @Column(name = "commitdesc", nullable = true, length = 500)
    public String getCommitdesc() {
        return commitdesc;
    }

    public void setCommitdesc(String commitdesc) {
        this.commitdesc = commitdesc;
    }

    @Basic
    @Column(name = "projudge", nullable = true, length = 20)
    public String getProjudge() {
        return projudge;
    }

    public void setProjudge(String projudge) {
        this.projudge = projudge;
    }

    @Basic
    @Column(name = "qualityjudge", nullable = true, length = 20)
    public String getQualityjudge() {
        return qualityjudge;
    }

    public void setQualityjudge(String qualityjudge) {
        this.qualityjudge = qualityjudge;
    }

    @Basic
    @Column(name = "judgedesc", nullable = true, length = 500)
    public String getJudgedesc() {
        return judgedesc;
    }

    public void setJudgedesc(String judgedesc) {
        this.judgedesc = judgedesc;
    }

    @Basic
    @Column(name = "finishscore", nullable = true, precision = 1)
    public BigDecimal getFinishscore() {
        return finishscore;
    }

    public void setFinishscore(BigDecimal finishscore) {
        this.finishscore = finishscore;
    }

    @Basic
    @Column(name = "auditer", nullable = true, length = 20)
    public String getAuditer() {
        return auditer;
    }

    public void setAuditer(String auditer) {
        this.auditer = auditer;
    }

    @Basic
    @Column(name = "audittime", nullable = true, length = 19)
    public String getAudittime() {
        return audittime;
    }

    public void setAudittime(String audittime) {
        this.audittime = audittime;
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
        TaskinfoEntity that = (TaskinfoEntity) o;
        return autoid == that.autoid &&
                Objects.equals(uuidpro, that.uuidpro) &&
                Objects.equals(proname, that.proname) &&
                Objects.equals(uuidmodule, that.uuidmodule) &&
                Objects.equals(modulename, that.modulename) &&
                Objects.equals(tasktime, that.tasktime) &&
                Objects.equals(requiredtime, that.requiredtime) &&
                Objects.equals(committime, that.committime) &&
                Objects.equals(developername, that.developername) &&
                Objects.equals(uuidemployee, that.uuidemployee) &&
                Objects.equals(commitdesc, that.commitdesc) &&
                Objects.equals(projudge, that.projudge) &&
                Objects.equals(qualityjudge, that.qualityjudge) &&
                Objects.equals(judgedesc, that.judgedesc) &&
                Objects.equals(finishscore, that.finishscore) &&
                Objects.equals(auditer, that.auditer) &&
                Objects.equals(audittime, that.audittime) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(autoid, uuidpro, proname, uuidmodule, modulename, tasktime, requiredtime, committime, developername, uuidemployee, commitdesc, projudge, qualityjudge, judgedesc, finishscore, auditer, audittime, remark);
    }
}
