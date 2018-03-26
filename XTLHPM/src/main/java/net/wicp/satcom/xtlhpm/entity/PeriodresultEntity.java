package net.wicp.satcom.xtlhpm.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "periodresult", schema = "xtlhpm", catalog = "")
public class PeriodresultEntity {
    private long autoid;
    private String uuid;
    private String charger;
    private String employeename;
    private BigDecimal totalscore;
    private String checktime;
    private String checkresult;
    private String checkdescribe;
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
    @Column(name = "charger", nullable = true, length = 20)
    public String getCharger() {
        return charger;
    }

    public void setCharger(String charger) {
        this.charger = charger;
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
    @Column(name = "totalscore", nullable = true, precision = 1)
    public BigDecimal getTotalscore() {
        return totalscore;
    }

    public void setTotalscore(BigDecimal totalscore) {
        this.totalscore = totalscore;
    }

    @Basic
    @Column(name = "checktime", nullable = true, length = 19)
    public String getChecktime() {
        return checktime;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime;
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
        PeriodresultEntity that = (PeriodresultEntity) o;
        return autoid == that.autoid &&
                Objects.equals(uuid, that.uuid) &&
                Objects.equals(charger, that.charger) &&
                Objects.equals(employeename, that.employeename) &&
                Objects.equals(totalscore, that.totalscore) &&
                Objects.equals(checktime, that.checktime) &&
                Objects.equals(checkresult, that.checkresult) &&
                Objects.equals(checkdescribe, that.checkdescribe) &&
                Objects.equals(operator, that.operator) &&
                Objects.equals(operatetime, that.operatetime) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(autoid, uuid, charger, employeename, totalscore, checktime, checkresult, checkdescribe, operator, operatetime, remark);
    }
}
