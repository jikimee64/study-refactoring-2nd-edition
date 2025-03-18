package refactoringjavastudy.chapter07.ch0707;

public class Person {
    protected String name;
    protected Department department;

    public Person(String name) {
        this.name = name;
    }

    // 중개자 제거하기면 필요
    // 위임 숨기기면 불필요
    public Department getDepartment() {
        return department;
    }

    // 중개자 제거하기면 불필요
    // 위임 숨기기면 필요
    public Person manager() {
        return department.getManager();
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
