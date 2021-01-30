package br.com.rfasioli.pocnosqlcase1mod4.business.services;

import br.com.rfasioli.pocnosqlcase1mod4.events.messaging.ExtendedMessagingRIAdapter;
import br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext.RemotelyInspectionEXTDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class RemotellyInspectionService {
    private static Logger logger = LoggerFactory.getLogger(RemotellyInspectionService.class);

    private final ExtendedMessagingRIAdapter extendedMessagingAdapter;

    public RemotellyInspectionService(ExtendedMessagingRIAdapter extendedMessagingAdapter) {
        this.extendedMessagingAdapter = extendedMessagingAdapter;
    }

    public void process(RemotelyInspectionEXTDTO item) throws JsonProcessingException {
        this.extendedMessagingAdapter.sendMessage(item);
    }

}
