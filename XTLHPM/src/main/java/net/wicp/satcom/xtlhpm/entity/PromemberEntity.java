package net.wicp.satcom.xtlhpm.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "promember", schema = "xtlhpm", catalog = "")
public class PromemberEntity {
    private long autoid;
    private String uuid;
    private String proname;
    private String employeename;
    private String employeemobile;
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
    @Column(name = "employeename", nullable = true, length = 20)
    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    @Basic
    @Column(name = "employeemobile", nullable = true, length = 11)
    public String getEmployeemobile() {
        return employeemobile;
    }

    public void setEmployeemobile(String employeemobile) {
        this.employeemobile = employeemobile;
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
        PromemberEntity that = (PromemberEntity) o;
        return autoid == that.autoid &&
                Objects.equals(uuid, that.uuid) &&
                Objects.equals(proname, that.proname) &&
                Objects.equals(employeename, that.employeename) &&
                Objects.equals(employeemobile, that.employeemobile) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(autoid, uuid, proname, employeename, employeemobile, remark);
    }
}
