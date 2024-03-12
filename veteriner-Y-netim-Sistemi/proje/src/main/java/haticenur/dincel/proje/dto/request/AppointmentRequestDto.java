package haticenur.dincel.proje.dto.request;

import haticenur.dincel.proje.entity.Animal;
import haticenur.dincel.proje.entity.Doctor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentRequestDto {

    private LocalDateTime date;
    private Doctor doctor;
    private Animal animal;
}