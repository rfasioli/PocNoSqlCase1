package br.com.rfasioli.pocnosqlcase1mod4.interfaces.controllers;

import br.com.rfasioli.pocnosqlcase1mod4.business.services.RemotellyInspectionService;
import br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext.helpers.RemotelyInspectionEXTDTOHelper;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inspection")
public class RemotellyInspectionController {
    private final RemotellyInspectionService remotellyInspectionService;

    public RemotellyInspectionController(RemotellyInspectionService remotellyInspectionService) {
        this.remotellyInspectionService = remotellyInspectionService;
    }

    @PostMapping
    public ResponseEntity<String> putItem() throws JsonProcessingException {
        remotellyInspectionService.process(
                RemotelyInspectionEXTDTOHelper.build());
        return ResponseEntity.ok("");
    }

}
