package br.com.rfasioli.pocnosqlcase1mod1.interfaces.controllers;

import br.com.rfasioli.pocnosqlcase1mod1.business.domains.Item;
import br.com.rfasioli.pocnosqlcase1mod1.business.services.ItemService;
import br.com.rfasioli.pocnosqlcase1mod1.interfaces.dtos.ItemDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.core.convert.converter.Converter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemController {
    private final Converter<ItemDto, Item> itemDtoItemConverter;
    private final Converter<Item, ItemDto> itemItemDtoConverter;
    private final ItemService itemService;

    public ItemController(Converter<ItemDto, Item> itemDtoItemConverter,
                          Converter<Item, ItemDto> itemItemDtoConverter,
                          ItemService itemService) {
        this.itemDtoItemConverter = itemDtoItemConverter;
        this.itemItemDtoConverter = itemItemDtoConverter;
        this.itemService = itemService;
    }

    @PostMapping
    public ResponseEntity<String> putItem(@RequestBody ItemDto item) throws JsonProcessingException {
        return ResponseEntity.ok(itemService.process(
                itemDtoItemConverter.convert(item)));
    }

}
