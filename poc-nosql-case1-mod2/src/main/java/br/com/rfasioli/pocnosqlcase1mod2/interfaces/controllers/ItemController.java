package br.com.rfasioli.pocnosqlcase1mod2.interfaces.controllers;

import br.com.rfasioli.pocnosqlcase1mod2.business.domains.Item;
import br.com.rfasioli.pocnosqlcase1mod2.business.services.ItemService;
import br.com.rfasioli.pocnosqlcase1mod2.interfaces.converters.ItemToItemDtoConverter;
import br.com.rfasioli.pocnosqlcase1mod2.interfaces.dtos.ItemDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemController {
    private final ItemService itemService;
    private final ItemToItemDtoConverter itemToItemDtoConverter;

    public ItemController(ItemService itemService,
                          ItemToItemDtoConverter itemToItemDtoConverter) {
        this.itemService = itemService;
        this.itemToItemDtoConverter = itemToItemDtoConverter;
    }

    @PostMapping
    public ResponseEntity<ItemDto> contract(@RequestBody String field) throws JsonProcessingException {
        Item item = itemService.process(field);
        return ResponseEntity.ok(itemToItemDtoConverter.convert(item));
    }

}
