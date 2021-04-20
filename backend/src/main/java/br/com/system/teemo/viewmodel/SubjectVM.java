package br.com.system.teemo.viewmodel;

public class SubjectVM {

    private Long id;
    private String subjectName;
    private Long userVM;

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

    public Long getUserVM() {
        return userVM;
    }

    public void setUserVM(Long userVM) {
        this.userVM = userVM;
    }

}
