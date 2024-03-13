package asia.lhweb.lhmooc.model.bean;

import java.util.Date;

/**
 * 课程点赞表
 * @TableName like_course
 */
public class LikeCourse {
    /**
     * 点赞表的id
     */
    private Integer likeid;

    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 课程id
     */
    private Integer courseid;

    /**
     * 0是未点赞 1是点赞
     */
    private Integer isdelete;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 修改时间
     */
    private Date updatetime;



    /**
     * 点赞表的id
     */
    public Integer getLikeid() {
        return likeid;
    }

    /**
     * 点赞表的id
     */
    public void setLikeid(Integer likeid) {
        this.likeid = likeid;
    }

    /**
     * 用户id
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 用户id
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 课程id
     */
    public Integer getCourseid() {
        return courseid;
    }

    /**
     * 课程id
     */
    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    /**
     * 0是未点赞 1是点赞
     */
    public Integer getIsdelete() {
        return isdelete;
    }

    /**
     * 0是未点赞 1是点赞
     */
    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 修改时间
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 修改时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}