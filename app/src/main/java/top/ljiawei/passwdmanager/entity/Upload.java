package top.ljiawei.passwdmanager.entity;

/*前端参数传递类*/
public class Upload {
    private String id;
    private String passWd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassWd() {
        return passWd;
    }

    public void setPassWd(String passWd) {
        this.passWd = passWd;
    }

    public Upload() {
    }

    public Upload(String id, String passWd) {
        this.id = id;
        this.passWd = passWd;
    }
}
