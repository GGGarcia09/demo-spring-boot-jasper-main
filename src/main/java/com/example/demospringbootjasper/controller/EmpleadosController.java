package com.example.demospringbootjasper.controller;

import com.example.demospringbootjasper.model.ValoracionTriageDTO;
import com.example.demospringbootjasper.service.EmpleadosService;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@CrossOrigin("*")
@RequestMapping(value= "/api/user")
public class EmpleadosController extends HttpServlet {

    @Autowired
    private EmpleadosService service;

    @GetMapping
    private List<ValoracionTriageDTO> getEmpleados(){
        return service.getEmpleados();

    }
    @ResponseBody
    @RequestMapping(value = "/imprimir/formatoValoracionTriage", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public void getDocument(@RequestBody ValoracionTriageDTO dto, HttpServletResponse response) throws IOException, JRException {

        List<ValoracionTriageDTO> empleadosList = new ArrayList<ValoracionTriageDTO>();
        empleadosList.add(dto);
        File file = ResourceUtils.getFile("classpath:empleados.jrxml");
        JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(empleadosList);
        JasperReport jasperReport = null;
        JasperDesign jasperDesign = null;
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("gain java", "knowledge");

       // String path = getServletContext().getRealPath("/WEB-INF/");
        jasperDesign = JRXmlLoader.load(file);
        jasperReport = JasperCompileManager.compileReport(jasperDesign);
        byte[] byteStream = JasperRunManager.runReportToPdf(jasperReport, parameters, ds);
        OutputStream outStream = response.getOutputStream();
        response.setContentType("aplication/pdf");
        response.setContentLength(byteStream.length);
        outStream.write(byteStream, 0, byteStream.length);
    }
}
