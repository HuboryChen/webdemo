package net.wicp.satcom.xtlhpm.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "annex", schema = "xtlhpm", catalog = "")
public class AnnexEntity {
    private long autoid;
    private String totablecode;
    private String savename;
    private String annextype;
    private String annexdepict;
    private String uploadtime;
    private String totable;
    private String operatoraccount;
    private String operatorname;
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
    @Column(name = "totablecode", nullable = true, length = 36)
    public String getTotablecode() {
        return totablecode;
    }

    public void setTotablecode(String totablecode) {
        this.totablecode = totablecode;
    }

    @Basic
    @Column(name = "savename", nullable = true, length = 100)
    public String getSavename() {
        return savename;
    }

    public void setSavename(String savename) {
        this.savename = savename;
    }

    @Basic
    @Column(name = "annextype", nullable = true, length = 30)
    public String getAnnextype() {
        return annextype;
    }

    public void setAnnextype(String annextype) {
        this.annextype = annextype;
    }

    @Basic
    @Column(name = "annexdepict", nullable = true, length = 500)
    public String getAnnexdepict() {
        return annexdepict;
    }

    public void setAnnexdepict(String annexdepict) {
        this.annexdepict = annexdepict;
    }

    @Basic
    @Column(name = "uploadtime", nullable = true, length = 19)
    public String getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(String uploadtime) {
        this.uploadtime = uploadtime;
    }

    @Basic
    @Column(name = "totable", nullable = true, length = 30)
    public String getTotable() {
        return totable;
    }

    public void setTotable(String totable) {
        this.totable = totable;
    }

    @Basic
    @Column(name = "operatoraccount", nullable = true, length = 30)
    public String getOperatoraccount() {
        return operatoraccount;
    }

    public void setOperatoraccount(String operatoraccount) {
        this.operatoraccount = operatoraccount;
    }

    @Basic
    @Column(name = "operatorname", nullable = true, length = 30)
    public String getOperatorname() {
        return operatorname;
    }

    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname;
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
        AnnexEntity that = (AnnexEntity) o;
        return autoid == that.autoid &&
                Objects.equals(totablecode, that.totablecode) &&
                Objects.equals(savename, that.savename) &&
                Objects.equals(annextype, that.annextype) &&
                Objects.equals(annexdepict, that.annexdepict) &&
                Objects.equals(uploadtime, that.uploadtime) &&
                Objects.equals(totable, that.totable) &&
                Objects.equals(operatoraccount, that.operatoraccount) &&
                Objects.equals(operatorname, that.operatorname) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(autoid, totablecode, savename, annextype, annexdepict, uploadtime, totable, operatoraccount, operatorname, remark);
    }
}
