package br.com.rfasioli.pocnosqlcase1mod2.interfaces.converters;

import br.com.rfasioli.pocnosqlcase1mod2.business.domains.Item;
import br.com.rfasioli.pocnosqlcase1mod2.interfaces.dtos.ItemDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ItemDtoToItemConverter implements Converter<ItemDto, Item> {
    @Override
    public Item convert(ItemDto source) {
        return Item.newBuilder()
                .withId(source.getId())
                .withDescription(source.getDescription())
                .withCreatedAt(source.getCreatedAt())
                .withStatus(source.getStatus())
                .build();
    }
}
