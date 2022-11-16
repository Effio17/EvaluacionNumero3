package pe.idat.edu.service.ec3.Smitheffio;

import java.util.List;

import pe.idat.edu.dto.ec3.Smitheffio.HospitalDTORequest;
import pe.idat.edu.dto.ec3.Smitheffio.HospitalDTOResponse;

public interface HospitalService {
	void guardarHospital(HospitalDTORequest hospital);
	void actualizarHospital(HospitalDTORequest hospital);
	void eliminarHospital(Integer id);
	List<HospitalDTOResponse> listarHospital();
	HospitalDTOResponse obtenerHospitalId(Integer id);

}
