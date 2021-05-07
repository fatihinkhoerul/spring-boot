package id.fatih.springbootreact.controller;

import id.fatih.springbootreact.model.DefaultResponse;
import id.fatih.springbootreact.model.dto.BiodataDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/biodata")
public class BiodataController {
    @GetMapping("/get")
    public DefaultResponse<BiodataDto> getBiodata (){
        BiodataDto biodataDto = new BiodataDto();
        biodataDto.setNama("fatih");
        biodataDto.setAlamat("bandung");
        return DefaultResponse.ok(biodataDto);
    }

    @GetMapping("/geterror")
    public DefaultResponse<BiodataDto> getBiodataError (){
        return DefaultResponse.error("Data sudah ada");
    }
}
