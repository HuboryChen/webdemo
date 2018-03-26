package net.wicp.satcom.xtlhpm.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "dailyresult", schema = "xtlhpm", catalog = "")
public class DailyresultEntity {
    private long autoid;
    private String uuid;
    private String employeename;
    private String resulttype;
    private String resultdesc;
    private BigDecimal score;
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
    @Column(name = "employeename", nullable = true, length = 20)
    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    @Basic
    @Column(name = "resulttype", nullable = true, length = 20)
    public String getResulttype() {
        return resulttype;
    }

    public void setResulttype(String resulttype) {
        this.resulttype = resulttype;
    }

    @Basic
    @Column(name = "resultdesc", nullable = true, length = 200)
    public String getResultdesc() {
        return resultdesc;
    }

    public void setResultdesc(String resultdesc) {
        this.resultdesc = resultdesc;
    }

    @Basic
    @Column(name = "score", nullable = true, precision = 1)
    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
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
        DailyresultEntity that = (DailyresultEntity) o;
        return autoid == that.autoid &&
                Objects.equals(uuid, that.uuid) &&
                Objects.equals(employeename, that.employeename) &&
                Objects.equals(resulttype, that.resulttype) &&
                Objects.equals(resultdesc, that.resultdesc) &&
                Objects.equals(score, that.score) &&
                Objects.equals(operator, that.operator) &&
                Objects.equals(operatetime, that.operatetime) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(autoid, uuid, employeename, resulttype, resultdesc, score, operator, operatetime, remark);
    }
}
