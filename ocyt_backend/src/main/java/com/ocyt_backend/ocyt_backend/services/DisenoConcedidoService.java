package com.ocyt_backend.ocyt_backend.services;

import java.util.List;

import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.ocyt_backend.ocyt_backend.models.DisenoConcedido;
import com.ocyt_backend.ocyt_backend.repositories.DisenoConcedidoRepository;

@Service
public class DisenoConcedidoService {
    private final DisenoConcedidoRepository disenoConcedidoRepository;

    public DisenoConcedidoService(DisenoConcedidoRepository disenoConcedidoRepository) {
        this.disenoConcedidoRepository = disenoConcedidoRepository;
    }

    public List<DisenoConcedido> getAllDisenosConcedidos() {
        return disenoConcedidoRepository.findAll();
    }

    public List<String> getAllCiudades() {
        return disenoConcedidoRepository.getAllCiudad()
                                           .orElseThrow(() -> new ResponseStatusException(HttpStatusCode.valueOf((404))));
    }

    public List<DisenoConcedido> getDisenoConcedidoByCiudad(String ciudad) {
        return disenoConcedidoRepository.findByCiudad(ciudad)
                                           .orElseThrow(() -> new ResponseStatusException(HttpStatusCode.valueOf((404))));
    }

    public List<String> getAllRegions() {
        return disenoConcedidoRepository.getAllRegion()
                                           .orElseThrow(() -> new ResponseStatusException(HttpStatusCode.valueOf((404))));
    }

    public List<DisenoConcedido> getDisenoConcedidoByRegion(String region) {
        return disenoConcedidoRepository.findByRegion(region)
                                           .orElseThrow(() -> new ResponseStatusException(HttpStatusCode.valueOf((404))));
    }
}
