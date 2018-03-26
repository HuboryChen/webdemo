package net.wicp.satcom.xtlhpm.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "pddetail", schema = "xtlhpm", catalog = "")
public class PddetailEntity {
    private long autoid;
    private String pduuid;
    private String employeename;
    private String subtitle;
    private BigDecimal subscore;
    private String checkresult;
    private String checkdescribe;
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
    @Column(name = "pduuid", nullable = true, length = 36)
    public String getPduuid() {
        return pduuid;
    }

    public void setPduuid(String pduuid) {
        this.pduuid = pduuid;
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
    @Column(name = "subtitle", nullable = true, length = 36)
    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @Basic
    @Column(name = "subscore", nullable = true, precision = 1)
    public BigDecimal getSubscore() {
        return subscore;
    }

    public void setSubscore(BigDecimal subscore) {
        this.subscore = subscore;
    }

    @Basic
    @Column(name = "checkresult", nullable = true, length = 20)
    public String getCheckresult() {
        return checkresult;
    }

    public void setCheckresult(String checkresult) {
        this.checkresult = checkresult;
    }

    @Basic
    @Column(name = "checkdescribe", nullable = true, length = 500)
    public String getCheckdescribe() {
        return checkdescribe;
    }

    public void setCheckdescribe(String checkdescribe) {
        this.checkdescribe = checkdescribe;
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
        PddetailEntity that = (PddetailEntity) o;
        return autoid == that.autoid &&
                Objects.equals(pduuid, that.pduuid) &&
                Objects.equals(employeename, that.employeename) &&
                Objects.equals(subtitle, that.subtitle) &&
                Objects.equals(subscore, that.subscore) &&
                Objects.equals(checkresult, that.checkresult) &&
                Objects.equals(checkdescribe, that.checkdescribe) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(autoid, pduuid, employeename, subtitle, subscore, checkresult, checkdescribe, remark);
    }
}
