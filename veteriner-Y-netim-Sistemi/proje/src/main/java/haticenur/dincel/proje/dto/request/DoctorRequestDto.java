package haticenur.dincel.proje.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DoctorRequestDto {

    private String name;
    private String email;
    private String address;
    private String city;
    private String phone;
}