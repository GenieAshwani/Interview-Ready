package LLD.FlightReservation;

public class CrewMember {
    private String name;
    private String employeeId;
    private Role role;

    public CrewMember(String name, String employeeId, Role role) {
        this.name = name;
        this.employeeId = employeeId;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
