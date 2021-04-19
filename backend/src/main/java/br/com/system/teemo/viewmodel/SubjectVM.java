package br.com.system.teemo.viewmodel;

public class SubjectVM {

    private Long id;
    private String subjectName;
    private UserVM userIdFk;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public UserVM getUserIdFk() {
        return userIdFk;
    }

    public void setUserIdFk(UserVM userIdFk) {
        this.userIdFk = userIdFk;
    }

}
