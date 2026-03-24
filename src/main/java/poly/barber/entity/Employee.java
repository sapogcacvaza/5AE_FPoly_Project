package poly.barber.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Employee {
    private int employeeID;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private boolean gender;
    private String address;
    private int positionID;
}
