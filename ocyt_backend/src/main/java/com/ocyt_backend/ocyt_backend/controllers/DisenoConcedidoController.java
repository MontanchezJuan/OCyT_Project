package com.ocyt_backend.ocyt_backend.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ocyt_backend.ocyt_backend.models.DisenoConcedido;
import com.ocyt_backend.ocyt_backend.services.DisenoConcedidoService;

@CrossOrigin
@RestController
@RequestMapping("/api/concedido")
public class DisenoConcedidoController {
    private final DisenoConcedidoService disenoConcedidoService;
 
    public DisenoConcedidoController(DisenoConcedidoService disenoConcedidoService) {
        this.disenoConcedidoService = disenoConcedidoService;
    }
     
    @GetMapping("")
    public ResponseEntity<List<DisenoConcedido>> disenoConcedidoIndex() {
        return new ResponseEntity<>(disenoConcedidoService.getAllDisenosConcedidos(), HttpStatus.OK);
    }

    @GetMapping("/ciudad")
    public ResponseEntity<List<String>> ciudadesIndex() {
        return new ResponseEntity<>(disenoConcedidoService.getAllCiudades(), HttpStatus.OK);
    }

    @GetMapping("/by-ciudad/{ciudad}")
    public ResponseEntity<List<DisenoConcedido>> disenoConcedidoByCiudad(@PathVariable String ciudad) {
        return new ResponseEntity<>(disenoConcedidoService.getDisenoConcedidoByCiudad(ciudad), HttpStatus.OK);
    }

    @GetMapping("/region")
    public ResponseEntity<List<String>> regionsIndex() {
        return new ResponseEntity<>(disenoConcedidoService.getAllRegions(), HttpStatus.OK);
    }

    @GetMapping("/by-region/{region}")
    public ResponseEntity<List<DisenoConcedido>> disenoConcedidoByRegion(@PathVariable String region) {
        return new ResponseEntity<>(disenoConcedidoService.getDisenoConcedidoByRegion(region), HttpStatus.OK);
    }
}
