package entity;

import java.util.Date;

public class Templet {

    private long templateId;
    private Date createTime;
    private long id;
    private Long userId;
    private User user;

    public long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(long templateId) {
        this.templateId = templateId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public Templet() {
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Templet(long templateId, Date createTime, long id, Long userId, User user) {
        this.templateId = templateId;
        this.createTime = createTime;
        this.id = id;
        this.userId = userId;
        this.user = user;
    }
}
