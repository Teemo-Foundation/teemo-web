package br.com.system.teemo.viewmodel;

public class UserSubjectVM {

    private Long id;
    private Long dificulty;
    private UserVM userVM;
    private SubjectVM subjectVM;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDificulty() {
        return dificulty;
    }

    public void setDificulty(Long dificulty) {
        this.dificulty = dificulty;
    }

    public UserVM getUserVM() {
        return userVM;
    }

    public void setUserVM(UserVM userVM) {
        this.userVM = userVM;
    }

    public SubjectVM getSubjectVM() {
        return subjectVM;
    }

    public void setSubjectVM(SubjectVM subjectVM) {
        this.subjectVM = subjectVM;
    }
}
