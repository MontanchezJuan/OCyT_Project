package com.ocyt_backend.ocyt_backend.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ocyt_backend.ocyt_backend.models.DisenoPresentado;
import com.ocyt_backend.ocyt_backend.services.DisenoPresentadoService;

@CrossOrigin
@RestController
@RequestMapping("/api/presentado")
public class DisenoPresentadoController {
    private final DisenoPresentadoService disenoPresentadoService;

    public DisenoPresentadoController(DisenoPresentadoService disenoPresentadoService) {
        this.disenoPresentadoService = disenoPresentadoService;
    }

    @GetMapping("")
    public ResponseEntity<List<DisenoPresentado>> disenoPresentadoIndex() {
        return new ResponseEntity<>(disenoPresentadoService.getAllDisenosPresentados(), HttpStatus.OK);
    }

    @GetMapping("/ciudad")
    public ResponseEntity<List<String>> ciudadesIndex() {
        return new ResponseEntity<>(disenoPresentadoService.getAllCiudades(), HttpStatus.OK);
    }

    @GetMapping("/by-ciudad/{ciudad}")
    public ResponseEntity<List<DisenoPresentado>> disenoPresentadoByCiudad(@PathVariable String ciudad) {
        return new ResponseEntity<>(disenoPresentadoService.getDisenoPresentadoByCiudad(ciudad), HttpStatus.OK);
    }

    @GetMapping("/region")
    public ResponseEntity<List<String>> regionsIndex() {
        return new ResponseEntity<>(disenoPresentadoService.getAllRegions(), HttpStatus.OK);
    }

    @GetMapping("/by-region/{region}")
    public ResponseEntity<List<DisenoPresentado>> disenoPresentadoByRegion(@PathVariable String region) {
        return new ResponseEntity<>(disenoPresentadoService.getDisenoPresentadoByRegion(region), HttpStatus.OK);
    }
}
