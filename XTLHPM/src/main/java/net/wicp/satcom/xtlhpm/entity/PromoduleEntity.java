package net.wicp.satcom.xtlhpm.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "promodule", schema = "xtlhpm", catalog = "")
public class PromoduleEntity {
    private long autoid;
    private String uuid;
    private String proname;
    private String modulename;
    private String pmoduleid;
    private String moduleid;
    private String moduledes;
    private String operator;
    private String operatetime;
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
    @Column(name = "uuid", nullable = true, length = 36)
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
    @Column(name = "modulename", nullable = true, length = 60)
    public String getModulename() {
        return modulename;
    }

    public void setModulename(String modulename) {
        this.modulename = modulename;
    }

    @Basic
    @Column(name = "pmoduleid", nullable = true, length = 10)
    public String getPmoduleid() {
        return pmoduleid;
    }

    public void setPmoduleid(String pmoduleid) {
        this.pmoduleid = pmoduleid;
    }

    @Basic
    @Column(name = "moduleid", nullable = true, length = 10)
    public String getModuleid() {
        return moduleid;
    }

    public void setModuleid(String moduleid) {
        this.moduleid = moduleid;
    }

    @Basic
    @Column(name = "moduledes", nullable = true, length = 200)
    public String getModuledes() {
        return moduledes;
    }

    public void setModuledes(String moduledes) {
        this.moduledes = moduledes;
    }

    @Basic
    @Column(name = "operator", nullable = true, length = 20)
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Basic
    @Column(name = "operatetime", nullable = true, length = 19)
    public String getOperatetime() {
        return operatetime;
    }

    public void setOperatetime(String operatetime) {
        this.operatetime = operatetime;
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
        PromoduleEntity that = (PromoduleEntity) o;
        return autoid == that.autoid &&
                Objects.equals(uuid, that.uuid) &&
                Objects.equals(proname, that.proname) &&
                Objects.equals(modulename, that.modulename) &&
                Objects.equals(pmoduleid, that.pmoduleid) &&
                Objects.equals(moduleid, that.moduleid) &&
                Objects.equals(moduledes, that.moduledes) &&
                Objects.equals(operator, that.operator) &&
                Objects.equals(operatetime, that.operatetime) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(autoid, uuid, proname, modulename, pmoduleid, moduleid, moduledes, operator, operatetime, remark);
    }
}
