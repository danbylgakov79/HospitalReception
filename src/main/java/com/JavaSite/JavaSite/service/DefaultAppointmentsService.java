package com.JavaSite.JavaSite.service;
import com.JavaSite.JavaSite.dto.AppointmentsDTO;
import com.JavaSite.JavaSite.entity.Appointments;
import com.JavaSite.JavaSite.exeption.ValidationException;
import com.JavaSite.JavaSite.repository.AppointmentsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

@Service
@Repository
@AllArgsConstructor
public class DefaultAppointmentsService implements AppointmentsService {

    private final AppointmentsRepository appointmentsRepository;
    private final AppointmentsConvert appointmentsConvert;




    @Override
    public AppointmentsDTO saveAppointments(AppointmentsDTO appointmentsDTO) throws ValidationException {
        validateAppointmentsDto(appointmentsDTO);
        Appointments savedUser = appointmentsRepository.save(appointmentsConvert.fromAppointmentsDtoToAppointments(appointmentsDTO));
        return appointmentsConvert.fromAppointmentsToAppointmentsDto(savedUser);
    }

    private void validateAppointmentsDto(AppointmentsDTO appointmentsDTO) throws ValidationException {
        if (isNull(appointmentsDTO)) {
            throw new ValidationException("Объект не найден");
        }
        if (isNull(appointmentsDTO.getLabID()) && isNull(appointmentsDTO.getDoctorID())) {
            throw new ValidationException("Запись отсутствует");
        }
    }

    @Override
    public void deleteAppointment(Integer id) {
        appointmentsRepository.deleteById(id);
    }


    @Override
    public List<AppointmentsDTO> findAllByDoctorID(Integer docID) {
        return  appointmentsRepository.findAllByDoctorID(docID)
                 .stream()
                .map(appointmentsConvert::fromAppointmentsToAppointmentsDto)
                .collect(Collectors.toList());
    }
    @Override
    public List<AppointmentsDTO> findAllByPatientID(Integer patientID) {
        return  appointmentsRepository.findAllByPatientID(patientID)
                .stream()
                .map(appointmentsConvert::fromAppointmentsToAppointmentsDto)
                .collect(Collectors.toList());
    }


    @Override
    public List<AppointmentsDTO> findAll() {
        return appointmentsRepository.findAll()
                .stream()
                .map(appointmentsConvert::fromAppointmentsToAppointmentsDto)
                .collect(Collectors.toList());
    }

}