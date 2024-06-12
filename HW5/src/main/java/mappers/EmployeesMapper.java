package mappers;



import DTO.EmployeesDto;
import org.example.models.Employees;
import org.mapstruct.factory.Mappers;

public interface EmployeesMapper {

    EmployeesMapper INSTANCE = Mappers.getMapper(EmployeesMapper.class);


    //Get
    EmployeesDto toDeptDto(Employees j);

    //Post
    Employees toModel(EmployeesDto dto);
}
