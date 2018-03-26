package net.wicp.satcom.xtlhpm.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "codetable", schema = "xtlhpm", catalog = "")
public class CodetableEntity {
    private long autoid;
    private String datatype;
    private String name;
    private String pid;
    private String cid;
    private BigDecimal score;
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
    @Column(name = "datatype", nullable = true, length = 30)
    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "pid", nullable = true, length = 20)
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "cid", nullable = true, length = 20)
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
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
        CodetableEntity that = (CodetableEntity) o;
        return autoid == that.autoid &&
                Objects.equals(datatype, that.datatype) &&
                Objects.equals(name, that.name) &&
                Objects.equals(pid, that.pid) &&
                Objects.equals(cid, that.cid) &&
                Objects.equals(score, that.score) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(autoid, datatype, name, pid, cid, score, remark);
    }
}
