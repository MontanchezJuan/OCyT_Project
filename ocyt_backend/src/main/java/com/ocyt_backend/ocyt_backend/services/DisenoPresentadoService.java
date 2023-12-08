package com.ocyt_backend.ocyt_backend.services;

import java.util.List;

import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.ocyt_backend.ocyt_backend.models.DisenoPresentado;
import com.ocyt_backend.ocyt_backend.repositories.DisenoPresentadoRepository;

@Service
public class DisenoPresentadoService {
    private final DisenoPresentadoRepository diseñosPresentadosRepository;

    public DisenoPresentadoService(DisenoPresentadoRepository diseñosPresentadosRepository) {
        this.diseñosPresentadosRepository = diseñosPresentadosRepository;
    }

    public List<DisenoPresentado> getAllDisenosPresentados() {
        return diseñosPresentadosRepository.findAll();
    }

    public List<String> getAllCiudades() {
        return diseñosPresentadosRepository.getAllCiudad()
                                           .orElseThrow(() -> new ResponseStatusException(HttpStatusCode.valueOf((404))));
    }

    public List<DisenoPresentado> getDisenoPresentadoByCiudad(String ciudad) {
        return diseñosPresentadosRepository.findByCiudad(ciudad)
                                           .orElseThrow(() -> new ResponseStatusException(HttpStatusCode.valueOf((404))));
    }

    public List<String> getAllRegions() {
        return diseñosPresentadosRepository.getAllRegion()
                                           .orElseThrow(() -> new ResponseStatusException(HttpStatusCode.valueOf((404))));
    }

    public List<DisenoPresentado> getDisenoPresentadoByRegion(String region) {
        return diseñosPresentadosRepository.findByRegion(region)
                                           .orElseThrow(() -> new ResponseStatusException(HttpStatusCode.valueOf((404))));
    }
}
