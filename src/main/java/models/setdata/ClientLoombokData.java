package models.setdata;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Data
public class ClientLoombokData {

     String nombre;
     String apellido;
     String email;
     String telefono;
     String direccion;
     String ciudad;
     String codigo;
     String pais;
     String region;


    public static List<ClientLoombokData> setData(DataTable dataTable) {
        List<ClientLoombokData> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, ClientLoombokData.class));
        }
        return dates;

    }

}
